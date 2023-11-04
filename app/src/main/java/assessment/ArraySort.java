package assessment;

import java.util.Random;

public class ArraySort {

    public ArraySort(int size) {
        int[] testArray = fillArray(size);
        outputArray(testArray);
        System.out.println("Line of Break");
        sortArray(testArray);
        outputArray(testArray);
    }

    private int[] sortArray(int[] array) {
        //start going through the array finding the smallest number
        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if (second < first) {
                    swap(array, i, j);
                    first = second;
                }
            }
        }
        // start on position 2 do the same till array is sorted
        return array;
    }

    private void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private int[] fillArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(1000);
            array[i] = number;
        }
        return array;
    }

    protected void swap(int[] array, int pos1, int pos2) {
        int chache = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = chache;
    }

    public static void main(String[] args) {
        ArraySort test = new ArraySort(10);
    }

}
