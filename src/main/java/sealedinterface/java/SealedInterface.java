package sealedinterface.java;

import java.util.Random;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

@SuppressWarnings("ALL")
public final class SealedInterface {
    public static final void main() {
        String string;
        Sealed sealed = getRandom();
        if (sealed instanceof A) {
            string = "A";
        } else if (sealed instanceof B) {
            string = "B";
        } else if (sealed instanceof C) {
            string = "C";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String log = string;
        System.out.println(log);
    }

    private static final Sealed getRandom() {
        Object[] arrobject = new Sealed[]{A.INSTANCE, B.INSTANCE, C.INSTANCE};
        return (Sealed) CollectionsKt.listOf(arrobject).get(new Random().nextInt(3));
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
