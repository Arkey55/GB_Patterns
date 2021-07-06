package ru.romankuznetsov.prototype.dz3;

import java.util.Objects;

public class Shorts extends Product {
    private int size;
    private String color;
    private String fabric;

    public Shorts() {
    }

    public Shorts(Shorts shorts){
        super(shorts);
        if (shorts != null){
            this.size = shorts.size;
            this.color = shorts.color;
            this.fabric = shorts.fabric;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public Product clone() {
        return new Shorts(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shorts) || !super.equals(obj)) return false;
        Shorts shorts = (Shorts) obj;
        return shorts.size == size && Objects.equals(shorts.color, color) && Objects.equals(shorts.fabric, fabric);
    }
}
