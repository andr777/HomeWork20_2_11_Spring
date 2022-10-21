package pro.sky.HomeWork20_2_11_Spring.Magazine;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Basket {

    private final List<Item> item;


    public Basket(List<Item> item) {
        this.item = new ArrayList<>();
    }

    public void addItemToList(List<Item> items){
        this.item.addAll(items);
    }


    public List<Item> getItemFromList() {
        return new ArrayList<>(item);
    }


}
