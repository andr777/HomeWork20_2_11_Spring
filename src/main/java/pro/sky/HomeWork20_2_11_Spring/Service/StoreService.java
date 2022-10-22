package pro.sky.HomeWork20_2_11_Spring.Service;

import org.springframework.stereotype.Service;
import pro.sky.HomeWork20_2_11_Spring.Magazine.Basket;
import pro.sky.HomeWork20_2_11_Spring.Magazine.Item;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {


    private final Map<Integer, Item> items = new HashMap<>();
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    @PostConstruct
    public void init() {
        items.put(1, new Item(1, "book1", 100));
        items.put(2, new Item(2, "book2", 102));
        items.put(3, new Item(3, "book22", 133));
        items.put(4, new Item(4, "book44book44", 104));

    }

    public List<Item> get() {
        return basket.getItemFromList();
    }


    public void add(List<Integer> ids) {
            basket.addItemToList(
                    ids.stream()
                            .filter((s)-> s.intValue() <= this.items.size() )
                            .map(items::get)
                            .collect(Collectors.toList())
                               );

    }

    public List list() {
        return items.entrySet().stream()
                .collect(Collectors.toList());
    }
}
