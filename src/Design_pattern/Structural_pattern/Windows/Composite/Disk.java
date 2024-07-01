package Design_pattern.Structural_pattern.Windows.Composite;

import java.util.ArrayList;
import java.util.List;

public class Disk extends Item{
    List<Item> items = new ArrayList<>();
    private double capacity = 100.0;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public void addItem(Item item){
        items.add(item);
    }
    @Override
    public String toString() {
        return "Disk{" +
                "items=" + items +
                ", capacity=" + capacity +
                ", name='" + getName() + '\'' +
                '}';
    }

    @Override
    public double getSize() {
        double size = 0;
        for (Item item : items){
            size = size + item.getSize();
        }
        return size;
    }
    public double getFreeSpace(){
        return capacity - getSize();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
