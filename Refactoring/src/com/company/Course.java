package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private int section;

    List<Course> prerequisites;

    public Course(String id, String name, int section) {
        this.id = id;
        this.name = name;
        this.section = section;
        prerequisites = new ArrayList<Course>();
    }

   // public void addPre(Course c) {
     //   getPrerequisites().add(c);
    //}

    //public Course withPre(Course... pres) {
      //  prerequisites.addAll(Arrays.asList(pres));
       // return this;
    //}

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" {");
        for (Course pre : getPrerequisites()) {
            sb.append(pre.getName());
            sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        Course other = (Course) obj;
        return id.equals(other.id);
    }

    public String getName() {
        return name;
    }

    public int getsection() {
        return section;
    }


}
