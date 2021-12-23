package ifexpression.java;

import java.util.Random;

@SuppressWarnings("ALL")
public final class IfExpression {
    public static final void main() {
        int number = new Random().nextInt(10);
        String log = number < 3 && number > 1 ? "A" : (number > 8 ? "B" : (number == 1 ? "C" : "D"));
        System.out.println(log);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
