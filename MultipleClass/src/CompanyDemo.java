public class CompanyDemo {

    public static void main(String[] args) {

        Manager m = new Manager();
        Developer d = new Developer();
        Intern i = new Intern();

        m.display();
        d.display();
        i.display();
    }
}

// First class
class Manager {

    void display() {
        System.out.println("Manager object created");
    }
}

// Second class
class Developer {

    void display() {
        System.out.println("Developer object created");
    }
}

// Third class
class Intern {

    void display() {
        System.out.println("Intern object created");
    }
}