package extension.function.java;

@SuppressWarnings("ALL")
public final class ExtensionFunction {
    public static final void main() {
        boolean bl = isEven(2);
        System.out.println(bl);
        bl = isOdd(2);
        System.out.println(bl);
    }

    public static final boolean isEven(int $this$isEven) {
        return $this$isEven % 2 == 0;
    }

    public static final boolean isOdd(int $this$isOdd) {
        return !isEven($this$isOdd);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
