# RSA Assignment

### Description
This assignment was designed to solve the following problem from Dr Elena Strzheletska.

### Problem 1:
Alice’s RSA public key isP= (e,n) = (13,77).  Bob sends Alice the message by encoding itas follows.  First he assigns numbers to characters:  A is 2, B is 3, ..., Z is 27, and blank is 28.  Then he uses RSA to encode each number separately.
Bob’s encoded message is:

10&nbsp;&nbsp; 7&nbsp;&nbsp;  58&nbsp;&nbsp;  30&nbsp;&nbsp;  23&nbsp;&nbsp;  62\
7&nbsp;&nbsp;  64&nbsp;&nbsp; 62&nbsp;&nbsp;  23&nbsp;&nbsp;  62&nbsp;&nbsp;  61\
7&nbsp;&nbsp;  41&nbsp;&nbsp; 62&nbsp;&nbsp;  21&nbsp;&nbsp;  7&nbsp;&nbsp;   49\
75&nbsp;&nbsp; 7&nbsp;&nbsp;  69&nbsp;&nbsp;  53&nbsp;&nbsp;  58&nbsp;&nbsp;  37\
37&nbsp;&nbsp; 41&nbsp;&nbsp; 10&nbsp;&nbsp;  64&nbsp;&nbsp;  50&nbsp;&nbsp;  7\
10&nbsp;&nbsp; 64&nbsp;&nbsp; 21&nbsp;&nbsp;  62&nbsp;&nbsp;  61&nbsp;&nbsp;  35\
62&nbsp;&nbsp; 61&nbsp;&nbsp; 62&nbsp;&nbsp;  7&nbsp;&nbsp;   52&nbsp;&nbsp;  10\
21&nbsp;&nbsp; 58&nbsp;&nbsp; 7&nbsp;&nbsp;   49&nbsp;&nbsp;  75&nbsp;&nbsp;  7\
62&nbsp;&nbsp; 26&nbsp;&nbsp; 22&nbsp;&nbsp; 53&nbsp;&nbsp;  30&nbsp;&nbsp;  21\
10&nbsp;&nbsp; 37&nbsp;&nbsp; 64

Decode Bob’s message.  

Notice that you don’t have Bob’s secrete key, so you need to “break” RSA todecrypt his message.For the solution, you need to provide the following:

- Describe step by step how you arrived at the solution.  In particular, explain how you determined p, q, φ(n), and d.
- Show the calculation that determines the first three letters in the message from the first three numbers in cipher text.
- Give Bob’s message in plaintext.  The message is a quote.  Who said it?  What does it mean?
- If you wrote a program, attach your code to the hard copy. If you solved it by hand (not recommended), attach your scratch paper with calculations for at least 5 first letters.

Suggestion:  this can be solved by hand, but it will probably be faster to write a short program.
