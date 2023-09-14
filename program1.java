//java program to accept array elements and display sum of all array elements(1-D array)
import java.util.*;
class program1{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements: ");
        n=sc.nextInt();
        int arr[]=new int[5];
        System.out.println("Enter "+n+" elements:-");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Displaying elements:-");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Sum of all the elements of an array is ");
        for(i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}