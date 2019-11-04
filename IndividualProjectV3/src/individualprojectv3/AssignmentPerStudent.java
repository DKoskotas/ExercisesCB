
package individualprojectv3;

import java.util.List;


public class AssignmentPerStudent {
    private Course course;
    private Student student;
    private List<Assignment> assignments;

    public AssignmentPerStudent() {
    }

    public AssignmentPerStudent(Course course, Student student, List<Assignment> assignments) {
        this.course = course;
        this.student = student;
        this.assignments = assignments;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "AssignmentPerStudentPerCourse{" + "course=" + course + ", student=" + student + ", assignments=" + assignments + '}';
    }
    
    
}
