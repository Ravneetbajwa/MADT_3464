/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import day3.college.Course;
import day3.college.Student;

import java.util.Date;

/**
 *
 * @author macstudent
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Student s = new Student();
        
        Course c1 = new Course("M-1", "ios", 70.0);
        Course c2 = new Course("M-2", "java", 92.0);
        Course c3= new Course("M-3", "swift", 96.0);
        
        Course c4 = new Course("M-4", "dbms", 56.0);
        Course c5 = new Course("M-5", "web", 85.0);
        
        Course courseArray[] = new Course[5];
        courseArray[0] = c1;
        courseArray[1] = c2;
        courseArray[2] = c3;
        courseArray[3] = c4;
        courseArray[4] = c5;
            
            
        s.setStudentId(1);
        s.setName("Ravneet");
        s.setDob(new Date());
        s.setCourseList(courseArray);
        s.calcTotal();
        s.calcPer();
        s.calcResult();
        s.printStudentDetails();
        //System.out.println(s.toString());
    }
    
}
