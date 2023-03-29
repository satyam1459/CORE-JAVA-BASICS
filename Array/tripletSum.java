package Array;


/**
 * Count the number of triplets whose sum is equal to k.
 * also print the triplets elements
 */
public class tripletSum
{
    public static void main(String[] args){
     int[] arr={4,5,6,3,2,5};
     int n=arr.length;
     int count=0;
     int k=12;
     int itr=1;
      for(int i=0;i<n;i++)
          {
              for(int j=i+1;j<n;j++){
                  for(int x=j+1;x<n;x++){
                      if(arr[i]+arr[j]+arr[x]==k)
                      {
                          count++;
                          System.out.print((itr++)+" elements are "+arr[i]+" "+arr[j]+" "+arr[x]);
                          System.out.println();
                        }
              }
            }
          }
          System.out.println("Total triplets are "+count);
        }
}
