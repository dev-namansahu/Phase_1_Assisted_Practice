package practice_projects;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting
        int intValue = 100;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);

        // Explicit Casting
        double doubleVal = 123.456;
        float floatVal = (float) doubleVal; // double to float
        long longVal = (long) floatVal; // float to long
        int intVal = (int) longVal; //  long to int

        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + doubleVal);
        System.out.println("float value: " + floatVal);
        System.out.println("long value: " + longVal);
        System.out.println("int value: " + intVal);
    }}
