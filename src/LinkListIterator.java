import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author Esmee Zhang
 * @date 6/26/20 7:06 下午
 * @projectName JAVA-master-class
 */
public class LinkListIterator {
    public static void main(String[] args) {
        LinkedList<String> place = new LinkedList<String>();
    }
    //iterator的写法
    private static void printList(LinkedList<String> linkedlist){
        Iterator<String> i = linkedlist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("=======");

    }

    private  static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        //可以回到上一个，别的没有办法回到上一个
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal do not add
                System.out.println(newCity + "is already include");
                return false;
            }else if(comparison > 0){
                //new city should apoear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
            }else if(comparison < 0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visi(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("no exit");
            }else{
            System.out.println("nowvisiting" + listIterator.next());
            printMenu();

        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0 :
                    System.out.println("holiday over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()){
                        System.out.println(listIterator);
                    }else{
                        System.out.println("reach the end");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }else{
                        System.out.println("we are at the start of list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }


        }
    }

    private static void printMenu(){
        System.out.println("available actions");
        System.out.println("0,1,2,3");
    }
}
