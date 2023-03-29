package pattern;

class mPattern
{ 
  public static void main(String args[]) 
  { 
    int n = 5; 


    int x = 2; 
    for (int i = 1; i <= n; i++) 
    { 
      for (int j = 1; j <= n+2; j++) 
      { 
        if (j == 1 || j == n+2 || ((j == x || j == n - x + 3) && i <= n / 2 + 1)) 
        { 
          System.out.print("*"); 
        } 
        else 
        { 
          System.out.print(" "); //2ws 
        } 
      } 
      x++; 
      System.out.println(); 
    } 

  } 
} 