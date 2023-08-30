
import java.util.Scanner;

public class sumofAllElemntinArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=in.nextInt();
        int [] a=new int[n];
        System.out.println("enter the array element:");
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("the sum array is: "+sum);

    }
}
