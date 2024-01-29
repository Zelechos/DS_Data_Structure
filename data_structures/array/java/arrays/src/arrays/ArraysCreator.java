package arrays;

import java.util.Arrays;

public class ArraysCreator {

    public ArraysCreator() {
    }
    public static <T> String visualizerArrays(T[] currentArray){
        return Arrays.toString(currentArray);
    }
    public static Integer[] getArrayOfIntegersValues() {
        Integer[] myValues = new Integer[3];
        myValues[0] = 3;
        myValues[1] = 6;
        myValues[2] = 9;
        return myValues;
    }

    public static String[] getArrayOfStringValues() {
        String[] myValues = new String[3];
        myValues[0] = "first";
        myValues[1] = "second";
        myValues[2] = "third";
        return myValues;
    }

    public static Boolean[] getArrayOfBooleanDefaultValues() {
        Boolean[] myValues = {true, false, true, true, false};
        return myValues;
    }

    public static Byte[] getArrayOfByteDefaultValuesInLineVariable(){
        return new Byte[]{1, 5, 8, 9, 0};
    }
}
