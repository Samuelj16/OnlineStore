package com.plurasight;

public class onlinestore {
    public static void main(String[] args) {
        // Show the user a list of items for sale

        Product[] productsForSale = ProductForSale.productsForSale;
        for (Product i : productssForSale){
            if ( ! i.isInStock()) continue;
            // System.out.println(i);
            System.out.println(i.getDescription());


        }
        // Invite the user to buy something

        String selectedProductId = null;
        Item selectedItem = null;

        for (Item currentItemInListInTheLoop : itemsForSale ){
            if (selectedProductId.equals(currentItemInListInTheLoop.getProductID())){
                selectedItem = currentItemInListInTheLoop;
                break;
            }
    }
}