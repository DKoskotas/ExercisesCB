
package w3d2exercises;


public class Square extends Shape{
    private double side;

    public Square() {
        
    }

    public Square(double side) {
        this.side = side;
    }
            
    public double getArea(){
        Double area = Math.pow(side, 2);
        return area;
    }
}
