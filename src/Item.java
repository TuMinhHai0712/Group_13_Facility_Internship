import java.util.*;
public class Item {
    int value;  // Giá trị của đồ vật
    int weight; // Trọng lượng của đồ vật

    // Constructor
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Tính tỷ lệ giá trị/trọng lượng
    public double getValuePerWeight() {
        return (double) value / weight;
    }
}
