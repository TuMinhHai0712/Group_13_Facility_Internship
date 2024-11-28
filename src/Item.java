import java.util.*;
public class Item {
    int value;  // Giá trị của đồ vật
    int weight; // Trọng lượng của đồ vật

    // Constructor
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    // Tính tỷ lệ giá trị/trọng lượng
    public double getValuePerWeight() {
        return (double) value / weight;
    }
}
