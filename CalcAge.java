/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcage;

/**
 *
 * @author jimmi
 */
public class CalcAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int currentYear = 2019;
        int myAge = 70;
        int futureYear = 2040;
        int pastYear = 1960;
        int yearOfBirth = currentYear - myAge;
        System.out.println("You were born in " + yearOfBirth);
        if(yearOfBirth < pastYear){
            System.out.println("In 1960 you were " + (pastYear - yearOfBirth) + " years old");
        } else {
            System.out.println("You were not born in 1960");
        }
        if (futureYear - yearOfBirth <= 105){
            System.out.println("In 2040 you will be " + (futureYear - yearOfBirth) + " years old");
        } else { 
            System.out.println("In 2040 you will be " + (futureYear - yearOfBirth) + " years old if you are still alive that is");
        }
    }
    
}
