import java.util.ArrayList;

/**
 * @author Esmee Zhang
 * @date 6/24/20 12:33 下午
 * @projectName JAVA-master-class
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContact;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContact = new ArrayList<>();
    }

    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("contact in file");
        }else{
            return false;
        }

        myContact.add(contact);
        return true;

    }

    private int findContact(Contacts contact){
        return this.myContact.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i < this.myContact.size(); i++){
            Contacts contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }

        }
        return -1;
    }

    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println("not found");
        }else{
            this.myContact.remove(foundPosition);
            System.out.println("success");
        }
        return true;
    }

    public boolean updateContact(Contacts  contact, Contacts newContact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println("not found");
            return false;
        }
            this.myContact.set(foundPosition, newContact);
            System.out.println("replaced");
            return true;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContact.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("contacts");
        for(int i = 0; i< this.myContact.size(); i++){
            System.out.println((i+1) + ". " + this.myContact.get(i).getName() + " " + this.myContact.get(i).getPhone());

        }
    }



}
