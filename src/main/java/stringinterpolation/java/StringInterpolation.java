package stringinterpolation.java;

@SuppressWarnings("ALL")
public final class StringInterpolation {
    public static final void main() {
        double radius = 5.5;
        String string = "A circle with a radius of " + radius + " has a diameter of " + diameter(radius) + ", a circumference of " + circumference(radius) + ", and an area of " + area(radius);
        System.out.println(string);
    }

    public static final double diameter(double radius) {
        return (double) 2 * radius;
    }

    public static final double circumference(double radius) {
        return diameter(radius) * Math.PI;
    }

    public static final double area(double radius) {
        double d = radius;
        int n = 2;
        return Math.PI * Math.pow(d, n);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
