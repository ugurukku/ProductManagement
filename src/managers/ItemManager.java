package managers;

import entities.Item;
import services.BaseService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ItemManager implements BaseService<Item> {

    static List<Item> items = Arrays.asList(new Item(1, "Ağ ayaqqabı", true, 2, 34.89, 1, 4, 2), new Item(2, "Qara ayaqqabı", true, 2, 39.89, 1, 4.3, 2), new Item(3, "Əjdaha cüzdan", false, 3, 4.30, 1, 4, 2), new Item(4, "T-shirt", true, 1, 20, 1, 3.8, 2));

    @Override
    public Item getById(int id) {

        AtomicReference<Item> _item = new AtomicReference<>();

        items.forEach(item -> {
            if (item.getId() == id) {
                _item.set(item);
            }
        });
        return _item.get();
    }

    @Override
    public List<Item> getAll() {
        return items;
    }

    @Override
    public void deleteById(int id) {
        AtomicReference<Item> deletingItem = new AtomicReference<>();

        items.forEach(item -> {
            if (item.getId() == id) {
                deletingItem.set(item);
            }
        });

        items.remove(deletingItem.get());
    }

}
