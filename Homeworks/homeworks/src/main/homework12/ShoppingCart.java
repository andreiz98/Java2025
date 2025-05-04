package homework12;

import java.util.*;

public class ShoppingCart {

    public static class ShoppingHistoryAnalyzer {
       public final Map<String, Integer> frequencyMap = new HashMap<>();

        public void addPurchases(List<List<String>> shoppingCarts) {
            for (List<String> cart : shoppingCarts) {
                for (String productId : cart) {
                    frequencyMap.put(productId, frequencyMap.getOrDefault(productId, 0) + 1);
                }
            }
        }

        public void addPurchase(List<String> cart) {
            for (String productId : cart) {
                frequencyMap.put(productId, frequencyMap.getOrDefault(productId, 0) + 1);
            }
        }

        public List<String> getTopKFrequentItems(int k) {
            if (k <= 0 || frequencyMap.isEmpty()) return Collections.emptyList();

            Map<Integer, List<String>> buckets = new HashMap<>();
            int maxFreq = 0;

            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                int freq = entry.getValue();
                maxFreq = Math.max(maxFreq, freq);
                buckets.computeIfAbsent(freq, x -> new ArrayList<>()).add(entry.getKey());
            }

            List<String> result = new ArrayList<>();
            for (int freq = maxFreq; freq > 0 && result.size() < k; freq--) {
                List<String> productsAtFreq = buckets.getOrDefault(freq, new ArrayList<>());
                result.addAll(productsAtFreq);
            }

            return result.size() > k ? result.subList(0, k) : result;
        }
    }
}

class TestShop{
    public static void main(String[] args) {
        ShoppingCart.ShoppingHistoryAnalyzer analyzer = new ShoppingCart.ShoppingHistoryAnalyzer();

        List<List<String>> carts = Arrays.asList(
                Arrays.asList("apple", "banana", "apple"),
                Arrays.asList("banana", "orange"),
                Arrays.asList("banana", "apple", "orange", "orange"),
                Arrays.asList("grape", "apple")
        );

        analyzer.addPurchases(carts);

        int k = 2;
        List<String> topItems = analyzer.getTopKFrequentItems(k);
        System.out.println("Top " + k + " most frequently purchased items:");
        for (String item : topItems) {
            System.out.println(item + " (count: " + analyzer.frequencyMap.get(item) + ")");
        }

        analyzer.addPurchase(Arrays.asList("grape", "grape", "banana"));

        System.out.println("\nAfter adding new purchase:");
        topItems = analyzer.getTopKFrequentItems(k);
        for (String item : topItems) {
            System.out.println(item + " (count: " + analyzer.frequencyMap.get(item) + ")");
        }
    }
}
