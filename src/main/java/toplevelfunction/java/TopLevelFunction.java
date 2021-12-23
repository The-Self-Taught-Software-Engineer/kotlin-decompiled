package toplevelfunction.java;

@SuppressWarnings("ALL")
public final class TopLevelFunction {
    private static double mutableState;

    public static final void main() {
        double radius = 5.5;
        String string = "A circle with radius " + radius + " has a circumference of " + circumference(radius);
        System.out.println(string);
    }

    public static final double getMutableState() {
        return mutableState;
    }

    public static final void setMutableState(double d) {
        mutableState = d;
    }

    public static final double circumference(double radius) {
        double circumference;
        mutableState = circumference = Math.PI * 2 * radius;
        return circumference;
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
