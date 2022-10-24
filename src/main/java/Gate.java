import java.util.HashMap;
import java.util.Map;


import static java.util.Map.entry;
// Конструктор
public class Gate implements GenDase {
    public static final Gate INSTANCE = new Gate();

    private static final Map<String, Integer> products = Map.ofEntries(
            entry("Хлеб", 56),
            entry("Масло", 153),
            entry("Колбаса", 211),
            entry("Пирожок", 45)
    );
// отдельно вывели из Main
    @Override
    public Map<String, Integer> getProducts() {
        return new HashMap<>(products);
    }

   
    private Gate() {
    }

    
    public static Gate getInstance() {
        return INSTANCE;
    }
}
