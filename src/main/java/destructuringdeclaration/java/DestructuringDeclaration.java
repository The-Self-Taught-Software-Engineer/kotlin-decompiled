package destructuringdeclaration.java;

import dataclass.java.Search;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressWarnings("ALL")
public final class DestructuringDeclaration {
    public static final void main() {
        Search search = new Search("Kotlin", new AtomicInteger(100));
        String query = search.component1();
        AtomicInteger hits = search.component2();
        String string = "Found " + hits + " hits for query '" + query + '\'';
        System.out.println(string);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
