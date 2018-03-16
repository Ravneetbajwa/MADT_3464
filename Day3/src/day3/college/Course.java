/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.college;

/**
 *
 * @author macstudent
 */
public class Course {

    private String courseId;
    private String courseNm;
    private double name;

    public Course(String courseId, String courseNm, double name) {
        this.courseId = courseId;
        this.courseNm = courseNm;
        this.name = name;
    }

    public Course() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseNm() {
        return courseNm;
    }

    public void setCourseNm(String courseNm) {
        this.courseNm = courseNm;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseNm=" + courseNm + ", name=" + name + '}';
    }

}
