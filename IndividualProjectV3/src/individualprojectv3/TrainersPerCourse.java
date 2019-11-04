
package individualprojectv3;

import java.util.List;


public class TrainersPerCourse {
    private Course course;
    private List<Trainer> trainers;

    public TrainersPerCourse() {
    }

    public TrainersPerCourse(Course course, List<Trainer> trainers) {
        this.course = course;
        this.trainers = trainers;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "TrainersPerCourse{" + "course=" + course + ", trainers=" + trainers + '}';
    }
    
    
}
