package Array;
import java.util.Scanner;

/**
 * Write a description of class pascalTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pascalTriangle
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows you want");
        int n=sc.nextInt();                 //Number of rows
        int[][] m=pascalTri(n);
        printMatrix(m);
        
    }
    static int[][] pascalTri(int n){
        int[][] ans=new int[n][];
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void printMatrix(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
