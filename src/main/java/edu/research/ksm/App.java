package edu.research.ksm;

import java.util.Random;


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

    public int randomFill() {
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }

    public static void main( String[] args )
    {
        App app = new App();

        System.out.println(app.getBigArray()[0]);

        // System.out.println( "Hello World!" );
    }
}
