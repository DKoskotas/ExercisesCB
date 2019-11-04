
package individualprojectv3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;




public class Assignment {
    private String title;
    private String description;
    private LocalDate subDateTime;
    private String oralMark;
    private String totalMark;

    public Assignment() {
    }

    public Assignment(String title, String description, LocalDate subDateTime, String oralMark, String totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public String getOralMark() {
        return oralMark;
    }

    public void setOralMark(String oralMark) {
        this.oralMark = oralMark;
    }

    public String getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(String totalMark) {
        this.totalMark = totalMark;
    }
    
    public static Assignment createAssignement(){
        Assignment assignment = new Assignment();
        System.out.println("Assignement title: ");
        Scanner scanner = new Scanner(System.in);
        assignment.setTitle(scanner.next());
        System.out.println("Assignement description: ");
        scanner = new Scanner(System.in);
        assignment.setDescription(scanner.nextLine());
        System.out.println("Assignement sub date time (dd/MM/yyyy): ");
        String date = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(date, formatter);
        assignment.setSubDateTime(date1);
        System.out.println("Oral mark: ");
        scanner = new Scanner(System.in);
        assignment.setOralMark(scanner.next());
        System.out.println("Total mark: ");
        scanner = new Scanner(System.in);
        assignment.setTotalMark(scanner.next());
        return assignment;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description 
                + ", subDateTime=" + subDateTime + ", oralMark=" + oralMark 
                + ", totalMark=" + totalMark + '}';
    }
    
    
}
