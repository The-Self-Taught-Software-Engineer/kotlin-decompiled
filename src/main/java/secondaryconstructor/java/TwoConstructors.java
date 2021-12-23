package secondaryconstructor.java;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class TwoConstructors {
    @NotNull
    private final Number number;

    public TwoConstructors(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.number = number;
    }

    public TwoConstructors(@NotNull String number) {
        this(Long.parseLong(number));
        Intrinsics.checkNotNullParameter(number, "number");
    }

    @NotNull
    public String toString() {
        return "TwoConstructors(number=" + this.number + ')';
    }
}
