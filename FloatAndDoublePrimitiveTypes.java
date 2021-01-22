public class FloatAndDoublePrimitive{

  public static void main(String[] args){
  
     float myMinFloatValue = Float.MIN_VALUE;
     float myMaxFloatValue = Float.MAX_VALUE;
     System.out.println("Float minimum value = " + myMinFloatValue);
     System.out.println("Float maximum value = " + myMaxFloatValue);
     
     double myMinDoubleValue = Double.MIN_VALUE;
     double myMaxDoubleValue = Double.MAX_VALUE;
     System.out.println("Double minimum value = " + myMinDoubleValue);
     System.out.println("Double maximum value = " + myMaxDoubleValue);
  
  }

}

// Floating point numbers: have fractional parts that we express with a decimal point.

/* Percision: Refers to the format and amount of space occupied by the type.
 * Single precision occupies 32 bits (so has a width of 32) and a Double precision occupies 64 bits (and thus has a width of 64).
 * Float has a range from 1.4E-45 to 3.4028235E+38 and the double is much more precise with a range from 4.9E-324 to 1.7976931348623157E+308.
 **/
 
 /* Running Results:
  * Float minimum value = 1.4E-45
  * Float maximum value = 3.4028235E38
  * Double minimum value = 4.9E-324
  * Double maximum value = 1.7976931348623157E308
  **/
