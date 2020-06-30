import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Esmee Zhang
 * @date 6/23/20 7:40 下午
 * @projectName JAVA-master-class
 */
public class ArrayListMain {
    private static Scanner scanner = new Scanner((System.in));
    public static GroveryList groveryList = new GroveryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0 :
                    printInstructions();
                    break;
                case 1:
                    groveryList.printGrocery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }

    }

    public static void printInstructions(){
        System.out.println("do something 0123456");
    }

    public static void addItem(){
        System.out.println(
                "please enter the grocery Item:"
        );
        groveryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("which to update");
        String item = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter replace item");
        String newItem = scanner.nextLine();
        groveryList.modifyGroceryItem(item, newItem);

    }

    public static void removeItem(){
        System.out.println("which to remove");
        String item = scanner.nextLine();
        scanner.nextLine();
        groveryList.remoceGroceryItem(item);
    }

    public static void searchItem(){
        System.out.println("item to search for: ");
        String searchItem = scanner.nextLine();
        if(groveryList.onFile(searchItem)){
            System.out.println(searchItem);
        }else{
            System.out.println("not in the list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groveryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groveryList.getGroceryList());

        String[] myArray = new String[groveryList.getGroceryList().size()];
        myArray = groveryList.getGroceryList().toArray(myArray);
    }
}
