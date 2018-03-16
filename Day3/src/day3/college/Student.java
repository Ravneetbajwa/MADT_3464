/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.college;


import java.text.SimpleDateFormat;
import java.util.Date;

//import java.util.logging.Logger;

/**
 *
 * @author macstudent
 */
public class Student {

    private int studentId;
    private String name;
    private Course courseList[];
    private Date dob;
    private double Total;
    private double per;
    private String Result;

    public Student(int studentId, String name, Course[] courseList, Date dob) {
        this.studentId = studentId;
        this.name = name;
        this.courseList = courseList;
        this.dob = dob;
    }

    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    public void setCourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getTotal() {
        return Total;
    }

    public double getPer() {
        return per;
    }

    public String getResult() {
        return Result;
    }

    public void calcTotal() {
        this.Total = 0;
        for (int i = 0; i < courseList.length; i++) {
            this.Total = this.Total + courseList[i].getName();
        }

//        for(Course c : courseList)
//        {
//            this.Total = this.Total + c.getName();
//        }
    }

    public void calcPer() {
        this.per = (this.Total / this.courseList.length);

    }

    public void calcResult() {
        this.Result = "PASS";
    }
    
    String date;
    public void  dateFormat()  {
   SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy"); 
    date = dt.format(this.dob);
    }

    public void printStudentDetails()  {
        System.out.println("Student id is " + this.studentId);
        System.out.println("Student name is " + this.name);
        dateFormat();
         System.out.println( date);
        calcTotal();
        calcPer();
        calcResult();
        System.out.println("Student Marks total is " + this.Total);
        System.out.println("Student Marks total is " + this.per);
        System.out.println("Student Marks total is " + this.Result);
    }
    
    
    
    

    
    
    
    @Override
    public String toString() {
        String s = "Student{" + "studentId=" + studentId + ", name=" + name + ", dob=" + dob + ", Total=" + Total + ", per=" + per + ", Result=" + Result + '}';
       
        for (Course c : courseList) {
            s = s + c.toString() + "\n";
        }
        return s;
    }
    
   
}
