/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerinputcheck;

import java.util.Scanner;

/**
 *
 * @author jimmi
 */
public class ScannerInputCheck {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age;
        while (true){
            if (input.hasNextInt()){
                age = input.nextInt(); 
                if (age  <= 120  && age > 0){ 
                    break; 
                }
            }else{
                input.next();
            }
        System.out.println("Please enter a valid number: ");
        }
        System.out.println("Your age is " + age);

    }

}
