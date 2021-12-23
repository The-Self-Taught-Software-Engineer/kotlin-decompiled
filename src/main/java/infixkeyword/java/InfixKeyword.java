package infixkeyword.java;

import java.util.Random;

@SuppressWarnings("ALL")
public final class InfixKeyword {
    public static final void main() {
        int upperBound = 10;
        int n = new Random().nextInt(upperBound * 2);
        n = 0 <= n ? (n < upperBound ? 1 : 0) : 0;
        System.out.println(n != 0);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
