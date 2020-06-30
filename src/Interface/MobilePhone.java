package Interface;

/**
 * @author Esmee Zhang
 * @date 6/30/20 4:27 下午
 * @projectName JAVA-master-class
 */
public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("moble phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println(" now ringing" + phoneNumber + "on deskphone");
        }else{
            System.out.println("phone is off");
        }


    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answeing the mobile phone");
            isRinging = false;
        }


    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("melody ring");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
