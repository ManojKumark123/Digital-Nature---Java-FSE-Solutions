// Exercise 37 - Using javap to Inspect Bytecode
public class Exercise_37 {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println("Square of 4 is: " + square(4));
    }
}

// Compile and inspect with:
// javac Exercise_37.java
// javap -c Exercise_37
