package object.singleton.java;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class SpliteratorStringList extends AbstractCollection<String> {
    @NotNull
    public static final SpliteratorStringList INSTANCE = new SpliteratorStringList();
    @NotNull
    private static final List<String> backing;

    static {
        backing = new ArrayList();
    }

    private SpliteratorStringList() {
    }

    @Override
    public int size() {
        Collection collection = backing;
        return collection.size();
    }

    @Override
    @NotNull
    public Iterator<String> iterator() {
        return backing.listIterator();
    }

    @Override
    @NotNull
    public final Spliterator<String> spliterator() {
        Spliterator<String> spliterator = backing.spliterator();
        Intrinsics.checkNotNullExpressionValue(spliterator, "backing.spliterator()");
        return spliterator;
    }
}
