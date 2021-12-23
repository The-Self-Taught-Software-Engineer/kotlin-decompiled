package valueclass.java;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@SuppressWarnings("ALL")
@JvmInline
public final class Celcius {
    private final double value;

    private /* synthetic */ Celcius(double value) {
        this.value = value;
    }

    public static double constructorImpl(double value) {
        double d = value;
        boolean bl = d >= -273.15;
        if (!bl) {
            String string = d + " is not a possible Celcius temperature";
            throw new IllegalArgumentException(string);
        }
        return d;
    }

    public static final /* synthetic */ Celcius boxImpl(double v) {
        return new Celcius(v);
    }

    public static String toStringImpl(double arg0) {
        return "Celcius(value=" + arg0 + ')';
    }

    public static int hashCodeImpl(double arg0) {
        return Double.hashCode(arg0);
    }

    public static boolean equalsImpl(double arg0, Object other) {
        if (!(other instanceof Celcius)) {
            return false;
        }
        double d = ((Celcius) other).unboxImpl();
        return Intrinsics.areEqual((Object) arg0, (Object) d);
    }

    public static final boolean equalsImpl0(double p1, double p2) {
        return Intrinsics.areEqual((Object) p1, (Object) p2);
    }

    public final /* synthetic */ double unboxImpl() {
        return this.value;
    }

    public final double getValue() {
        return this.unboxImpl();
    }

    public String toString() {
        return toStringImpl(this.unboxImpl());
    }

    public int hashCode() {
        return hashCodeImpl(this.unboxImpl());
    }

    public boolean equals(Object other) {
        return equalsImpl(this.unboxImpl(), other);
    }
}
