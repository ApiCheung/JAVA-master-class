package InheritanceCH;

/**
 * @author Esmee Zhang
 * @date 6/15/20 1:17 下午
 * @projectName JAVA-master-class
 */
public class OutLander extends Car {
    private int roadServiceMonths;

    public OutLander(int roadServiceMonths) {
        super("Outlander", "4wd",5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
        }else if(newVelocity > 0 && newVelocity <=10){
            changeGear(1);

        }else if(newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        }else {
            changeGear(3);
        }
        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
