
package mypackage2;


public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    public void setAuthor(Author author){
        this.author = author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double p){
        if(p>= 0){
            price = p;
        }
        
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setQty(int q){
        if(q>0){
            qty = q;
        }
    }
    
    public String toString(){
        String s = "Book [name" + name + " author ," + author
                + " price ," + price + " quantity ," + qty + " ]";
        return s;
    }
    
}
