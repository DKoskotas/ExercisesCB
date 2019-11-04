
package individualprojectv3;

import java.text.ParseException;import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainClass {

    
    public static void main(String[] args) { 
        
        List<Course> courses = new ArrayList();
        List<Trainer> trainers = new ArrayList();
        List<Student> students = new ArrayList();
        List<Assignment> assignments = new ArrayList();
        List<StudentsPerCourse> studentsPerCourse = new ArrayList();
        List<TrainersPerCourse> trainersPerCourse = new ArrayList();
        List<AssignmentsPerCourse> assignmentsPerCourse = new ArrayList();
        List<AssignmentPerStudent> assignmentPerStudent = new ArrayList();       
        
        String mainMenu = "";
        while(!mainMenu.equals("exit")){
            System.out.println("Hello.\n" +
                "Type number 1 to use synthetic data: \n" +
                "Type number 2 to register new entries: \n" +
                "Type number exit to exit this menu.");
            Scanner sc = new Scanner(System.in);
            mainMenu = sc.next();
            switch(mainMenu){                
                case "1":
                    syntheticCourses(courses);
                    syntheticTrainers(trainers);
                    syntheticStudents(students);
                    syntheticAssignments(assignments);
                    syntheticStudentsPerCourse(studentsPerCourse);
                    syntheticTrainersPerCourse(trainersPerCourse);
                    syntheticAssignmentsPerCourse(assignmentsPerCourse);
                    syntheticAssignmentPerStudent(assignmentPerStudent);

                    String option = "";
                    while (!option.equals("exit")) {
                        System.out.println(
                                "Welcome. \n"
                                + "To print a list of the courses type the number 1:\n"
                                + "To print a list of the trainers type the number 2:\n"
                                + "To print a list of the students type the number 3:\n"
                                + "To print a list of the assignements type the number 4:\n"
                                + "To print a list of the students per course type the number 5:\n"
                                + "To print a list of the trainers per course type the number 6:\n"
                                + "To print a list of the assignments per course type the number 7:\n"
                                + "To print a list of the assignments per student type the number 8:\n"
                                + "To print a list of students that belong to more than one courses type the number 9:\n"
                                + "To exit type exit."
                        );
                        sc = new Scanner(System.in);
                        option = sc.next();
                        switch (option) {
                            case "1":
                                for (Course c : courses) {
                                    System.out.println(c);
                                }
                                break;
                            case "2":
                                for (Trainer t : trainers) {
                                    System.out.println(t);
                                }
                                break;
                            case "3":
                                for (Student s : students) {
                                    System.out.println(s);
                                }
                                break;
                            case "4":
                                for (Assignment a : assignments) {
                                    System.out.println(a);
                                }
                                break;
                            case "5":
                                for (StudentsPerCourse spc : studentsPerCourse) {
                                    System.out.println(spc);
                                }
                                break;
                            case "6":
                                for (TrainersPerCourse tpc : trainersPerCourse) {
                                    System.out.println(tpc);
                                }
                                break;
                            case "7":
                                for (AssignmentsPerCourse apc : assignmentsPerCourse) {
                                    System.out.println(apc);
                                }
                                break;
                            case "8":
                                for (AssignmentPerStudent aps : assignmentPerStudent) {
                                    System.out.println(aps);
                                }
                                break;
                            case "9":
                                System.out.println(moreCourses(students, studentsPerCourse));
                                break;
                            case "exit":
                                System.out.println("You have returned to the main menu:");
                        }
                    }
                    break;
            case "2":
                    option = "";
                    while (!option.equals("exit")) {
                        System.out.println(
                                "Welcome. \n"
                                + "To create a new course type the number 1:\n"
                                + "To create a new trainer type the number 2:\n"
                                + "To create a new student type the number 3:\n"
                                + "To create a new assignment type the number 4:\n"
                                + "To exit type exit."
                        );
                        sc = new Scanner(System.in);
                        option = sc.next();
                        switch (option) {
                            case "1":
                                createCourses(courses);
                                break;
                            case "2":
                                createTrainers(trainers);
                                break;
                            case "3":
                                createStudents(students);
                                break;
                            case "4":
                                createAssignments(assignments);
                                break;                              
                            case "exit":
                                System.out.println("You have returned to the main menu:");
                        }
                    }
            case "exit":
                System.out.println("Thank you and Goodbye.");
            }
        }
    }
    
    public static List<Course> syntheticCourses(List<Course> syntheticCourses){
        LocalDate startDate1 = LocalDate.of(2019,9,2);
        LocalDate endDate1 = LocalDate.of(2019,12,2);
        Course c1 = new Course("CB8", "Java", "full time", startDate1, endDate1);
        Course c2 = new Course("CB8", "C#", "full time", startDate1, endDate1);
        Course c3 = new Course("CB8", "Java", "part time", startDate1, endDate1);
        Course c4 = new Course("CB8", "C#", "part time", startDate1, endDate1);        
        
        syntheticCourses.add(c1);
        syntheticCourses.add(c2);
        syntheticCourses.add(c3);
        syntheticCourses.add(c4);
        
        return syntheticCourses;
    }
    
    public static List<Trainer> syntheticTrainers(List<Trainer> syntheticTrainers){
        Trainer t1 = new Trainer("Argiris", "Kampouris", "Java instructor");
        Trainer t2 = new Trainer("Panagiotis", "Fasoulas", "C# instructor");
        Trainer t3 = new Trainer("Fanis", "Xristodoulou", "Java instructor");
        Trainer t4 = new Trainer("Panagiotis", "Giannakis", "C# instructor");        
        
        syntheticTrainers.add(t1);
        syntheticTrainers.add(t2);
        syntheticTrainers.add(t3);
        syntheticTrainers.add(t4);
        return syntheticTrainers;
    }
    
    public static List<Student> syntheticStudents(List<Student> syntheticStudents){
        LocalDate dateOfBirth1 = LocalDate.of(1990, 3, 7);
        LocalDate dateOfBirth2 = LocalDate.of(1998, 4, 2);
        LocalDate dateOfBirth3 = LocalDate.of(1991, 8, 17);
        LocalDate dateOfBirth4 = LocalDate.of(1988, 10, 20);
        LocalDate dateOfBirth5 = LocalDate.of(1987, 3, 7);
        Student s1 = new Student("Stelios", "Kazatzidis",dateOfBirth1,600);
        Student s2 = new Student("Rita", "Sakelariou",dateOfBirth2,500);
        Student s3 = new Student("Mihalis", "Rakintzis",dateOfBirth3,480);
        Student s4 = new Student("Litsa", "Diamanti",dateOfBirth4,490);
        Student s5 = new Student("Jimmis", "Panousis",dateOfBirth5,450);        
        
        syntheticStudents.add(s1);
        syntheticStudents.add(s2);
        syntheticStudents.add(s3);
        syntheticStudents.add(s4);
        syntheticStudents.add(s5);
        
        return syntheticStudents;
    }
    
    public static List<Assignment> syntheticAssignments(List<Assignment> syntheticAssignments){
        LocalDate subDate1 = LocalDate.of(2019, 9, 23);
        LocalDate subDate2 = LocalDate.of(2019, 10, 21);
        LocalDate subDate3 = LocalDate.of(2019, 11, 25);
        Assignment a1 = new Assignment("Individual Project"," Java", subDate1, "A-F", "A-F");
        Assignment a2 = new Assignment("Individual Project"," C#", subDate2, "A-B", "A-B");        
        Assignment a3 = new Assignment("Group Project"," Front End", subDate3, "A-C", "A-C");
             
        
        syntheticAssignments.add(a1);
        syntheticAssignments.add(a2);
        syntheticAssignments.add(a3);
        return syntheticAssignments;
    }
    
    public static List<StudentsPerCourse> syntheticStudentsPerCourse(List<StudentsPerCourse> syntheticStudentsPerCourse){
        List<Course> courses = new ArrayList();
        syntheticCourses(courses);        
        List<Student> students = new ArrayList();
        syntheticStudents(students);        
        List<Student> c1Students = new ArrayList();
        c1Students.add(students.get(0));
        c1Students.add(students.get(2));
        c1Students.add(students.get(3));        
        StudentsPerCourse spc1 = new StudentsPerCourse(courses.get(0), c1Students);        
        List<Student> c2Students = new ArrayList();
        c2Students.add(students.get(1));
        c2Students.add(students.get(0));
        c2Students.add(students.get(4));        
        StudentsPerCourse spc2 = new StudentsPerCourse(courses.get(1), c2Students);        
        List<Student> c3Students = new ArrayList();
        c3Students.add(students.get(2));
        c3Students.add(students.get(3));        
        StudentsPerCourse spc3 = new StudentsPerCourse(courses.get(2), c3Students);        
        List<Student> c4Students = new ArrayList();
        c4Students.add(students.get(0));
        c4Students.add(students.get(4));      
        StudentsPerCourse spc4 = new StudentsPerCourse(courses.get(3), c4Students);                
        syntheticStudentsPerCourse.add(spc1);
        syntheticStudentsPerCourse.add(spc2);
        syntheticStudentsPerCourse.add(spc3);
        syntheticStudentsPerCourse.add(spc4);        
        return syntheticStudentsPerCourse;
    }
    
    public static List<TrainersPerCourse> syntheticTrainersPerCourse(List<TrainersPerCourse> syntheticTrainersPerCourse){
        List<Course> courses = new ArrayList();
        syntheticCourses(courses);        
        List<Trainer> trainers = new ArrayList();
        syntheticTrainers(trainers);        
        List<Trainer> c1Trainers = new ArrayList();
        c1Trainers.add(trainers.get(0));
        c1Trainers.add(trainers.get(2));        
        TrainersPerCourse tpc1 = new TrainersPerCourse(courses.get(0), c1Trainers);
        List<Trainer> c2Trainers = new ArrayList();
        c2Trainers.add(trainers.get(1));
        c2Trainers.add(trainers.get(3));        
        TrainersPerCourse tpc2 = new TrainersPerCourse(courses.get(1), c2Trainers);        
        List<Trainer> c3Trainers = new ArrayList();
        c3Trainers.add(trainers.get(0));
        c3Trainers.add(trainers.get(2));        
        TrainersPerCourse tpc3 = new TrainersPerCourse(courses.get(2), c3Trainers);        
        List<Trainer> c4Trainers = new ArrayList();
        c4Trainers.add(trainers.get(1));
        c4Trainers.add(trainers.get(3));        
        TrainersPerCourse tpc4 = new TrainersPerCourse(courses.get(3), c4Trainers);        
        syntheticTrainersPerCourse.add(tpc1);
        syntheticTrainersPerCourse.add(tpc2);
        syntheticTrainersPerCourse.add(tpc3);
        syntheticTrainersPerCourse.add(tpc3);
        return syntheticTrainersPerCourse;
    }
    
    public static List<AssignmentsPerCourse> syntheticAssignmentsPerCourse(List<AssignmentsPerCourse> syntheticAssignmentsPerCourse){
        List<Course> courses = new ArrayList();
        syntheticCourses(courses);        
        List<Assignment> assignments = new ArrayList();   
        syntheticAssignments(assignments);        
        List<Assignment> c1assignments = new ArrayList();
        c1assignments.add(assignments.get(0));
        c1assignments.add(assignments.get(2));
        AssignmentsPerCourse apc1 = new AssignmentsPerCourse(courses.get(0),c1assignments);        
        List<Assignment> c2assignments = new ArrayList();
        c2assignments.add(assignments.get(1));
        c2assignments.add(assignments.get(2));
        AssignmentsPerCourse apc2 = new AssignmentsPerCourse(courses.get(1),c2assignments);        
        List<Assignment> c3assignments = new ArrayList();
        c3assignments.add(assignments.get(0));
        c3assignments.add(assignments.get(2));
        AssignmentsPerCourse apc3 = new AssignmentsPerCourse(courses.get(2),c3assignments);        
        List<Assignment> c4assignments = new ArrayList();
        c4assignments.add(assignments.get(1));
        c4assignments.add(assignments.get(2));
        AssignmentsPerCourse apc4 = new AssignmentsPerCourse(courses.get(3),c4assignments);        
        syntheticAssignmentsPerCourse.add(apc1);
        syntheticAssignmentsPerCourse.add(apc2);
        syntheticAssignmentsPerCourse.add(apc3);
        syntheticAssignmentsPerCourse.add(apc4);        
        return syntheticAssignmentsPerCourse;
    }
    
    public static List<AssignmentPerStudent> syntheticAssignmentPerStudent(List<AssignmentPerStudent> syntheticAssignmentPerStudent){            
        List<StudentsPerCourse> studentsPerCourse = new ArrayList();
        syntheticStudentsPerCourse(studentsPerCourse);        
        List<AssignmentsPerCourse> assignmentsPerCourse = new ArrayList();
        syntheticAssignmentsPerCourse(assignmentsPerCourse);        
        for(StudentsPerCourse spc : studentsPerCourse){            
            List<Assignment> a1assignmentPerStudent = new ArrayList();
            for(AssignmentsPerCourse apc :assignmentsPerCourse){
                if(apc.getCourse().equals(spc.getCourse())){
                    a1assignmentPerStudent.addAll(apc.getAssignments());
                    break;                
                }
            }
            for(Student s : spc.getStudents()){
                AssignmentPerStudent asp = new AssignmentPerStudent();
                asp.setCourse(spc.getCourse());
                asp.setStudent(s);
                asp.setAssignments(a1assignmentPerStudent);
                syntheticAssignmentPerStudent.add(asp);
            }
        }
        return syntheticAssignmentPerStudent;        
    }
    
    public static List<Student> moreCourses(List<Student> students, List<StudentsPerCourse> studentPerCourse){
        List<Student> result = new ArrayList();
        for(Student s1 : students){
            List<Course> tempCourses = new ArrayList();
            for(StudentsPerCourse spc : studentPerCourse){
                for(Student s2 : spc.getStudents()){
                    if(s1.getLastName().equals(s2.getLastName())){
                        tempCourses.add(spc.getCourse());
                        break;
                    }
                }
            }
            if(tempCourses.size()>1){
                result.add(s1);
            }
        }
        return result;
    }
    
    public static List<Course> createCourses(List<Course> courses){
        courses.add(Course.createCourse());
        Scanner scanner = new Scanner(System.in);
        String option = "";
        while(!option.equals("exit")){
            System.out.println("To create an additional course type 1. \n" +
                    "to exit type exit");
            option = new Scanner(System.in).next();
            if(option.equals("1")){
                courses.add(Course.createCourse());
            }
        }
        return courses;
    }
    
    public static List<Trainer> createTrainers(List<Trainer> trainers){
        trainers.add(Trainer.createTrainer());
        Scanner scanner = new Scanner(System.in);
        String option = "";
        while(!option.equals("0")){
            System.out.println("To create an additional trainer type 1. \n" +
                    "To exit type 0."
            );
            option = new Scanner(System.in).next();
            if(option.equals("1")){
                trainers.add(Trainer.createTrainer());
            }
        }
        return trainers;
    }
    
    public static List<Student> createStudents(List<Student> students){
        students.add(Student.createStudent());
        Scanner scanner = new Scanner(System.in);
        String option ="";
        while(!option.equals("exit")){
            System.out.println("To create an additional student type 3. \n" +
                    "To exit type exit."
            );
            option = new Scanner(System.in).next();
            if(option.equals("3")){
                students.add(Student.createStudent());
            }
        }
        return students;
    }
    
    public static List<Assignment> createAssignments(List<Assignment> assignments){
        assignments.add(Assignment.createAssignement());
        Scanner scanner = new Scanner(System.in);
        String option = "";
        while(!option.equals("exit")){
            System.out.println("To create an additional assignement type 4. \n" +
                    "To exit type exit."
            );
            option = new Scanner(System.in).next();
            if(option.equals("4")){
                assignments.add(Assignment.createAssignement());
            }            
        }
        return assignments;
    } 
    
}
