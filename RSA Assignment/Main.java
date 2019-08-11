/*
 * Program Specifications:
 * This program was created to decipher an encoded RSA code.
 * The following problem was given.
 * Problem 1: Alice’s RSA public key isP= (e,n) = (13,77).  Bob sends Alice the message by encoding it
 * as follows.  First he assigns numbers to characters:  A is 2, B is 3, ..., Z is 27, and blank is 28.  Then he uses
 * RSA to encode each number separately.
 * 
 * Bob’s encoded message is:
 * 10       7      58      30      23      62
 * 7      64      62      23      62      61
 * 7      41      62      21       7      49
 * 75       7      69      53      58      37
 * 37      41      10      64      50       7
 * 10      64      21      62      61      35
 * 62      61      62       7      52      10
 * 21      58       7      49      75       7
 * 62      26      22      53      30      21
 * 10      37      64
 * 
 * Decode Bob’s message.  Notice that you don’t have Bob’s secrete key, so you need to “break” RSA to decrypt his message.
 * For the solution, you need to provide the following:
 * Describe step by step how you arrived at the solution.  In particular, explain how you determined p, q, φ(n), and d.
 * Show the calculation that determines the first three letters in the message from the first three numbers in cipher text.
 * Give Bob’s message in plain text.  The message is a quote.  Who said it?  What does it mean?
 * If you wrote a program, attach your code to the hard copy. If you solved it by hand (not recommended),
 * attach your scratch paper with calculations for at least 5 first letters.
 */

import java.math.BigInteger;
import java.lang.Math;
import java.util.*;

public class Main {
   public static void main(String args[]) {
      //Initialize the variables that we will be using
      BigInteger m, bigN;
      int p, q, e, n, d, phi_n;
      int[] encryption = {10, 7, 58, 30, 23, 62,
                           7, 64, 62, 23, 62, 61,
                           7, 41, 62, 21, 7, 49,
                           75, 7, 69, 53, 58, 37,
                           37, 41, 10, 64, 50, 7,
                           10, 64, 21, 62, 61, 35,
                           62, 61, 62, 7, 52, 10,
                           21, 58, 7, 49, 75, 7,
                           62, 26, 22, 53, 30, 21,
                           10, 37, 64};
      List<Integer> decryption = new ArrayList<Integer>();
      
      //First assign known variables
      e = 13;
      n = 77;
      
      //Since n = 77, the prime numbers that are in the factors of 77 are 7 and 11
      p = 7;
      q = 11;
      
      //To calculate phi(n), we use the formula phi(n) = (p - 1)(q - 1)
      phi_n = (p - 1) * (q - 1);
      
      d = calculateInverseMod(e, phi_n);
      
      //Because we will be working with a huge integer, Java's BigInteger library is required.
      bigN = BigInteger.valueOf(n);
      
      // Cycle through every element in Bob's encrypted message and decrypt is using the following formula
      // m = c^d(mod n), where m is the decrypted message and c is the encrypted message
      // Insert the decrypted message into a list of integer
      for (int i = 0; i < encryption.length; i++) {
         BigInteger decrypted;
         m = BigInteger.valueOf(encryption[i]);
         decrypted = m.pow(d);
         decrypted = decrypted.mod(bigN);
         //decryption[1] = decrypted.intValue();
         decryption.add(decrypted.intValue());
      }
      
      // Cycle through every element in the decrypted list of Bob's message and print them out according
      // to the integers to characters. i.e. A = 2, B = 2, ... Z = 27, and (space) = 28
      for (int i = 0; i < decryption.size(); i++) {
         int temp = decryption.get(i);
         
         switch(temp) {
            case 2:
               System.out.print("A");
               break;
            case 3:
               System.out.print("B");
               break;
            case 4:
               System.out.print("C");
               break;
            case 5:
               System.out.print("D");
               break;
            case 6:
               System.out.print("E");
               break;
            case 7:
               System.out.print("F");
               break;
            case 8:
               System.out.print("G");
               break;
            case 9:
               System.out.print("H");
               break;
            case 10:
               System.out.print("I");
               break;
            case 11:
               System.out.print("J");
               break;
            case 12:
               System.out.print("K");
               break;
            case 13:
               System.out.print("L");
               break;
            case 14:
               System.out.print("M");
               break;
            case 15:
               System.out.print("N");
               break;
            case 16:
               System.out.print("O");
               break;
            case 17:
               System.out.print("P");
               break;
            case 18:
               System.out.print("Q");
               break;
            case 19:
               System.out.print("R");
               break;
            case 20:
               System.out.print("S");
               break;
            case 21:
               System.out.print("T");
               break;
            case 22:
               System.out.print("U");
               break;
            case 23:
               System.out.print("V");
               break;
            case 24:
               System.out.print("W");
               break;
            case 25:
               System.out.print("X");
               break;
            case 26:
               System.out.print("Y");
               break;
            case 27:
               System.out.print("Z");
               break;
            case 28:
               System.out.print(" ");   
               break;
            default:
               System.out.print("(Invalid!)");
               break;
         }
      }
   }
   
   /*
    * To calculate the inverse mod of two given integer, we can convert a^-1(mod m) to the
    * following equation. ax(mod m) = 1, where x is an integer. Our goal is to find an integer
    * x that is congruent to 1. Therefore in this function, all we need to do is to find a variable
    * x that satisfy the following conditions.
    * 
    * Pseudocode:
    * Let x go through every integer starting from 1
    * if a*x(mod m) = 1, return x.
    */
   public static int calculateInverseMod(int e, int phi_n) {
      int x;
      
      for (x =  0; x < phi_n; x++) {
         if ((e * x) % phi_n == 1) {
            return x;
         }
      }
      
      return x;
   }
   
   
}
