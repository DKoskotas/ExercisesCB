
package w3d2exercises;


public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle() {
        
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    
    
    public double getArea(){
        Double area = (height * base)/2;
        return area;
    }
}
