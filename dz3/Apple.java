package ru.romankuznetsov.prototype.dz3;

import java.util.Objects;

public class Apple extends Product {
    private String sort;
    private int weight;

    public Apple() {
    }

    public Apple(Apple apple){
        super(apple);
        if (apple != null){
            this.sort = apple.sort;
            this.weight = apple.weight;
        }
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Product clone() {
        return new Apple(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Apple) || !super.equals(obj)) return false;
        Apple apple = (Apple) obj;
        return Objects.equals(apple.sort, sort) && apple.weight == weight;
    }
}
