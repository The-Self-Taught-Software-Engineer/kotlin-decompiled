package nullabilityoperator.java;

import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

@SuppressWarnings("ALL")
public final class NullabilityOperator {
    public static final void main() {
        Object[] arrobject = new String[]{"Kotlin", "Java"};
        String string = (String) CollectionsKt.getOrNull(CollectionsKt.listOf(arrobject), 1);
        Character letter = string == null ? null : Character.valueOf(StringsKt.first(string));
        System.out.println(letter);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
