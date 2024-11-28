import java.util.List;

public class Knapsack {
    // Giải quyết bài toán cái túi với thuật toán tham lam
    public static int greedyKnapsack(int capacity, List<Item> items) {
        // Sắp xếp các đồ vật theo tỷ lệ giá trị/trọng lượng giảm dần
        items.sort((a, b) -> Double.compare(b.getValuePerWeight(), a.getValuePerWeight()));

        int totalValue = 0;
        int totalWeight = 0;

        for (Item item : items) {
            // Nếu thêm đồ vật này vào không vượt quá sức chứa, thì cho vào
            if (totalWeight + item.weight <= capacity) {
                totalWeight += item.weight;
                totalValue += item.value;
            } else {
                // Nếu không thể thêm toàn bộ đồ vật vào, thì kết thúc (vì không chia nhỏ đồ vật)
                break;
            }
        }

        return totalValue;
}}
