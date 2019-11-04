
package individualprojectv3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Course {
    private String title;
    private String stream;
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course() {
    }

    public Course(String title, String stream, String type, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
    public static Course createCourse(){
        Course course = new Course();
        System.out.println("Course title: ");
        Scanner scanner = new Scanner(System.in);
        course.setTitle(scanner.next());
        System.out.println("Course stream: ");
        scanner = new Scanner(System.in);
        course.setStream(scanner.next());
        System.out.println("Course type: ");
        scanner = new Scanner(System.in);
        course.setType(scanner.next());
        System.out.println("Start date (dd/MM/yyyy): ");
        scanner = new Scanner(System.in);
        String date = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(date, formatter);
        course.setStartDate(date1);
        System.out.println("End Date (dd/MM/yyyy): ");
        scanner = new Scanner(System.in);
        date = scanner.next();
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date1 = LocalDate.parse(date, formatter);
        course.setEndDate(date1);
        return course;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" 
                + type + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
    
}
