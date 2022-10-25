import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenDase {
    public GenDase(List<Purchase> purchases) {

    }

    public static void showAllProductsPricesAndAmount(Map<String, Integer> prices, List<Purchase> purchases){
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.size(); i++) {
            Purchase purchase = purchases.get(i);
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
        }
    }

    public long sum(HashMap<String, Integer> products) {
        return 0;
    }
}
