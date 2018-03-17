/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author macstudent
 */
public class MatrixSample {
    
    
    public void matrixsample(){
        int n = 3;
        int a [][]= new int [n][n];
        int count = 1;
        int i = 0;
        int j= 0;
        int n1= n;
        
        
     while(count <n1*n1)
       {
            for(i = 0;i<n;i++)
            {
                a[j][i] = count++;
                //count++;
            }
       
        for(j++, i--; j<n; j++)
        {
            a[i][j]= count++;
           // count++;
          //  System.out.println(a[i][j]);
        }
        for(j--, i--; i>=0; i--)
        {
            a[i][j]= count++;
            // count++;
          //  System.out.print(a[i][j]);
        }
        //System.out.println();
         for(i++, j--; j>=1; j--)
        {
            a[i][j]= count++;
            // count++;
           // System.out.println(a[i][j]);
        }
         
       }
         for(i = 0; i< a.length; i++)
         {
             for(j= 0; j< a.length; j++)
             {
              System.out.print(a[i][j]+ "\t");
             }
              System.out.println();
         }
        
     
    }
}
