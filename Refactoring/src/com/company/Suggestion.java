package com.company;

import java.util.Date;

public class Suggestion {
    private Course course;
    private int section;
    private Date examDate;

   // public suggestion(Course course) {
     //   this.course = course;
       // this.section = 1;
       // this.examDate = null;
    //}

    //public suggestion(Course course, Date examDate) {
      //  this.course = course;
        //this.section = 1;
        //this.examDate = examDate;
    //}

    public Suggestion(Course course, Date examDate, int section) {
        this.course = course;
        this.section = section;
        this.examDate = examDate;
    }

    public Course getCourse() {
        return course;
    }

    public String toString() {
        return course.getName() + " - " + section;
    }

    public Date getExamTime() {
        return examDate;
    }

    public int getSection() {
        return section;
    }

}
