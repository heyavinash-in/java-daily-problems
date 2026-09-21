
    class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager manages");
    }
}

 public class overrideemployeework {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.work();
    }
}
