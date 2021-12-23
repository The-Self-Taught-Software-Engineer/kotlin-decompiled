package companionobject.java;

@SuppressWarnings("ALL")
public final class CompanionObject {
    public static final void main() {
        CompanionParent companionParent = new CompanionParent(10);
        System.out.println(companionParent);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
