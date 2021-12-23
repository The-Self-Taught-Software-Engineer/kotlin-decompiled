package dataclass.java;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("ALL")
public final class Search {
    @NotNull
    private final String query;
    @NotNull
    private final AtomicInteger hits;

    public Search(@NotNull String query, @NotNull AtomicInteger hits) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(hits, "hits");
        this.query = query;
        this.hits = hits;
    }

    public /* synthetic */ Search(String string, AtomicInteger atomicInteger, int n, DefaultConstructorMarker defaultConstructorMarker) {
        this(string, atomicInteger);
        if ((n & 2) != 0) {
            atomicInteger = new AtomicInteger(0);
        }
    }

    public static /* synthetic */ Search copy$default(Search search, String string, AtomicInteger atomicInteger, int n, Object object) {
        if ((n & 1) != 0) {
            string = search.query;
        }
        if ((n & 2) != 0) {
            atomicInteger = search.hits;
        }
        return search.copy(string, atomicInteger);
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    public final AtomicInteger getHits() {
        return this.hits;
    }

    public final void start() {
        String string = "Search for query " + this.query + " started";
        System.out.println(string);
    }

    @NotNull
    public final String component1() {
        return this.query;
    }

    @NotNull
    public final AtomicInteger component2() {
        return this.hits;
    }

    @NotNull
    public final Search copy(@NotNull String query, @NotNull AtomicInteger hits) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(hits, "hits");
        return new Search(query, hits);
    }

    @NotNull
    public String toString() {
        return "Search(query=" + this.query + ", hits=" + this.hits + ')';
    }

    public int hashCode() {
        int result = this.query.hashCode();
        result = result * 31 + this.hits.hashCode();
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Search)) {
            return false;
        }
        Search search = (Search) other;
        if (!Intrinsics.areEqual(this.query, search.query)) {
            return false;
        }
        return Intrinsics.areEqual(this.hits, search.hits);
    }
}
