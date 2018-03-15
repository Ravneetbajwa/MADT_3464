/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author macstudent
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Day2 d2 = new Day2();  
      d2.Pattern(5);
      d2.starPattern(4);
      d2.starPattern1(5);
      d2.main(4,7);
      double x = 1____00_000.0_0/1_00;
      System.out.println(x);
      
      
      String s1 = "Hello";
      String s2 = s1;
      String s3 = new String();
      s3 = "Hello";
      String s4 = "Hello";
      String s5 = new String("Hello");
      if(s1.equals(s5)){
        System.out.println("Success");
      }
      else
          {
        System.out.println(" notSuccess");
      }
      
      
     int a[] ={10,20,30};
     int b[] = new int[]{1,2,3,4,5,6};
     
     for(int i=0;i<6;i++)
     {
         System.out.println(b[i]);
     }
     
     
     Student st1 = new Student();
     
    }
     public void Pattern(int n)
        {
            int i , j ;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
            { 
                System.out.print(j);
            }
                System.out.println();
            }
                System.out.println();
        }
      public void starPattern(int n)
        {
            int i , j ;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
            { 
                System.out.print("*");
            }
                System.out.println();
            }
                System.out.println();
        }
      public void starPattern1(int n)
        {
            int i , j,k ;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n-i;j++)
            { 
                System.out.print("  ");
            }
                for(k=1;k<=i;k++)
            { 
                System.out.print("*   ");
            }
            
                System.out.println();
            }
               
        }
      
      public static void main(int a, int b)
      {
          System.out.println(a+b);
      }
      
      
}
