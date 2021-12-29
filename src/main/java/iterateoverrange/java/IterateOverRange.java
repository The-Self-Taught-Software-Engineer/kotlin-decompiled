package iterateoverrange.java;

import kotlin.internal.ProgressionUtilKt;

@SuppressWarnings("ALL")
public final class IterateOverRange {
    public static final void main() {
        // Range
        int n = 0;
        do {
            int x = n++;
            boolean bl = false;
            System.out.println(x);
        } while (n <= 100);

        // Progression
        n = 100;
        int n2 = ProgressionUtilKt.getProgressionLastElement(100, 0, -5);
        if (n2 <= n) {
            int x;
            do {
                x = n;
                n -= 5;
                boolean bl = false;
                System.out.println(x);
            } while (x != n2);
        }
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
