package trycatchexpression.java;

import java.util.Random;

@SuppressWarnings("ALL")
public final class TryCatchExpression {
    public static final void main() {
        Number number;
        try {
            number = 100 / new Random().nextInt(3);
        } catch (ArithmeticException exception) {
            number = 0;
        }
        System.out.println(number);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
