# RSA Assignment

### Description
This assignment was designed to solve the following problem from Dr Elena Strzheletska

### Problem 1:
Alice’s RSA public key isP= (e,n) = (13,77).  Bob sends Alice the message by encoding itas follows.  First he assigns numbers to characters:  A is 2, B is 3, ..., Z is 27, and blank is 28.  Then he uses RSA to encode each number separately.
Bob’s encoded message is:

10       7      58      30      23      62
7      64      62      23      62      61
7      41      62      21       7      49
75       7      69      53      58      37
37      41      10      64      50       7
10      64      21      62      61      35
62      61      62       7      52      10
21      58       7      49      75       7
62      26      22      53      30      21
10      37      64

Decode Bob’s message.  

Notice that you don’t have Bob’s secrete key, so you need to “break” RSA todecrypt his message.For the solution, you need to provide the following:

- Describe step by step how you arrived at the solution.  In particular, explain how you determinedp,q,φ(n), andd.
- Show the calculation that determines the first three letters in the message from the first three numbersin ciphertext.
- Give Bob’s message in plaintext.  The message is a quote.  Who said it?  What does it mean?
- If you wrote a program, attach your code to the hard copy. If you solved it by hand (not recommended),attach your scratch paper with calculations for at least 5 first letters.

Suggestion:  this can be solved by hand, but it will probably be faster to write a short program.
