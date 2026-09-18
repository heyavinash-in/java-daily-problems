class Car {
    String brand;
    int price;

    void display() {
        System.out.println(brand);
        System.out.println(price);
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "Toyota";
        c.price = 1000000;

        c.display();
    }
}