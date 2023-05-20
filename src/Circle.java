public class Circle {
    // list all attributes, set them as private
    private double radius;
    private String color;
    private double area;
    private double circumference;
    private double diameter;
    // create method constructor
    public Circle(double radius, String color){
        setRadius(radius);
        setColor(color);
    }

    // create getter and setter methods for each of the attributes
    //⌘N (macOS), or Alt+Insert (Windows/Linux) to generate Getter and Setter method

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        area = Math.PI * getRadius() * getRadius();
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        circumference = Math.PI * getRadius() *2;
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getDiameter() {
        diameter = 2 * getRadius();
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
