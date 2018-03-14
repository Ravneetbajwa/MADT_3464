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
public class Student {
    private int sid ;
    private String snm;
    private double marks;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSnm() {
        return snm;
    }

    public void setSnm(String snm) {
        this.snm = snm;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
   public void setData(int sid,String  snm,double marks)
   {
       this.sid = sid;
       this.snm = snm;
       this.marks = marks;
   }
   
   public void getData()
   {
       System.out.println(sid +"   "+snm+"   "+marks);
   }
}
