package localfunction.java;

@SuppressWarnings("ALL")
public final class LocalFunction {
    public static final void main() {
        String string = "main";
        System.out.println(string);
        main$main2();
    }

    private static final void main$main2() {
        String string = "main2";
        System.out.println(string);
        main$main2$main3();
    }

    private static final void main$main2$main3() {
        String string = "main3";
        System.out.println(string);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
