
package mypackage2;


public class Exercise1 {
    private int x;
    private char c;
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setC(char c){
        this.c = c;
    }
    
    public char getC(){
        return c;
    }
    
    public void printValue(){
        StringBuilder value = new StringBuilder();
        value.append("the number is ").append(x).append(" and the character is ").append(c);
        System.out.println(value);
    }
    
}
