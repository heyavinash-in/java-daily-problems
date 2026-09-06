class circle {
    double radius;
    double area()
    {
        return Math.PI*radius*radius;

    }

    double perimeter(){
       return 2*Math.PI*radius;
    }
}
public class circleoops {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius=7;
        System.out.println("area:" + c1.area());
        System.out.println("perimeter:" + c1.perimeter());

    }
}
