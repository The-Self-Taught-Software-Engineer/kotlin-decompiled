package sealedinterface.java;

import org.jetbrains.annotations.NotNull;

public final class A implements Sealed {
    @NotNull
    public static final A INSTANCE = new A();

    private A() {
    }
}
