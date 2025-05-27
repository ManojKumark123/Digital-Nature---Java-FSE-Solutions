public class Q07_TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        int j = 10;
        double newDouble = j;
        System.out.println("Original double: " + d + ", After casting to int: " + i);
        System.out.println("Original int: " + j + ", After casting to double: " + newDouble);
    }
}
