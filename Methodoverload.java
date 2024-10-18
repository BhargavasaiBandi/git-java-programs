class Calc {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;     
    }

    // Method to add two integers and a float
    float add(int a, int b, float c) {
        return a + b + c;
    }
}

class MethodOverload {
    public static void main(String[] args) {
        Calc calc = new Calc();

        // Testing the overloaded add methods
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + calc.add(2, 3, 4));
        System.out.println("Sum of 2, 3, and 4.5: " + calc.add(2, 3, 4.5f));
    }
}
