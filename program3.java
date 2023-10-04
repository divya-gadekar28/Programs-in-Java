//Write a Java Program to reverse a string without using String inbuilt function reverse().
import java.util.Scanner;
class Main{
 
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        str = in.nextLine();
        String[] token = str.split("");    //used split method to print in reverse order
        for(int i=token.length-1; i>=0; i--)
        {
            System.out.print(token[i]);
        }
         
    }
 
}


