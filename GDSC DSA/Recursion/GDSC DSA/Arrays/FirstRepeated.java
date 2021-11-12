import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
public class FirstRepeated{
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
    
        int[] arr= new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<n;i+=1){
            arr[i]=input.nextInt();
            }
        input.close();
        

        int[] temp=new int[n];
        for (int i=0;i<n;i+=1){
            temp[i]=arr[i];
            }

        Arrays.sort(temp);

        countConcurrences(temp);
        }

        static int binarysearch(int[] arr,int x){
            int s=0;
            int e= arr.length-1;

            while(s<=e){
                int mid= s+ (e-s)/2;
                if(x<arr[mid]){
                    e=mid-1;
                }
                else if(x>arr[mid]){
                    s=mid+1;
                    }
                else{
                    return mid;
                    }
                }
            return -1;
        }

        static int countConcurrences(int[] arr){
            int count;

            for(int i=0;i<arr.length;i++){
                if (arr[i]==-1){
                    return 0;
                }
    
                count=1;
                int left = 0;
                
                while (left >= 0 && arr[left] == arr[i]){
                count++;
                left--;
            }
    
                int right = arr.length + 1;
                while (right < arr.length && arr[right] == arr[i]){
                    count++;
                    right++;
                    }
            }
        return count;
        }
}

    
