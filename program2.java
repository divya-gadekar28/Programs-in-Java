//java program to perform addition of 2 matrix(2D Array)
import java.util.Scanner;
import java.util.Arrays;

public class program2 {
    public static void main(String[] args){
    int i,j,row,col;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("how many rows?");
    row=sc.nextInt();
    System.out.println("how many columns?");
    col=sc.nextInt();

    int arr1[][]=new int[row][col];
    int arr2[][]=new int[row][col];
    int arr3[][]=new int[row][col];
    
    System.out.println("enter element for array1:");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            System.out.println("Enter value for [" + i + "][" + j + "]: ");
            arr1[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter element for array2:");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            System.out.println("Enter value for [" + i + "][" + j + "]= ");
            arr2[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            arr3[i][j]=arr1[i][j]+arr2[i][j];    //performing addition
        }
    }
    System.out.println("Array1:");
    System.out.println(Arrays.deepToString(arr1)); 

    System.out.println("Array2:");
    System.out.println(Arrays.deepToString(arr2));


    System.out.println("Addition of both the matrix is:-");
    System.out.println(Arrays.deepToString(arr3));

}
}
