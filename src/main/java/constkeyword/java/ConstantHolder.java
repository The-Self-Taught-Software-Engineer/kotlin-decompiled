package constkeyword.java;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class ConstantHolder {
    @NotNull
    public static final ConstantHolder INSTANCE = new ConstantHolder();
    private static final int CONSTANT = 11;

    private ConstantHolder() {
    }

    public final int combine(int value) {
        return value + 11;
    }
}
