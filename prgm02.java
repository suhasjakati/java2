package java;

public class prgm02 {
    prgm02(){
        System.out.println("Constructor of prgm02 class");
    }
    prgm02(int a){
        System.out.println("Constructor of prgm02 class with parameter: " + a);
    }           
    public static void main(String args[]){
        prgm02 obj1 = new prgm02(); // Calls the default constructor
        prgm02 obj2 = new prgm02(10); // Calls the parameterized constructor
    }
}