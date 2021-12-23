package lateinitkeyword.java;

@SuppressWarnings("ALL")
public final class LateinitKeyword {
    public static final void main() {
        Lateinit lateinit = new Lateinit();
        Lateinit it = lateinit;
        it.init(11);
        System.out.println(lateinit);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
