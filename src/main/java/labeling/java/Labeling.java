package labeling.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

@SuppressWarnings("ALL")
public final class Labeling {
    public static final void main() {
        Object[] arrobject = new Integer[]{1, 2, 3};
        Iterable iterable = CollectionsKt.listOf((Object[]) arrobject);
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : iterable) {
            List list;
            block:
            {
                int number = ((Number) element$iv$iv).intValue();
                Object[] arrobject2 = new Integer[]{number, 0};
                Iterable iterable2 = CollectionsKt.listOf((Object[]) arrobject2);
                Collection destination$iv$iv2 = new ArrayList();
                for (Object element$iv$iv2 : iterable2) {
                    int innerNumber = ((Number) element$iv$iv2).intValue();
                    if (innerNumber == 0) {
                        list = CollectionsKt.listOf((Object) number);
                        break block;
                    }
                    destination$iv$iv2.add(element$iv$iv2);
                }
                list = (List) destination$iv$iv2;
            }
            CollectionsKt.addAll((Collection) destination$iv$iv, (Iterable) list);
        }
        List numbers = (List) destination$iv$iv;
        System.out.println(numbers);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
