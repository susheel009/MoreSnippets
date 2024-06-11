package StaticVsInstance;

import java.util.Locale;

public class StaticExample {

    private static String name;

    public StaticExample (String name){
        StaticExample.name = name;
    }

    public static void staticMethod(String name){
        String upperName = name.toUpperCase();
        System.out.println(upperName);
    }

    public static void main() {
        System.out.println("name =" +StaticExample.name );
        staticMethod(StaticExample.name);
    }
}
