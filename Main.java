class Dog {  
    String name;  
    void bark() {  
        System.out.println(name + " says Woof!");  
    }  
}  
public class Main {  
    public static void main(String[] args) {  
        Dog myDog = new Dog();     // Creating an object  
        myDog.name = "Rocky";      // Assigning value to the object's field  
        myDog.bark();              // Calling method on the object  
        
    }  
} 