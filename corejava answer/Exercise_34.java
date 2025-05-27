// Exercise 34 - Create and Use Java Modules
// File: com/utils/Utility.java
package com.utils;

public class Utility {
    public static void greet() {
        System.out.println("Hello from Utility!");
    }
}

// File: com/greetings/Main.java
package com.greetings;

import com.utils.Utility;

public class Main {
    public static void main(String[] args) {
        Utility.greet();
    }
}

// File: com.utils/module-info.java
module com.utils {
    exports com.utils;
}

// File: com.greetings/module-info.java
module com.greetings {
    requires com.utils;
}
