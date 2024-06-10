package Windows;

import java.util.ArrayList;
import java.util.List;

public class FS extends Item {
    List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "FS{" +
                "items=" + items +
                '}';
    }
    public String getName() {
        return "FS";
    }
    public void addItem(Item item){
        items.add(item);
    }
    @Override
    public double getSize() {
        double size = 0;
        for (Item item : items){
            size = size + item.getSize();
        }
        return size;
    }
}
