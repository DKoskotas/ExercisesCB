
package mypackage2;


public class Circle {
    private double radius = 1.0;
    private String color = "red";
    
    public void setRadius(double r){
        if(r>=0){
            radius = r;
        }
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getArea(){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    
    @Override
    public String toString(){
        double area = getArea();
        String s = "The radius of this circle is "+ radius + " and the area is " + area;
        return s;
    }
    
}
