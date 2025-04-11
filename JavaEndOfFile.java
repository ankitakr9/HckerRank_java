//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class JavaEndOfFile {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count = 0;

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
        String linea = scanner.nextLine();
        count ++;
        System.out.println(count +" "+linea);
        }
        scanner.close();
    }
}

