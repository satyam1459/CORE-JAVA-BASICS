package Array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i ++) arr[i] = scn.nextInt();

    String[] str = new String[n];
    for(int i = 0; i < n; i ++) str[i] = arr[i] + "";

    Arrays.sort(str);
   
    for(int i = str.length - 1; i >= 0; i --) 
   
    System.out.print(str[i]+" ");
}

public static void lexiSort(String[] str) {
    int n = str.length;
    for(int itr = 1; itr < n; itr ++) {
        for(int j = 0; j < n - itr; j ++) {
            if(str[j].compareTo(str[j + 1]) > 0) swap(str, j, j + 1);
        }
    }
}

public static boolean isGreater(String a, String b) {
    int n = a.length(), m = b.length();
    int i = 0, j = 0;
    while(i < n && j < m) {
        char c1 = a.charAt(i), c2 = b.charAt(j);
        if(c1 > c2) return true;
        else if(c1 < c2) return false;
        else  {
            i ++; j ++;
        }
    }
    if(i < n) return true;
    else if(j < m) return false;
    else return false;
}

public static String formNumber(String[] str) {
    String strNum = ""; 
    for(int i = str.length - 1; i >= 0; i --) strNum += str[i];
    return strNum;
}

public static void swap(String[] str, int i, int j) {
    String temp = str[i];
    str[i] = str[j];
    str[j] = temp;
}}