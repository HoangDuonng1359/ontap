package Windows;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Item{
    private List<Item> items = new ArrayList<>();
    @Override
    public double getSize() {
        double size = 0;
        for (Item item : items){
            size = size + item.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "items=" + items +
                '}';
    }

    public List<Item> getItems() {
        return items;
    }
    public void addItem(Item item){
        items.add(item);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
