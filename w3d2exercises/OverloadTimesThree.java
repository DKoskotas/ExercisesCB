/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2exercises;

/**
 *
 * @author jimmi
 */
public class OverloadTimesThree {

    public OverloadTimesThree() {
        
    }
    
    public void overload(int x){
        System.out.println("This is the overload number "+x);
    }
    
    public void overload(String s){
        System.out.println("This is the overload number " + s);
    }
    
    public void overload(double d){
       System.out.println("This is the overload number " + d); 
    }
    
}
