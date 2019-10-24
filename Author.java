
package mypackage2;


public class Author {
    private String name;
    private String email;
    private String gender = "male" ;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        if(gender == "male" || gender == "female")
        this.gender = gender;
    }



    public String toString() {
        String a = "Author[" + "name: " + name + ", email: " + email + ", gender: " + gender + "]";
        return a;
    }
    
    
    
}
