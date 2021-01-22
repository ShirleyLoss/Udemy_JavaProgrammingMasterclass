public class ByteShortLongAndWidth{

  public static void main(String[] args){
    
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);
    
    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Maximum Value = " + myMaxShortValue);
    
    long myLongValue = 100L;
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value = " + myMinLongValue);
    System.out.println("Long Maximum Value = " + myMaxLongValue);
    
  }

}

/* Size of Primitive Types and Width: 
 * A byte occupies 8 bits. 
 *    A bit is not directly represented in a primitive type - We have a boolean which is not really the same thing that we will discuss in a future video.
 *    So a Byte occupies 8 bits. We say that a byte has a width of 8.
 * A short can store a large range of numbers and occupies 16 bits. And havs a width of 16.
 * An int, has a much larger range. as we know, and occupies 32 bits, and has a width of 32.
 * Each primitive type occupies a different amount of memory - Eg. an int needs four times the amount of space, than a byte does for example.
 * This could come up as. an interview question, and it's useful to know that certain data types take up more space than others.
 **/
 
 /* In long value, need to put letter "L" on the end of it, and that tells the computer that it's going value.
  *     It doesn't matter if you put lowercase "l", or uppercase"L". "L" is clearier for reading code.

/* Running Result:
 * 
