package org.example;

public class BinarySearchAlgoProblem {
    public static void main(String[] args) {

        int [] numbers={1,2,3,4,5,6,7,8,9,10};
        int a=binarySerach( numbers, 7);
        System.out.println(a+ " the index position  ");

    }

    public static int binarySerach(int [] numbers, int numberToFind) {
        int low = 0; // the first index
        int high = numbers.length - 1; // the last index of the given array

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleValue = numbers[middlePosition];
            if (numberToFind == middleValue) {
                return middlePosition;
            } else if (numberToFind < middleValue) {
                high = middlePosition - 1;
            } else if (numberToFind > middleValue) {
                low = middlePosition + 1;
            } else {
                System.out.println("Not found ");
            }
        }
        return -1;
    }
}