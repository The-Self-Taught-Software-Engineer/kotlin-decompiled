package iterateoverrange.java;

import kotlin.internal.ProgressionUtilKt;

@SuppressWarnings("ALL")
public final class IterateOverRange {
    public static final void main() {
        int n = 100;
        int n2 = ProgressionUtilKt.getProgressionLastElement(100, 0, -5); // Last element in range
        if (n2 <= n) {
            int x;
            do {
                x = n;
                n -= 5;
                System.out.println(x); // Action in loop
            } while (x != n2); // Loop condition
        }
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
