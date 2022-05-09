package day25;

public class Item implements Comparable<Item>{
    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        return Float.compare(this.price,o.price);
    }
}
