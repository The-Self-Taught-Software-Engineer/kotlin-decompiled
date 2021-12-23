package operatoroverloading.java;

import operatoroverloading.kotlin.Velocity;

@SuppressWarnings("ALL")
public final class Overloading {
    public static final void main() {
        Velocity velocity = new Velocity(10, 50);
        Velocity velocity2 = velocity.times(2);
        System.out.println(velocity2);
    }

    public static /* synthetic */ void main(String[] args) {
        main();
    }
}
