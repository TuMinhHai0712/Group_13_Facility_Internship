import java.util.List;

public class Knapsack {
    // Giải quyết bài toán cái túi với thuật toán tham lam
    public static int greedyKnapsack(int capacity, List<Item> items) {
        // Sắp xếp các đồ vật theo giá trị giảm dần
        items.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        int totalValue = 0;
        int totalWeight = 0;

        for (Item item : items) {
            // Nếu thêm đồ vật này vào không vượt quá sức chứa, thì cho vào
            if (totalWeight + item.weight <= capacity) {
                totalWeight += item.weight;
                totalValue += item.value;
            } else {
                // Nếu không thể thêm toàn bộ đồ vật vào, thì dưng thuật toán
                break;
            }
        }

        return totalValue;
    }
    // Hàm giải quyết bài toán cái túi bằng quy hoạch động
    public static int dynamicKnapsack(int W, List<Item> items, int n) {
        int[] dp = new int[W + 1];

        // Duyệt qua từng vật phẩm
        for (int i = 0; i < n; i++) {
            for (int w = W; w >= items.get(i).weight; w--) {
                dp[w] = Math.max(dp[w], dp[w - items.get(i).weight] + items.get(i).value);
            }
        }

        // Trả về giá trị tối đa có thể mang trong túi
        return dp[W];
    }

    // Hàm truy vết để xác định các vật phẩm đã chọn
    public static void findItems(int W, List<Item> items, int n) {
        int[] dp = new int[W + 1];

        // Duyệt qua các vật phẩm để tính dp
        for (int i = 0; i < n; i++) {
            for (int w = W; w >= items.get(i).weight; w--) {
                dp[w] = Math.max(dp[w], dp[w - items.get(i).weight] + items.get(i).value);
            }
        }

        // Bắt đầu truy vết từ dp[W]
        int w = W;
        System.out.println("Các vật phẩm được chọn:");
        for (int i = n - 1; i >= 0; i--) {
            // Kiểm tra xem vật phẩm i có được chọn không
            if (w >= items.get(i).weight && dp[w] == dp[w - items.get(i).weight] + items.get(i).value) {
                System.out.println("Vật phẩm " + (i + 1) + ": Trọng lượng = " + items.get(i).weight + ", Giá trị = " + items.get(i).value);
                w -= items.get(i).weight;  // Giảm dung lượng túi
            }
        }
    }


}
