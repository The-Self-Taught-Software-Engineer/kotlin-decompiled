package typecasting.safe.java;

@SuppressWarnings("ALL")
public final class SafeTypeCastingKt {
    public static final void main() {
        Number number = 6;
        Object object = number instanceof String ? (String) ((Object) number) : null;
        object = object == null ? null : ((String) object).chars();
        System.out.println(object);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
