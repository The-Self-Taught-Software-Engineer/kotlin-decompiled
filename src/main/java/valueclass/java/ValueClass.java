package valueclass.java;

@SuppressWarnings("ALL")
public final class ValueClass {
    public static final void main() {
        Celcius celcius = Celcius.boxImpl(Celcius.constructorImpl(19.6));
        System.out.println(celcius);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
