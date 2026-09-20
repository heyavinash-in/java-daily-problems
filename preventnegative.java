class Person {
    private int age;

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        Person p = new Person();

        p.setAge(20);

        System.out.println(p.getAge());
    }
}