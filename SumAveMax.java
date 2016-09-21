package sumavemax;

import java.util.Scanner;
import java.util.Random;

public class SumAveMax {
    
    int array[];
    int arraySize, sum, max = 0;
    float average;
    
    public SumAveMax(int size){
        arraySize = size;
        array = new int[arraySize];
    }
    public void getVal(){
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++ ){
            array[i] = rand.nextInt(1000);
        }
    }
    public void show(){
        System.out.println("These are the Random Values of your Array: ");
        for ( int x = 0; x < arraySize; x++ ){
            System.out.println("Index [" + x + "]" + array[x]);
        }
    }
    public void getSum(){
        for( int a = 0; a < arraySize; a++ ){
            sum += array[a];
        }
        System.out.println("The Sum of the values is " + sum);
    }
    public void getAve(){
            average = (float) sum / array.length;
            System.out.println("AVERAGE: " + average);
    }
    public void getMax(){
        for( int b = 0; b < arraySize; b++ ){
            if ( array[b] > max )
                max = array[b];
        }
        System.out.println("MAXIMUM: " + max);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Please enter Array Size: ");
        size = input.nextInt();
        
        SumAveMax array = new SumAveMax(size);
        array.getVal();
        System.out.println();
        array.show();
        System.out.println();
        array.getSum();
        System.out.println();
        array.getAve();
        System.out.println();
        array.getMax();
        System.out.println();
    }
    
}
