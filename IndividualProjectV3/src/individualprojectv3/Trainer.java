
package individualprojectv3;

import java.util.Scanner;


public class Trainer {
    private String firstName;
    private String lastName;
    private String subject;

    public Trainer() {
    }

    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public static Trainer createTrainer(){
        Trainer trainer = new Trainer();
        System.out.println("First name: ");
        Scanner scanner = new Scanner(System.in);
        trainer.setFirstName(scanner.next());
        System.out.println("Last name: ");
        scanner = new Scanner(System.in);
        trainer.setLastName(scanner.next());
        System.out.println("subject:");
        scanner = new Scanner(System.in);
        trainer.setSubject(scanner.next());
        return trainer;
    }

    @Override
    public String toString() {
        return "Trainer{" + "firstName=" + firstName + ", lastName=" + lastName 
                + ", subject=" + subject + '}';
    }
    
    
}
