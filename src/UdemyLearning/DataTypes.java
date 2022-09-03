package UdemyLearning;

public class DataTypes {

    public static void main(String[] args) {

        //DataTypes
        int integerValue = 10;
        short shortValue = 5000;
        byte byteValue = 127;
        long longValue = 1000000000000000000L;
        float floatValue = 45.04f;
        double doubleValue = 3.14888;
        char charValue = 'R';
        boolean booleanValue = true;

        //Printing integer with byte value
        System.out.println("The printing value of byte: " + (int) byteValue);

        //Print double value
        int intFromDouble = (int) doubleValue;
        System.out.println("Converted double value is: " + intFromDouble);
    }
}
