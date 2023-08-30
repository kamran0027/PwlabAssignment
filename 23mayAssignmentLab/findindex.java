
import java.util.Scanner;

public class findindex {
    public static int index(int arr[],int n,int target){
        for (int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=in.nextInt();
        int [] arr =new int[n];
        System.out.println("enter the array element:");
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the elemnt whoes index to be find:");
        int target=in.nextInt();
        int result=index(arr,n,target);
        if(result==-1){
            System.out.println("element not present:");
        }
        else{
            System.out.println("element found at index:"+result);
        }


    }
}
