/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflowexercises;

import java.util.Scanner;

/**
 *
 * @author jimmi
 */
public class ControlFlowExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in); 
        
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
        System.out.println("What day is it today?");
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
            
        System.out.println("What month is it?");    
        String month= sc.next();
        switch(month){
            case "December":
            case "January":
            case "February":
                System.out.println("It is winter!");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("It is Spring!");
                break;    
            case "June":
            case "July":
            case "August":
                System.out.println("It is Summer!");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("It is Autumn!");
                break; 
            default:
                System.out.println("Invalid input");
                break;
            }
        
            switch(month){
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                    System.out.println(month + " has 31 days");
                    break;
                case "February":
                    System.out.println(month + " has 28 days normally and 29 days if it is a leap year!");
                    break;                
                case "April":
                case "June":
                case "September":
                case "November":
                    System.out.println(month + " has 30 days");
                    break;
                default:
                    System.out.println("Invalid input");
            }
                
        }
    
    
}
