/**
 * @author Esmee Zhang
 * @date 6/24/20 12:33 下午
 * @projectName JAVA-master-class
 */
public class Contacts {
    private String name;
    private String phone;

    public Contacts(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public static Contacts createContact(String name, String phone){
        return new Contacts(name, phone);
    }
}
