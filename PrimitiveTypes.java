public class PrimitiveTypes{

  public static void main(String[] args){
    
    int myValue = 10000;
    
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximum Value = " + myMaxIntValue);
    
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
    System.out.println("Busted MIN value = " + (myMinIntValue - 1));
    
    int myMaxIntTest = 2_147_483_647;
    
  }

}

/* Primitive types in Java: the most basic data types. Int is one of eight primitives types.
 * Eight primitive data types in Java: boolean, byte, char, short, int, long, float and double. Consider them as the building blocks of data manipulation
 **/
 
/* Java Packages: a way to organize your Java projects. For now, consider them as folders with learnprogramming in our example being a subfolder of academy.
 *    Companies use their domain names reversed.
 *      So learnprogramming.academy becomes academy.learnprogramming - more on it later.
 **/
 
/* Wrapper classes: Java uses the concept of a Wrapper class for all eight primitive types.
 *    In the case of an int, we can use Integre, and by doing that it gives us ways to perform operations on an int.
 *    Eg. Using MIN_VALUE and MAX_VALUE to get Java to. tell us the minimum and maximum ranges of numbers that can be stored.
 **/
 
/* Overflow and Underflow in Java: if you try and put a value larger than the maximum value in Java, or a value smaller than the minimum value in Java, 
 *    then you will get an Overflow in the case of. the maximum value or an Underflow in the case of the minimum.
 *    The computer just ckips back to the munimum or the maximum number, which is usually not what you want.
 **/
 
/* Running Result:
 * Integer Minimum Value = -2147483648
 * Integer Maximum Value = 2147483647
 * Busted MAX value = -2147483648
 * Busted MIN value = 2147483647
 **/
 
