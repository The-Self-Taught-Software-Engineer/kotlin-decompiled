package labeling.java;

public final class ThisLabeling {
    public static final void main() {
        String string = new Outer.Inner(new Outer()).toString();
        System.out.println(string);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
