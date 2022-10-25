import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Gate {
    protected List<Purchase> purchases;

    public Gate(List<Purchase> purchases){
        this.purchases = purchases;
    }

    public Gate(Purchase[] purchases){
        this.purchases = new ArrayList<>(List.of(purchases));
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        for (int i = 0; i < purchases.size(); i++) {
            Purchase purchase = purchases.get(i);
            if (purchase == null) continue;
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
