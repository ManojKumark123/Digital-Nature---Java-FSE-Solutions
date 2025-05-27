// Exercise 39 - Reflection in Java
import java.lang.reflect.Method;

public class Exercise_39 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.lang.String");
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
