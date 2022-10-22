package pro.sky.HomeWork20_2_11_Spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HomeWork20_2_11_Spring.Magazine.Item;
import pro.sky.HomeWork20_2_11_Spring.Service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final StoreService storeService;

    public BasketController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids){
         storeService.add(ids);
    }

    @GetMapping("/get")
    public List get(){
        return storeService.get();
    }

    @GetMapping("/list")
    public List list(){
        return storeService.list();
    }
}
