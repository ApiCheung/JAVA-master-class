/**
 * @author Esmee Zhang
 * @date 6/6/20 2:08 下午
 * @projectName learning
 */
public class PDOTW {
    public static void main(String[] args) {
        printDayOfTheWeek(2);

    }
    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("other day");
        }

    }

}
