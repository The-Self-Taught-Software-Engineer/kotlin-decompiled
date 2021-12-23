package object.value.java;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class SingletonObject {
    public static final void main() {
        Object object = new AbstractCollection<String>() {
            @NotNull
            private final List<String> backing = new ArrayList();

            @Override
            public int size() {
                Collection collection = this.backing;
                return collection.size();
            }

            @NotNull
            public Iterator<String> iterator() {
                return this.backing.listIterator();
            }

            @NotNull
            public final Spliterator<String> spliterator() {
                Spliterator<String> spliterator = this.backing.spliterator();
                Intrinsics.checkNotNullExpressionValue(spliterator, "this.backing.spliterator()");
                return spliterator;
            }
        };
        AbstractCollection<String> $this$main_u24lambda_u2d0 = (AbstractCollection<String>) object;
        $this$main_u24lambda_u2d0.add("Kotlin");
        $this$main_u24lambda_u2d0.add("Java");
        $this$main_u24lambda_u2d0.add("Scala");
        $this$main_u24lambda_u2d0.add("Clojure");
        AbstractCollection<String> occurrenceCollection2 = (AbstractCollection<String>) object;
        object = occurrenceCollection2.spliterator();
        System.out.println(object);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
