package typecasting.unsafe.java;

import kotlin.text.CharsKt;

@SuppressWarnings("ALL")
public final class UnsafeTypeCasting {
    public static final void main() {
        int number = 6;
        char c = CharsKt.digitToChar(number);
        System.out.println(c);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
