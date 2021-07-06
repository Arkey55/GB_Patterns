package ru.romankuznetsov.prototype.dz3;

public class Application {
    public static void main(String[] args) {

        Apple a1 = new Apple();
        a1.setName("apple");
        a1.setPrice(50);
        a1.setSort("red gala");
        a1.setWeight(150);

        Shorts s1 = new Shorts();
        s1.setName("shorts");
        s1.setPrice(700);
        s1.setSize(54);
        s1.setColor("gray");
        s1.setFabric("denim");

        Product a2 = a1.clone();
        Shorts s2 = (Shorts) s1.clone();

        if (a1 != a2 && a1.equals(a2)) {
            System.out.println("Apple objects are different but equals");
        }

        if (s1 != s2 && s1.equals(s2)) {
            System.out.println("Shorts objects are different but equals");
        }
    }
}
