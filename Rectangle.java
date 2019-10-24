
package mypackage2;


public class Rectangle {
    private double length = 1;
    private double width = 1;
    
    public double getLenght(){
        return length;
    }
    
    public void setLength(double l){
        if(l>0.0 && l<20.0){
            length = l;
        }
    }
    
    public double getWidth(){
        return length;
    }
    
    public void setWidth(double w){
        if(w>0.0 && w<20.0){
            length = w;
        }
    }
    
    public double getPerimeter(){
        double perimeter = 2*(1 + width);
        return perimeter;
    }
    
    public double getArea(){
        double area = width * length;
        return area;
    }
    
    public void showDetails(){
        StringBuilder builder = new StringBuilder();
        builder.append("This rectangle has langth: ").append(length)
                .append(" and width ").append(width);
        System.out.println(builder);
       
    }
    
}
