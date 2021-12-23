package constkeyword.java;

@SuppressWarnings("ALL")
public final class ConstKeyword {
    public static final void main() {
        int n = ConstantHolder.INSTANCE.combine(10);
        System.out.println(n);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
