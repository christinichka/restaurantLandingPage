package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Arrays;

public class Menu {
    private Date dateLastUpdated;

    private ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("appetizer", "main course", "dessert")
    );

    private ArrayList<MenuItem> items;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.dateLastUpdated = new Date();
    }

    // Setters
//    public void setMenu(ArrayList<MenuItem> items) {
//        this.items = items;
//    }

    // Getters
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }


    // Method to add menu item
    public void addMenuItem(MenuItem item) {
        this.items.add(item);
    }

    // Method to delete menu item
//    public void removeMenuItem(MenuItem item){
//        this.items.remove(item);
//    }

    public void printMenu() {
        System.out.println("Restaurant Menu");
        for (MenuItem menuItem : items) {
            System.out.println(menuItem.toString() + "\n");
        }
    }
}

