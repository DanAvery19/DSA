
import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
    
    int array[];
    int arraySize, search, find = 0;
    
    public LinearSearch(int size){
        arraySize = size;
        array = new int[arraySize];
    }

    public void randomVal(){
        Random rand = new Random();
        for ( int x = 0; x < arraySize; x++ ){
            array[x] = rand.nextInt(1000);
        }
    }
    
    public void show(){
        int spaceLim = 0;
        System.out.println("Values of your Random Array:");
        for ( int b = 0; b < arraySize; b++ ){
            System.out.print( "["+b+"]: " + array[b] + "\t");
            spaceLim += 1;
            if ( spaceLim == 5 ){
                System.out.println();
                spaceLim = 0;
            }
        }
        System.out.println();
    }
    
    public void search(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the # you want to search: ");
        search = input.nextInt();
    } 
    public void Find(){
        for ( find = 0; find < array.length; find++ ){
         if( array[find] == search )
                System.out.println("The element # " + search + " is in' the Index[" + find + "]. ");
         if( find == array.length-1 )
            System.out.println("The search element is not in the Array Random Values.");
        }
    }
   
            
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       int size;
       System.out.print("Please enter size of the Array: ");
       size = input.nextInt();
       
       LinearSearch array = new LinearSearch(size);
       
       array.randomVal();
       array.show();
       array.search();
       array.Find();
      
    }
    
}
