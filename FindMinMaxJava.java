package findminmax.java;

import java.util.Scanner;

public class FindMinMaxJava {
    
    public static void main(String[] args){
        int[] numbers = { 23, 35, 123, 12412, 1345 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < numbers.length; i ++ ){
            if (min > numbers[i])
                min = numbers[i];
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println("Smallest number is "+ min );
        System.out.println("Largest number is "+ max );

             
    }
    
}

