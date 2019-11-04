
package individualprojectv3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;




public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private double tuitionFees;

    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }
    
    public static Student createStudent(){
        Student student = new Student();
        System.out.println("First name: ");
        Scanner scanner = new Scanner(System.in);
        student.setFirstName(scanner.next());
        System.out.println("Last name: ");
        scanner = new Scanner(System.in);
        student.setLastName(scanner.next());
        System.out.println("Date of birth (dd/MM/yyyy): ");
        scanner = new Scanner(System.in);
        String date= scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(date, formatter);
        student.setDateOfBirth(date1);
        System.out.println("Tuition fees: ");
        scanner = new Scanner(System.in);
        student.setTuitionFees(scanner.nextDouble());
        return student;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName 
                + ", dateOfBirth=" + dateOfBirth + ", tuitionFees=" + tuitionFees + '}';
    }
    
    
}
