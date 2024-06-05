package org.pjatk.products;

import java.util.ArrayList;

public class DiscountCalculator {

    public ArrayList<Product> products;

    /*
        minimumPrice - cena minimalna, od której zaczyna się naliczanie rabatu
        percentage - liczba od 0 do 1, określająca jaki procent rabatu jest przyznany, np 0.1 to 10%
     */
    public void discountByPercentage(double minimumPrice, double percentage) {
        double a = 0;
        for (Product p : products) {
            a += p.price;
            if (a > minimumPrice) {
                p.price = p.price - (p.price * percentage);
            }
        }
    }

    public void addFreeCompanyGlass(double minimumPrice){
        ArrayList<Product> copy = new ArrayList<>();
        double b = 0;
        Product kubek = new Product();
        for(Product p: products){
            b += p.price;
            if(b > minimumPrice){
                copy.add(kubek);
            }
        }
        products.addAll(copy);
    }


}
