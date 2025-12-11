
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


public static void main(String[] args) {
    // int arr[]={1,2,3,4,5,6};
    // printArray(arr);
    // takeInput();
   


  

}
}
