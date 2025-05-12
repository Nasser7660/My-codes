// Nasser Alblooshi, 21103356, 784-2007-6290350-6, 12CAI, 28/01/2025
class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Override toString() to provide a meaningful string representation of the object 
    @Override
    public String toString() {
        return "Person{name='" + name + "',age=" + age + "}";
    }
    // Override equals() to compare objects based on their content 
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Person) {
            Person other = (Person) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }
}
public class ObjectExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        
        // Demonstrating toString()
        System.out.println(p1);
        
        // Demonstrating equals()
        System.out.println("Equal: " + p1.equals(p2));
        
        // Demonstrating getClass()
        System.out.println("Class: " + p1.getClass().getClass());
    }
 
}