public class Main {
    // byte
    private static byte myByte = 10;

    // short
    private static short myShort = 500;

    // int
    private static int myInt = 10000;

    // long
    private static long myLong = 15000L;

    // float
    private static float myFloat = 20.0f;

    // double
    private static double myDouble = 30.0;

    // boolean
    private static boolean myBoolean = true;

    // char
    private static char myChar = 'A';

    public static void main(String[] args){
        Object[] myVariables = {myByte, myShort, myInt, myLong, myFloat, myDouble, myBoolean, myChar};
        for (Object var : myVariables) {
            System.out.println(var);
        }
    }
}