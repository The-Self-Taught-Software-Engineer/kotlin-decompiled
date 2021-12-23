package inkeyword.java;

import kotlin.collections.CollectionsKt;

@SuppressWarnings("ALL")
public final class InKeyword {
    public static final void main() {
        Object[] arrobject = new Integer[]{1, 2, 3, 4, 5};
        boolean bl = CollectionsKt.listOf(arrobject).contains(5);
        System.out.println(bl);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
