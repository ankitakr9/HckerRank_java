//import java.io.*;
import java.util.*;
//Given a string , print Yes if it is a palindrome, print No otherwise.
public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reveresed = new StringBuilder(A).reverse().toString();
        if (A.equals(reveresed)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    sc.close();
    }
}




