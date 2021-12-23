package companionobject.java;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class CompanionParent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int CONSTANT = 11;
    private final int number;

    public CompanionParent(int value) {
        this.number = Companion.combine(value);
    }

    @NotNull
    public String toString() {
        return "CompanionParent(number=" + this.number + ')';
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private final int combine(int value) {
            return value + CONSTANT;
        }
    }
}
