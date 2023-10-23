
package items;

import java.util.Scanner;

public class ItemManager {
    public static void main(String[] args) {
        String filename = "item.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("Add new item");
        menu.add("Remove an item");
        menu.add("Update an item's price");
        menu.add("Print the list");
        menu.add("Save to files");
        menu.add("Quit");
        int userChoice;
        NewItems list = NewItems();
        list.loadStoredCodes(filename);
        do 
        {
            System.out.println("\nNEW ITEM MANAGER");
            userchoice = menu.getUserChoice();
            switch (userChoice) {
                case 1: list.addNewItem(); break;
                case 2: list.removeItem(); break;
                case 3: list.updatePrice(); break;
                case 4: list.print(); break;
                case 5: list.appendToFile(filename); break;
                default: if(list.size()>0) {
                    System.out.println("Save change Y/N");
                    String response = sc.nextLine().toUpperCase();
                    if(response.startsWith("Y"))
                        list.appendToFile(filename);
                }
            }
        }
        while (userChoice > 0 && userChoice <6);
    }
}
