package elvisoperator.java;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class ElvisOperator {
    public static final void main(@NotNull String[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Integer n = StringsKt.toIntOrNull(ArraysKt.first(args));
        if (n == null) {
            String string = "Invalid input";
            throw new IllegalStateException(string);
        }
        System.out.println((int) n);
    }
}
