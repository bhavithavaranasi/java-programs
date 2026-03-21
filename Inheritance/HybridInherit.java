// Interface
interface Person {
    void showName();
}

// Parent class
class Employee implements Person {
    String name;

    public void showName() {
        name = "Bhavitha";
        System.out.println("Name: " + name);
    }
}

// Child class 1
class Manager extends Employee {
    void role() {
        System.out.println("Role: Manager");
    }
}

// Child class 2
class Developer extends Employee {
    void role() {
        System.out.println("Role: Developer");
    }
}

public class HybridInherit {
    public static void main(String[] args) {
        
        Manager m = new Manager();
        m.showName();
        m.role();

        System.out.println("------");

        Developer d = new Developer();
        d.showName();
        d.role();
    }
}