import java.util.ArrayList;

/**
 * @author Esmee Zhang
 * @date 6/23/20 6:21 下午
 * @projectName JAVA-master-class
 */
public class GroveryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);

    }

    public void printGrocery(){
        System.out.println("you have "+ groceryList.size() + "items in your list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " +groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0) modifyGroceryItem(position, newItem);

    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("grocery item" + (position+1) + "has been modified");
    }

    public void remoceGroceryItem(String item){
        int position = findItem(item);
        if(position >=0) removeGroceryItem(position);
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
        //boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        return position>=0 ? groceryList.get(position) : null;
    }

    public boolean onFile(String searchitem){
        int position = findItem(searchitem);
        return position >=0 ? true : false;
    }


}
