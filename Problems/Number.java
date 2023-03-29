import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Number {
    static void formNum(int n){
        Scanner sc=new Scanner(System.in);
    int sum=0;
        while(n>0){
        int x=sc.nextInt();
        sum=sum*10+x;
        n--;
    }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        formNum(x);
    }
}