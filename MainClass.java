
package mypackage2;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
//        Exercise1 exercise = new Exercise1();
//        exercise.printValue();
//        
//        Circle circle1 = new Circle();
//        String s = circle1.toString();
//        System.out.println(s);
//        
//        
//        Author author1 = new Author();
//        Book book1 = new Book();
//        book1.setAuthor(author1);
//        System.out.println(book1);
     
        Rectangle rect = new Rectangle();
        Rectangle rect1 = new Rectangle();
        rect.setLength(20);
        rect.setWidth(-1.0);
        rect1.setLength(12.0);
        rect1.setWidth(15);
        rect.showDetails();
        rect1.showDetails();
        double p = rect1.getPerimeter();
        System.out.println(p);
        double a = rect.getArea();
        System.out.println(a);
        
        
    }
    
}
