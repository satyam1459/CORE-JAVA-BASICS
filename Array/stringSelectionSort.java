package Array;



public class stringSelectionSort
{
  public static void main(String[] args){
      String[] s={"Deepak","Rahul","Ramesh","Mohan","Bhuppi"};
      int min;  String temp;
      for(int i=0;i<s.length;i++){
          min=i;
          for(int j=i+1;j<s.length;j++){
              if(s[j].compareTo(s[min])<0){
                  min=j;
              }
              temp=s[i];
              s[i]=s[min];
              s[min]=temp;
              
          }
      }
      for(String x:s)
          System.out.print(x+" ");
  }
}
