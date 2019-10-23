/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annualsalary;

import java.util.Scanner;

/**
 *
 * @author jimmi
 */
public class AnnualSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int salary = 900;
//        double taxes = salary *9/100;
//        int annualSalary = salary * 12;
//        double annualTaxes = taxes * 12;
//        
//        System.out.println("Your monthly taxes are " + taxes + " $");
//        System.out.println("Your monthly salary is " + (salary - taxes) + " $");
//        System.out.println("Your annual salary after taxes is " + (annualSalary - annualTaxes) + " $");        
//        System.out.println("Your annual taxes are " + annualTaxes + " $");
//        
//        int number = 14;
//        if(number%3 ==0){
//            System.out.println(number + " can be divided by 3");
//        } else {
//            System.out.println(number + " cannot be divided by 3");
//        }
        
       int age = 34;
      
       switch(age){
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
               System.out.println("Too young for school");
               break;
           case 6:
               System.out.println("1st grade");
               break;
           case 7:
               System.out.println("1st grade");    
               break;
           case 8:    
           System.out.println("2nd grade");    
               break;    
           case 9:    
           System.out.println("3rd grade");    
               break;
           case 10:    
           System.out.println("4th grade");    
               break;
           case 11:    
           System.out.println("5th grade");    
               break;    
           case 12:    
           System.out.println("6th grade");    
               break;    
           default:
               System.out.println("You are too old for school");
               break;
               
       }
        System.out.println("What days is it today?");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
            switch(day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Go to work");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Rest");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
       
    }
    
}
