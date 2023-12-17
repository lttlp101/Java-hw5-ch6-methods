
//
// ------------------------------------------
/*
    @brief This Program:
    This Java program include the following methods:
    1. A method that calculates the area of a triangle given the base and height of the triangle.
        double calculateTriangleArea(double base, double height)
    2. A method that generates a random number between 1 and 20.
        int roll1d20()
    3. A method that calculates the distance between two points using the Pythagorean theorem
        and the Math.pow() method. distance = ((x2−x1)^2+(y2−y1)^2) ^ 0.5
        double distance(int x1, int y1, int x2, int y2)
    4. A method that calls each of the methods above two times each to demonstrate that they all work correctly.

 */
//
// ------------------------------------------
//
//
//


import java.util.Random;

@SuppressWarnings("java:S106") // Disable the warning about System.out from SonarLint

public class CIT130hw5ch6 {

    // Create the Instance of a Random Object
    static Random random = new Random();

    public static void main(String[] args) {
        // Display Assignment Header
        System.out.println("\nAssignment 5   Methods");

        // Calling or Invoking callMethods method
        callMethods();

        System.out.println("\n");
    } // Main

    // Methods

    // 1)
    ///calculateTriangleArea - Calculates The Area Of A Triangle Given The Base And Height Of The Triangle.
    ///@param - base [double] The Base Of The Triangle
    ///@param - height [double] The Height Of The Triangle
    ///@return: The Area of The Triangle
    public static double calculateTriangleArea(double base, double height)  {  // Method Header
        // Return the Calculation Result of the Area of the Triangle
        return (base * height) / 2.0;
    }  // calculateTriangleArea



    // 2)
    ///roll1d20 - Generates A Random Number Between 1 And 20.
    ///@param - None
    ///@return - A Random Integer Number
    public static int roll1d20() {  // Method Header
        // Initiate the Variable
        final int minNum = 1;
        final int maxNum = 20;

        // Return a random integer number
        return random.nextInt(maxNum - minNum + 1) + minNum;
    }  // roll1d20



    // 3)
    ///distance - Calculates The Distance Between Two Points Using The Pythagorean
    ///           Theorem And The Math.pow() Method.
    ///@param - x1 [int] first point's x coordinate
    ///@param - y1 [int] first point's y coordinate
    ///@param - x2 [int] second point's x coordinate
    ///@param - y2 [int] second point's y coordinate
    ///@return - A Double Type Number Of The Distance Between Two Points
    public static double distance(int x1, int y1, int x2, int y2) {  // Method Header
        // Return a Distance Calculation Result
        return Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
    }  // distance



    // 4)
    ///callMethods - Calls Each Of The Methods Above Two Times Each
    ///                     To Demonstrate That They All Work Correctly.
    ///@param - None
    ///@return - None
    public static void callMethods() {  // Method Header

        // Display the 1st Method Header
        heading1();

        // Calling or Invoking demonstrateMethods Method Two Times
        for (int i = 1; i <= 2; i++) {

            // Create Random Double Numbers For Each Base and Height (1 - 101)
            // Just  Pseudorandom Numbers
            double randomBase = random.nextDouble() * 100 + 1;
            double randomHeight = random.nextDouble() * 100 + 1;

            // Calling or Invoking demonstrateMethods Method
            double triangleArea = calculateTriangleArea(randomBase, randomHeight);

            // Outputs
            System.out.printf("The %d Triangle's Base is %f %n", i, randomBase);
            System.out.printf("The %d Triangle's Height is %f %n", i, randomHeight);
            System.out.printf("The %d Triangle's Area is %f %n%n", i, triangleArea);

        }


        // Display the 2sec Method Header
        heading2();

        // Calling or Invoking roll1d20 Method Two Times
        for (int i = 1; i <= 2; i++) {

            // Calling or Invoking roll1d20 Method
            int randomNumber = roll1d20();

            // Output
            System.out.printf("The %d Random Number Between 1 And 20 is %d %n", i, randomNumber);

        }


        // Display the 3rd Method Header
        heading3();

        // Calling or Invoking distance Method Two Times
        for (int i = 1; i <= 2; i++) {

            // Create Random X and Y Coordinate (Integer Numbers) (-100 To 100)
            final int minNum = -100;
            final int maxNum = 100;
            // First Point Random Coordinates
            int randomX1 = random.nextInt(maxNum - minNum + 1) + minNum;
            int randomY1 = random.nextInt(maxNum - minNum + 1) + minNum;
            // Second Point Random Coordinates
            int randomX2 = random.nextInt(maxNum - minNum + 1) + minNum;
            int randomY2 = random.nextInt(maxNum - minNum + 1) + minNum;

            // Calling or Invoking distance Method
            double distanceBetweenPoints = distance(randomX1, randomY1, randomX2, randomY2);

            // Outputs
            System.out.printf("The %d Calling or Invoking of distance Method %n", i);
            System.out.printf("The First Point (x: %d, y: %d) %n", randomX1, randomY1);
            System.out.printf("The Second Point (x: %d, y: %d) %n", randomX2, randomY2);
            System.out.printf("The Distance Between These Two Points is %f %n%n", distanceBetweenPoints);

        }

    }  // callMethods



    // 5) Extras: Headings and Divider-Line

    ///heading1 - Heading for first method (calculateTriangleArea)
    ///@param - None
    ///@return - None
    public static void heading1() {  // Method Header
        // Calling or Invoking dividerLine Method
        String dividerLines = dividerLine(48);

        // Outputs
        System.out.println("\n\n" + dividerLines);
        System.out.println("1) Calculates The Area of A Triangle ");
        System.out.println("\tGiven The Base And Height Of The Triangle. ");
        System.out.println(dividerLines + "\n");
    }

    ///heading2 - Heading for second method (Random Number : roll1d20)
    ///@param - None
    ///@return - None
    public static void heading2() {  // Method Header
        // Calling or Invoking dividerLine Method
        String dividerLines = dividerLine(48);

        // Outputs
        System.out.println("\n\n" + dividerLines);
        System.out.println("2) Generates A Random Number Between 1 And 20. ");
        System.out.println(dividerLines + "\n");
    }

    ///heading3 - Heading for third method (distance)
    ///@param - None
    ///@return - None
    public static void heading3() {  // Method Header
        // Calling or Invoking dividerLine Method
        String dividerLines = dividerLine(48);

        // Outputs
        System.out.println("\n\n" + dividerLines);
        System.out.println("3) Calculates The Distance Between Two Points ");
        System.out.println("\tUsing The Pythagorean Theorem ");
        System.out.println("\t\tAnd The Math.pow() Method. ");
        System.out.println(dividerLines + "\n");
    }

    ///dividerLine - The Divider Line "----------"
    ///@param - num [int] a number of amount of time to repeat element "-"
    ///@return - A String Type Of Line Made Of "-" (Repeat 48 times)
    public static String dividerLine(int num) {  // Method Header
        // Return a Line of String "-"
        return "-".repeat(num);
    }

}