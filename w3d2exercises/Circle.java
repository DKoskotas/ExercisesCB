
package w3d2exercises;


public class Circle extends Shape{
    private double radious;
    
    public Circle(){
        
    }

    public Circle(double radious) {
        this.radious = radious;
    }
    
    
    
    public double getArea(){
        double area = radious * Math.PI;
        return area;
    }
}
