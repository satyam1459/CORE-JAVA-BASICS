import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1{
    static int countDigits(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    static boolean isArmstrong(int n){
        int noDigits=countDigits(n);
        int temp=n,sum=0;
        for(int i=1;i<=noDigits;i++){
            int digit=n%10;
            sum=sum+(int)Math.pow(digit,noDigits);
            n/=10;
        }
        if(temp==sum)
            return true;
         else
             return false;
    }
    
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=x;i<=y;x++){
            isArmstrong(i);
        }
    }
}