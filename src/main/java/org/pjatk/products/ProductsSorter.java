package org.pjatk.products;

import java.util.ArrayList;

public class ProductsSorter {

    //można wykorzystać algorytm sortowania przez wstawiania
    public static ArrayList<Product> sort(ArrayList<Product> products){
        ArrayList<Product> result = new ArrayList<>();
        for(Product p: products){
            int index = 0;
            for(Product product: result){
                if(p.price > product.price){
                    index++;
                }
            }
            result.add(index, p);
        }
        return  result;
    }

    public static Product mostExpensive(ArrayList<Product> products){
        Product a = products.get(0);
        for(int i=0; i<products.size(); i++){
            Product b = products.get(i);
            if(b.price > a.price){
                a = b;
            }
        }
        return a;
    }


    public static Product theCheapest(ArrayList<Product> products){
        Product a = products.get(0);
        for(int i=0; i<products.size(); i++){
            Product b = products.get(i);
            if(b.price < a.price){
                a = b;
            }
        }
        return a;
    }

    public static ArrayList<Product> theCheapest(ArrayList<Product> products, int n){
        ArrayList<Product> result = new ArrayList<>();
        for(Product p: products){
            int index = 0;
            for(Product product: result){
                if(product.price < p.price){
                    index++;
                }
            }
            result.add(index, p);
        }
        return result;
    }
}
