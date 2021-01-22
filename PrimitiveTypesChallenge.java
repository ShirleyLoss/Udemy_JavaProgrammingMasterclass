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
      long myLong = 50000 + 10 * (long)(myByte + myShort + myInt);
      System.out.println("The long number is " + myLong);
  
  }

}

// When it comes to long number, remember Casting.
