package labeling.java;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class Outer {
    public static final class Inner {
        private final Outer outer;

        public Inner(Outer outer) {
            Intrinsics.checkNotNullParameter(outer, "this$0");
            this.outer = outer;
        }

        public final void foo(int $this$foo) {
            Outer outer = this.outer;
            Outer.Inner inner = this;

            int c = $this$foo;
            int c1 = $this$foo;

            // Function1 funLit3 = foo.funLit.1.INSTANCE;

            Function1 funLit22 = new Function1<String, Unit>() {
                final /* synthetic */ int $this_foo = $this$foo;

                public final Unit invoke(@NotNull String s) {
                    Intrinsics.checkNotNullParameter(s, "s");
                    int d1 = this.$this_foo;
                    return null;
                }
            };
        }
    }
}
