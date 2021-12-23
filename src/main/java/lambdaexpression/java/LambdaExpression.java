package lambdaexpression.java;

import java.util.Random;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@SuppressWarnings("ALL")
public final class LambdaExpression {
    public static final void main() {
        int number = new Random().nextInt();
        Function1 closure2 = new Function1<Integer, Integer>() {
            final /* synthetic */ int $number = number;

            @Override
            public final Integer invoke(Integer other) {
                return Intrinsics.compare(this.$number, other);
            }
        };
        String string = number + ": " + ((Number) closure2.invoke(1000)).intValue();
        System.out.println(string);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
