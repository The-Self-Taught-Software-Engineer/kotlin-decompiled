package nullabilityignoreoperator.java;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@SuppressWarnings("ALL")
public final class NullabilityIgnoreOperator {
    public static final void main() {
        Object[] arrobject = new String[]{"Kotlin", "Java"};
        String string = (String) CollectionsKt.getOrNull(CollectionsKt.listOf(arrobject), 1);
        Character c = string == null ? null : Character.valueOf(StringsKt.first(string));
        Intrinsics.checkNotNull(c);
        char letter = c.charValue();
        System.out.println(letter);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
