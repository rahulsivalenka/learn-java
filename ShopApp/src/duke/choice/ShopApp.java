/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author rahul.sivalenka
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        System.out.println("Customer is " + c1.name);

        int measurement = 3;
//        switch (measurement) {
//            case 1, 2, 3:
//                c1.size = "S";
//                break;
//            case 4, 5, 6:
//                c1.size = "M";
//
//            case 7, 8, 9:
//                c1.size = "L";
//            default:
//                c1.size = "X";
//        }
        switch (measurement) {
            case 1: case 2: case 3:
                c1.size = "S";
                break;
            case 4: case 5: case 6:
                c1.size = "M";
            case 7: case 8: case 9:
                c1.size = "L";
            default:
                c1.size = "X";
        }
        
        System.out.println("Size is " + c1.size);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing[] items = { item1, item2, new Clothing(), new Clothing() };
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        items[2].description = "Green Scarf";
        items[2].price = 5.0;
        items[2].size = "S";
        
        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";

//        System.out.println("Item1 is "
//                + item1.description + ","
//                + item1.price + ","
//                + item1.size);
//
//        System.out.println("Item2 is "
//                + item2.description + ","
//                + item2.price + ","
//                + item2.size);
        
        // double costWithoutTax = item1.price + item2.price * 2;
        // total = costWithoutTax + costWithoutTax * tax;
        // total = costWithoutTax * 1 + costWithoutTax * tax;
        // total = costWithoutTax * (1 + tax);
        // total = (item1.price + item2.price * 2) * (1 + tax);
        double tax = 0.2;
        double total = 0.0;
//        for(int i = 0; i < items.length; i++) {
//            Clothing item = items[i];
//        for (Clothing item : items) {
        int index = 0;
        for (var item : items) {
            if (c1.size.equals(item.size)) {
                System.out.println("Item " + (++index) + " is "
                + item.description + ","
                + item.price + ","
                + item.size);
                
                total += item.price;
            }
            
            if (total > 15) {
                break;
            }
        }
        total += total * tax;

        System.out.println("Total cost = " + total);        
        
    }
}
