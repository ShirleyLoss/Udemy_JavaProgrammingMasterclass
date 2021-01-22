public class CastingInJava{

  public static void main(String[] args){
    
    int myMinIntValue = Integer.MIN_VALUE;
    byte myMinByteValue = Byte.MIN_VALUE;
    short myMinShortValue = Short.MIN_VALUE;

    int myTotal = (myMinIntValue / 2);
    byte myNewByteValue = (byte)(myMinByteValue / 2);
    short myNewShortValue = (short)(myMinShortValue / 2);
    
  }

}

/* In Java: the default whole number used by Java is an int.
 * Casting: To treat or convert a number from one type to another. WAe put the type we want the number to be in parenthesis like this:
 * (byte)(myMinByteValue/2);
 * Other languages also have Casting, not just Java.
