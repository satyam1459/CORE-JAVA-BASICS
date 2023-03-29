package Array;



public class anonymousArray
{
    public static void main(String[] ar){
        sum(new int[][]{{40,50},{10,20,30,400}});
 
    }
    static void sum( int[][] no){
        int total=0;
        for(int ii[]:no){
            for(int i:ii){
            total=total+i;
        }
        }
        System.out.println("Sum is :"+total);
    }
}
