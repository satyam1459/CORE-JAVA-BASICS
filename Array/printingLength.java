package Array;

public class printingLength
{
    public static void main(String[] args){
        int a[][][]={{{2,3},{34,5,6,7}}};
        System.out.println(a[0][0].length);
        System.out.println(a[0][1].length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++)
                    System.out.print(a[i][j][k]+",");
                 System.out.println();
            }
        }        
    }
} 
