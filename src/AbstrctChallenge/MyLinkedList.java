package AbstrctChallenge;

import java.util.List;

/**
 * @author Esmee Zhang
 * @date 7/3/20 6:25 下午
 * @projectName JAVA-master-class
 */
public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public List getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    currentItem.setNext(newItem);
                    return true;
                }
            }else if(comparison > 0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else{
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
            }else{
                System.out.println("new item" + newItem.getValue() + "is in");
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void tranverse(ListItem root) {

    }
}
