package Greedy;

import java.util.*;

class Item {
    public int val;
    public int wt;
    public double ratio;

    public Item(int val, int wt) {
        this.val = val;
        this.wt = wt;
        this.ratio = (double) val / wt;
    }
}

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double r1 = a.ratio;
        double r2 = b.ratio;
        if (r1 < r2) {
            return 1;
        } else if (r1 > r2) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class FractionalKnapsack {

    public static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < val.size(); i++) {
            items.add(new Item(val.get(i), wt.get(i)));
        }

        Collections.sort(items, new ItemComparator());

        double res = 0.0;
        int weight = 0;

        for (Item item : items) {
            if (weight + item.wt <= capacity) {
                weight += item.wt;
                res += item.val;
            } else {
                int remainingWeight = capacity - weight;
                res += item.ratio * remainingWeight;
                break;
            }
        }

        return Math.round(res * 1_000_000.0) / 1_000_000.0;
    }

}
