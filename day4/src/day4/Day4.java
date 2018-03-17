/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.ArrayList;

/**
 *
 * @author macstudent
 */
public class Day4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = new String("Lambton College");
        System.out.println(str1);
        String str3 = "";
        String str4 = new String();
        String str5 = null;
                
                
                
        str1 = str1.toUpperCase();
        System.out.println(str1);
        System.out.println(str1.indexOf("O"));
        System.out.println(str1.indexOf("ELLO"));
        System.out.println(str1.isEmpty());
        System.out.println(str3.isEmpty());
        System.out.println(str4.isEmpty());
        if(str5 != null && str5.length() != 0 && !str5.isEmpty())
        {
             System.out.println(str5);
        }
//        if( str5.length() != 0 && !str5.isEmpty() && str5 != null)
//        {
//             System.out.println(str5);
//        }------------------> (the program will crash if we write null equation in last)


        System.out.println( str2.substring(1));
        System.out.println(str2.substring(2, 9));
        
        String findStr = "College";
        if(str2.contains(findStr))
        {
         System.out.println(str2.indexOf(findStr, findStr.length()));
         System.out.println(str2.substring(str2.indexOf(findStr),str2.indexOf(findStr) + findStr.length()));
        }
        
        
        StringBuilder sb = new StringBuilder("1-Start");
        System.out.println(sb);
        sb.append("\n2-City of Toronto");
        sb.reverse();
        System.out.println(sb);
        sb.append("\n3-lambton");
        System.out.println(sb);
        String str6 = sb.toString();
        System.out.println(str6);
        str6.concat("\n4-Hello");
        System.out.println(sb);
        System.out.println(str6);
        
        Day4 m = new Day4();
        m.matrix();
        System.out.println("\n\n");
        MatrixSample m1 = new MatrixSample();
        m1.matrixsample();
        
       Day4 arr = new Day4();
        arr.arrayListExample();
        
    }
    
    
    public void matrix(){
        int i,j,k;
        int n = 5;
        int a [][]= new int [n][n];
        int count = 1;
        i = 0;
        j= 0;
        int start = 0;
        int n1 = n;
        
       while(count<=n1*n1)
     {
       for(i=j= start; j< n; a[i][j] = count++, j++);
       for(i++,j--;i<n;a[i][j]= count++, i++);
       for(i--,j--; j>=start;a[i][j] = count++, j--);
       for(i--,j++; i>start; a[i][j] = count++, i--);
       start++;
       n--;
       
     
       
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
    
    
    
    public void arrayListExample()
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("Worls");
        arrayList.add("wfbg");
        arrayList.add("hjgjk");
        arrayList.add("oklhjik");
       System.out.println("Size: "+ arrayList.size()); 
       String a = arrayList.get(1);
       System.out.println(a.toString());
    }

}
