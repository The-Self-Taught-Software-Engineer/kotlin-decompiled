package lateinitkeyword.java;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class Lateinit {
    private Number number;

    public final void init(@NotNull Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.number = value;
    }

    @NotNull
    public String toString() {
        Number number = this.number;
        if (number == null) {
            Intrinsics.throwUninitializedPropertyAccessException("number");
            throw null;
        }
        return "Lateinit(number=" + number + ')';
    }
}
