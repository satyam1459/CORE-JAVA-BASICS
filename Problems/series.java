import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class series {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n,i,b,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(b=1;b<=n-i;b++)
                System.out.print("  ");
            for(j=1;j<=i;j++)
                System.out.print(" "+j);
            System.out.println();
        }
    }
}