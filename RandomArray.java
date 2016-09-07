package Array;

import java.util.Scanner;
import java.util.Random;

public class RandomArray {
	
	int array[];
	int arraySize, sum = 0, max = 0;
	float average;
	
	public RandomArray(int size){
		arraySize = size;
		array = new int[arraySize];
	}
	public void getVal(){
		Random rand = new Random();
		for ( int x = 0; x < arraySize; x++ ){
			array[x] = rand.nextInt(50);
		}
	}
	
	public void show(){
		System.out.println("Values of your Random Array:");
		for ( int b = 0; b < arraySize; b++ ){
			System.out.println( "Index["+b+"]: " + array[b]);
		}
	}
	public void getSum(){
		for ( int i = 0; i < arraySize; i++){
			sum += array[i];
		}
		System.out.println("The Sum of the Values is: " + sum);
	}
	public void getAve(){
		average = sum / array.length;
		System.out.println("Average: " + average);
	}
	public void getMax(){
		for( int a = 0; a < arraySize; a++ ){
			if( array[a] > max )
				max = array[a];
		}
		System.out.print("Maximum: " + max);
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int size;
		System.out.print("Please enter Array Size:");
		size = input.nextInt();
		
		RandomArray array = new RandomArray(size);
		array.getVal();
		System.out.println();
		array.show();
		System.out.println();
		array.getSum();
		System.out.println();
		array.getAve();
		System.out.println();
		array.getMax();
	}
}
