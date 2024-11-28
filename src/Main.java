import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách đồ vật (value, weight)
        List<Item> items = new ArrayList<>();
        items.add(new Item(70, 15));
        items.add(new Item(100, 20));
        items.add(new Item(120, 30));

        int capacity = 50;  // Sức chứa của túi

        // Giải quyết bài toán bằng thuật toán tham lam
        int result = Knapsack.greedyKnapsack(capacity, items);
        System.out.println("Giá trị tối đa có thể có trong túi là: " + result);
    }
    }
