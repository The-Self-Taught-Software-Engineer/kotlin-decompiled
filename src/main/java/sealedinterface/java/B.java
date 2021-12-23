package sealedinterface.java;

import org.jetbrains.annotations.NotNull;

public final class B implements Sealed {
    @NotNull
    public static final B INSTANCE = new B();

    private B() {
    }
}
