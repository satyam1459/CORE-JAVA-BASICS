
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class steps {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int steps=sc.nextInt();
        while(n>=0){
            if(n%2==0){
                n/=2;
                steps+=2;
            }
            else if(n%3==0){
                n/=3;
                steps+=3;
            }
            else if(n%5==0){
                n/=5;
                steps+=5;
            }
            else
                break;
        }
        System.out.println(steps);
         System.out.println(n);
    }
}