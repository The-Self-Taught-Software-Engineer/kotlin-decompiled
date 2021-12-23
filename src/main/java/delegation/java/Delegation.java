package delegation.java;

import java.net.MalformedURLException;

@SuppressWarnings("ALL")
public final class Delegation {
    public static final void main() throws MalformedURLException {
        Website kotlinWebsite = new Website("https://kotlinlang.org");
        String string = kotlinWebsite.getContents();
        System.out.println(string);
    }

    public static /* synthetic */ void main(String[] args) throws MalformedURLException {
        main();
    }
}
