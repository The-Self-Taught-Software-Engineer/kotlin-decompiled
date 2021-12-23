package delegation.java;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("ALL")
public final class Website {
    @NotNull
    private final URL url;
    @NotNull
    private final Lazy contents$delegate;

    public Website(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.contents$delegate = LazyKt.lazy(new Function0<String>() {
            final /* synthetic */ Website this$0 = Website.this;

            @NotNull
            public final String invoke() {
                URL uRL = this.this$0.getUrl();
                Charset charset = Charsets.UTF_8;
                byte[] arrby = TextStreamsKt.readBytes(uRL);
                return new String(arrby, charset);
            }
        });
    }

    public Website(@NotNull String url) throws MalformedURLException {
        this(new URL(url));
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public static /* synthetic */ Website copy$default(Website website, URL uRL, int n, Object object) {
        if ((n & 1) != 0) {
            uRL = website.url;
        }
        return website.copy(uRL);
    }

    @NotNull
    public final URL getUrl() {
        return this.url;
    }

    @NotNull
    public final String getContents() {
        Lazy lazy = this.contents$delegate;
        return (String) lazy.getValue();
    }

    @NotNull
    public final URL component1() {
        return this.url;
    }

    @NotNull
    public final Website copy(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Website(url);
    }

    @NotNull
    public String toString() {
        return "Website(url=" + this.url + ')';
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Website)) {
            return false;
        }
        Website website = (Website) other;
        return Intrinsics.areEqual(this.url, website.url);
    }
}
