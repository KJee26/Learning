package DesignPattern.Dp04_BuilderPattern;

import DesignPattern.Dp04_BuilderPattern.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    /**
     * 添加商品
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 计算总价
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }


}
