/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflowexercises1;

import java.util.Scanner;

/**
 *
 * @author jimmi
 */
public class ControlFlowExercises1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("What is your age?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=0){
            System.out.println("Ha ha very funny! Now lets get serious!");
            System.out.println("What is your age?");
        }
            age = sc.nextInt();
        if(age<=0){
                System.out.println("Invalid value");
        }else if(age < 16){  
            System.out.println("You cannot drive");
        }else if(age<=17){
            System.out.println("You can drive but not vote");
        }else if(age<=21){
            System.out.println("You can vote but not drink");
        }else{
            System.out.println("You can do anything");
        }
        
        System.out.println("What is your weight?");
        int wg = sc.nextInt();
        if(wg<=0){
            System.out.println("Ha ha very funny! Now lets get serious!");
            System.out.println("What is your weight?");
            wg = sc.nextInt();
            if(wg<=0){
                System.out.println("Invalid value");
            }
        }        
        System.out.println("What is your favourite planet in our Solar System?");
        String pl = sc.next();
        switch(pl){
            case "Venus":
                System.out.println("Your weight in " + pl + " is: "+ (wg*0.78));
                break;
            case "Mars":
                System.out.println("Your weight in " + pl + " is: "+ (wg*0.39));
                break;
            case "Jupiter":
                System.out.println("Your weight in " + pl + " is: "+ (wg*2.65));
                break;
            case "Saturn":
                System.out.println("Your weight in " + pl + " is: "+ (wg*1.17));
                break;
            case "Uranus":
                System.out.println("Your weight in " + pl + " is: "+ (wg*1.05));
                break;
            case "Neptune":
                System.out.println("Your weight in " + pl + " is: "+ (wg*1.23));
                break;
            default:
                System.out.println("This planet is in our Solar System!");
                break;
        }
        
        System.out.println("Tell me a number from 1 to 7:");
        int day = sc.nextInt();        
        switch(day){
            case 1:
                System.out.println("The 1st day if the week is Monday");
                break;
            case 2:
                System.out.println("The 2nd day if the week is Tuesday");
                break;
            case 3:
                System.out.println("The 3rd day if the week is Wednesday");
                break;
            case 4:
                System.out.println("The 4rth day if the week is Thursday");
                break;
            case 5:
                System.out.println("The 5th day if the week is Friday");
                break;
            case 6:
                System.out.println("The 6th day if the week is Saturday");
                break;
            case 7:
                System.out.println("The 7th day if the week is Sunday");
                break; 
            default:
                System.out.println("Invalid value");
        }
        
        
    }
    
}
