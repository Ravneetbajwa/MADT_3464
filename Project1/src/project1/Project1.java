/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author macstudent
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to java Programming");
        int a = 40;
        int b= 20;
        //int c= a+b;
        
//        System.out.println("Sum: " +(a+b));
//        System.out.println("Subtraction: " +(a-b));
//        System.out.println("Multiplication: " +(a*b));
//        System.out.println("Division: " +(a/b));
//        String v = "gdfgdfd";
//        System.out.println(v);
        
        
        Airthmetic p2 = new Airthmetic();
        p2.add(a,b);
        p2.sub(a,b);
        p2.mul(a,b);
        p2.div(a,b);
        p2.mod(a,b);
        
        
        
        Student s1 = new Student();
        s1.setData(1, "Ravneet", 92.5);
       
        s1.getData();
        
        
        Student s2 = new Student();
        s2.setData(2, "Charmi Ben", 92.5);
        s2.getData();
        
        Student s3 = new Student();
        s3.setData(3, "Jagga Daaku", 92.5);
        s3.getData();
        
        
        int i; 
        for (i=1;i<=10;i++)
        {
            System.out.println(i + "  "+s1.getSnm());
        }
    }
    
    
    
}
