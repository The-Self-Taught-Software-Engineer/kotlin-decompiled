package sealedinterface.java;

import org.jetbrains.annotations.NotNull;

public final class C implements Sealed {
    @NotNull
    public static final C INSTANCE = new C();

    private C() {
    }
}
