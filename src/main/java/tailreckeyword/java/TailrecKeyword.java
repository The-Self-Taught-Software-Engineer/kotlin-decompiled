package tailreckeyword.java;

@SuppressWarnings("ALL")
public final class TailrecKeyword {
    public static final void main() {
        long l = fibonacci$default(1000L, 0L, 0L, 6, null);
        System.out.println(l);
    }

    public static final long fibonacci(long n, long a, long b) {
        long l;
        long l2 = n;
        long l3 = a;
        long l4 = b;
        while (true) {
            long l5 = l2;
            l = l3;
            long l6 = l4;
            if (l5 < 1L) break;
            l2 = l5 - 1L;
            l3 = l6;
            l4 = l + l6;
        }
        return l;
    }

    public static /* synthetic */ long fibonacci$default(long l, long l2, long l3, int n, Object object) {
        if ((n & 2) != 0) {
            l2 = 0L;
        }
        if ((n & 4) != 0) {
            l3 = 1L;
        }
        return fibonacci(l, l2, l3);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
