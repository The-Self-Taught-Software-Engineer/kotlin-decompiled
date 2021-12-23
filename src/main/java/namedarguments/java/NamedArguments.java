package namedarguments.java;

import dataclass.java.Search;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class NamedArguments {
    public static final void main() {
        prepareSearch("Kotlin", true);
    }

    @NotNull
    public static final Search prepareSearch(@NotNull String query, boolean start) {
        Intrinsics.checkNotNullParameter(query, "query");
        Search search = new Search(query, null, 2, null);
        Search it = search;
        if (start) {
            it.start();
        }
        return search;
    }

    public static /* synthetic */ Search prepareSearch$default(String string, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return prepareSearch(string, bl);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
