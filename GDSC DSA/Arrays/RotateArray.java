import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int N;
        int D;
        
        //N is the no. of elements in the array
        System.out.println("Enter the value of N: ");
        Scanner input= new Scanner(System.in);
        N= input.nextInt();

        //D elements have to rotated
        System.out.println("Enter the value of D: ");
        D= input.nextInt();

        int[] arr= new int[N];

        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<N;i+=1){
            //Scanner input = new Scanner(System.in);
            arr[i]=input.nextInt();
        }

        rotateArr(N,D,arr);
        System.out.println(Arrays.toString(arr));

        input.close();
    }
    
    static void rotateArr(int N,int D,int[] arr){

        int[] temp= new int[D];
        //storing the elements to be roated
        for (int i=0;i<D;i+=1){
            temp[i]=arr[i];    
        }

        //shifting the array
        for (int i=D;i<N;i+=1){
            arr[i-D]=arr[i];
            
        }

        //paasing the initial elements at the end
        for (int i=0;i<D;i+=1){
            arr[N+i-D]=temp[i];
        }
        
    }
}
