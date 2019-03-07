package edu.research.ksm;

import java.util.Random;

import edu.research.ksm.sorting.QuickSort;

public class App
{

    private int sizeArray = 100000000;
    private int[] bigArray = new int[sizeArray];

    public int[] getBigArray() {
        for(int i = 0; i < bigArray.length; i++){
            bigArray[i] = randomFill();
        }

        return bigArray;
    }

    private int randomFill() {
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum & Integer.MAX_VALUE;
    }

    public static int getMaxValue(int[] arr) {
        int maxValue = arr[0];

        for(int i=1; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    public static int getMinValue(int[] arr) {
        int minValue = arr[0];

        for(int i=1; i< arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        App app = new App();

        int[] bigArr = app.getBigArray();
        int sizeArr = bigArr.length;

        System.out.println("Before sorting " + bigArr[0] + " " + bigArr[sizeArr - 1]);

        QuickSort sorter = new QuickSort(bigArr);

        System.out.println("After sorting " + bigArr[0] + " " + bigArr[sizeArr - 1]);

        System.out.println("Max Value " + getMaxValue(bigArr));
        System.out.println("Min Value " + getMinValue(bigArr));
    }
}
