
package individualprojectv3;

import java.util.List;


public class AssignmentsPerCourse {
    private Course course;
    private List<Assignment> assignments;

    public AssignmentsPerCourse() {
    }

    public AssignmentsPerCourse(Course course, List<Assignment> assignments) {
        this.course = course;
        this.assignments = assignments;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "AssignmentsPerCourse{" + "course=" + course + ", assignments=" + assignments + '}';
    }
    
    
}
