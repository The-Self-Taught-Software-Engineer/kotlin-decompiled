package operatoroverloading.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("ALL")
public final class Velocity {
    private final int x;
    private final int y;

    public Velocity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static /* synthetic */ Velocity copy$default(Velocity velocity, int n, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = velocity.x;
        }
        if ((n3 & 2) != 0) {
            n2 = velocity.y;
        }
        return velocity.copy(n, n2);
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    @NotNull
    public final Velocity times(int i) {
        return new Velocity(this.x * i, this.y * i);
    }

    public final int component1() {
        return this.x;
    }

    public final int component2() {
        return this.y;
    }

    @NotNull
    public final Velocity copy(int x, int y) {
        return new Velocity(x, y);
    }

    @NotNull
    public String toString() {
        return "Velocity(x=" + this.x + ", y=" + this.y + ')';
    }

    public int hashCode() {
        int result = Integer.hashCode(this.x);
        result = result * 31 + Integer.hashCode(this.y);
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Velocity)) {
            return false;
        }
        Velocity velocity = (Velocity) other;
        if (this.x != velocity.x) {
            return false;
        }
        return this.y == velocity.y;
    }
}
