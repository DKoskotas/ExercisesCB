

package stringexercise1;


public class StringExercise1 {


    public static void main(String[] args) {
        String fullName = nameMethod("Dimitris","Koskotas");
        System.out.println(fullName);
        
    }
    
    public static String nameMethod(String fName, String lName){
        String fullName = fName + lName;
        String fullNameU = fullName.toUpperCase();
        String fullNameFinal= fullNameU.trim();
        return fullNameFinal;
    }
}
