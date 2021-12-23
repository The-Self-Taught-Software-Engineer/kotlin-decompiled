package readonlycollection.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.TypeIntrinsics;

@SuppressWarnings("ALL")
public final class ReadOnlyCollection {
    public static final void main() {
        Object[] arrobject = new Integer[]{1, 2, 3, 4, 5};
        List readOnlyList = CollectionsKt.toList(SetsKt.setOf(arrobject));
        System.out.println(readOnlyList);
        TypeIntrinsics.asMutableList(readOnlyList).add(6);
        System.out.println(readOnlyList);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
