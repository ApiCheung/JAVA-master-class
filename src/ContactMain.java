import java.util.Scanner;

/**
 * @author Esmee Zhang
 * @date 6/24/20 1:00 下午
 * @projectName JAVA-master-class
 */
public class ContactMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0099 882 2214");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("action");
            int action = scanner.nextInt();

            switch (action){
                case 0 :
                    System.out.println("shuting down");
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4 :
                    removeContact();
                    break;
                case 5:
                    //queryContact();
                    break;
                case 6 :
                    printActions();
                    break;

            }

        }

    }

    private static void printContacts(){
        mobilePhone.printContacts();
    }

    private static void startPhone(){
        System.out.println("Starting phone");
    }

    private static void printActions(){
        System.out.println("actions");

    }

    private static void addNewContact(){
        System.out.println("new conatct name");
        String name = scanner.nextLine();
        System.out.println("number");
        String number = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, number);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println("add");

        }else{
            System.out.println("cannot add it exits");
        }
    }

    private static void updateContact(){
        System.out.println("enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existContact = mobilePhone.queryContact(name);
        if(existContact == null){
            System.out.println("not found");
            return;
        }
        System.out.println("ebter bew contact name");
        String newName = scanner.nextLine();
        System.out.println("number");
        String newNumebr = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumebr);
        if(mobilePhone.updateContact(existContact, newContact)){
            System.out.println("success");
        }else{
            System.out.println("error");
        }
    }

    private static void removeContact(){
        System.out.println("enter existing contact name:");
        String name = scanner.nextLine();
        Contacts existContact = mobilePhone.queryContact(name);
        if(existContact == null){
            System.out.println("not found");
            return;
        }
        if(mobilePhone.removeContact(existContact)){
            System.out.println();
        }else{
            System.out.println("error");
        }
    }


}
