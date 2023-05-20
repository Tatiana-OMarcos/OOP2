public class CircleTest {
    //main method
    public static void main(String[] args) {
        // create circle objects
        Circle Circle01 = new Circle(1, "Red");


        // print the circle 1

        System.out.println("----------------------------------");
        System.out.println("Radius : " + Circle01.getRadius());
        System.out.println( "Color : " + Circle01.getColor());
        System.out.println(" Area :" +  Circle01.getArea());
        System.out.println("Circumference" + Circle01.getCircumference());
        System.out.println("Diameter : " + Circle01.getDiameter());
        System.out.println("----------------------------------");

    }
}
