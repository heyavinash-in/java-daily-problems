class Person {
    void speak() {
        System.out.println("Person speaks");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.speak();
        s.study();
    }
}