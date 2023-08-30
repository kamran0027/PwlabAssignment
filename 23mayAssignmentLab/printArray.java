
import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("enter the array element:");
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Array element are:");
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
