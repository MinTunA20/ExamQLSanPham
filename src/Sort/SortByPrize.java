package Sort;

import Model.Product;

import java.util.Comparator;

public class SortByPrize implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrize() > o2.getPrize()){
        return 1;
    }
        return -1;
    }
}

