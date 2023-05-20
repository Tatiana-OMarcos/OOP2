public class Main {
    // Class attribute x
    int x;

    // Class constructor
    public Main() {
        // Set initial value for x to 5
        x = 5;
    }

    // Main method
    public static void main(String[] args) {
        // Create object of Main class and call constructor
        Main myObj = new Main();

        // Print the value of x using the object myObj
        System.out.println("The value of x is: " + myObj.x);
    }

}
