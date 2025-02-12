package io.github.some_example_name;

public class GridStatus {
    private boolean available;
    private boolean immutable;

    public GridStatus(boolean available) {
        this.available = available;
        this.immutable = false; // Initially mutable
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean setAvailable(boolean available) {
        if (!immutable) {
            this.available = available;
        }
        return this.available;
    }

    public void makeImmutable() {
        this.immutable = true;
    }

    public boolean getImmutable() {
        return immutable;}
}
