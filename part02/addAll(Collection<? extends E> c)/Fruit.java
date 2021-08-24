package main;

/**
 * 水果
 */
public class Fruit {
    /**
     * 名称
     */
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}