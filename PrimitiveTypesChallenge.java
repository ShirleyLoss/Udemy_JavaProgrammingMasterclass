/* Chanllenge
 * Create a byte variable and set it to any valid byte number.
 * Create a short variable and set it to any valid short number.
 * Create an int variable and set it to any valid int number.
 * Create a variable of type long and. make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values.


public class PrimitiveTypesChallenge{
  
  public static void main(String[] args){
  
      byte myByte = 32;
      short myShort = 28475;
      int myInt = 242_345_231;
      
      long longTotal = 50000L + 10L * (myByte + myShort + myInt);
      long longTotal2nd = 50000 + 10 * (long)(myByte + myShort + myInt);
      short shortTotal = (short)(1000 + 10 * (myByte + 278));
      System.out.println("The long number is " + longTotal);
      System.out.println("The long number is " + longTotal2nd);
      System.out.println("The short number is " + shortTotal);
  
  }

}

// When it comes to long number, remember Casting. Both two method works.

/* Running Result:
 * The long number is 2423787380
 * The long number is 2423787380
 * The short number is 4100
 **/
