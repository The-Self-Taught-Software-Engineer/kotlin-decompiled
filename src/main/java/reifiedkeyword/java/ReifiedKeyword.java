package reifiedkeyword.java;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public final class ReifiedKeyword {
    public static final void main(@NotNull String[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        List list = Reflection.getOrCreateKotlinClass(String[].class).getSupertypes();
        System.out.println(list);
    }

    // This method is unused, the contents are instead inlined at the call-site above
    public static final /* synthetic */ <T> List<KType> superTypes(T $this$superTypes) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return Reflection.getOrCreateKotlinClass(Object.class).getSupertypes();
    }
}
