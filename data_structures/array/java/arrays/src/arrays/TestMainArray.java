package arrays;

public class TestMainArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays package!");
        System.out.println(ArraysCreator.visualizerArrays(ArraysCreator.getArrayOfIntegersValues()));
        System.out.println(ArraysCreator.visualizerArrays(ArraysCreator.getArrayOfStringValues()));
        System.out.println(ArraysCreator.visualizerArrays(ArraysCreator.getArrayOfBooleanDefaultValues()));
        System.out.println(ArraysCreator.visualizerArrays(ArraysCreator.getArrayOfByteDefaultValuesInLineVariable()));
    }
}

