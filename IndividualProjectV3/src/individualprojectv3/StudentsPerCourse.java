
package individualprojectv3;

import java.util.List;


public class StudentsPerCourse {
    private Course course;
    private List<Student> students;

    public StudentsPerCourse() {
    }

    public StudentsPerCourse(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + "course=" + course + ", students=" + students + '}';
    }
    
    
}
