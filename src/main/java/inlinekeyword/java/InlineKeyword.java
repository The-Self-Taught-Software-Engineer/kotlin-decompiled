package inlinekeyword.java;

import java.util.Map;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class InlineKeyword {
    @NotNull
    private static final Properties properties = new Properties();

    public static final void main() {
        double radius = 5.5;
        String string = "A circle with radius " + radius + " has a circumference of " + circumference(radius);
        System.out.println(string);
    }

    @NotNull
    public static final Properties getProperties() {
        return properties;
    }

    public static final double circumference(double radius) {
        double d = Math.PI * 2 * radius;
        double c = d;
        Properties properties = getProperties();
        Map map = properties;
        String string = "previousToLast";
        Object object = properties.get("last");
        map.put(string, object);
        string = "last";
        object = c;
        map.put(string, object);
        return d;
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
