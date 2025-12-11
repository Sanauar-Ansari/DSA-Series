
import java.util.Scanner;

public class Array {

// function to print array
    public static void printArray(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]*2+" ");
        }
    }

 // to Take input
      public static void takeInput(){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=src.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
        System.out.println("Enter "+i +" Element: ");
        arr[i]=src.nextInt();
        }
          printArray(arr);
    }

    // Q1. Print only -ve value
    public static void printNegativeValue(){
         int[] arr={1,-2,3,-4,5,-6,7,-8};
         for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
            System.out.println(arr[i]);
           }
    }
    }
   // Q2. Print sum of array
        public static int sumOfTheArray(int [] arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        } 
        return sum;
    }

       // Q3. Print sum of array
        public static int lasrgestElement(int [] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        } 
        return max;
    }


public static void main(String[] args) {
    int arr[]={1,2,3,4,50,6,-21};
    // printArray(arr);
    // takeInput();

   
 int sum= lasrgestElement(arr);
 System.out.println(sum);
   


  

}
}
