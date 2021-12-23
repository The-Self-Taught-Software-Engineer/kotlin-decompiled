package initblock.java;

@SuppressWarnings("ALL")
public final class PositiveInt {
    private final int number;

    public PositiveInt(int number) {
        this.number = number;
        boolean bl = this.number >= 0;
        if (!bl) {
            String string = this.number + " is not positive";
            throw new IllegalArgumentException(string);
        }
    }
}
