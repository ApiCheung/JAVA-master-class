/**
 * @author Esmee Zhang
 * @date 6/4/20 4:57 下午
 * @projectName learning
 */
public class KeyWord {
    public static void main(String[] args) {
        int i  = calculate(true, 10, 20, 30);
        System.out.println(i);

        int j = calculate(1500);
        System.out.println(j);






    }
    public static int calculate(boolean i, int score, int level, int bonus){
        if (i == true){
            System.out.println(((int)(score + level) * bonus));
        }
        return -1;
    }
    public static int calculate(int score){
        if (score > 1000){
            return 1;
        }else if(score > 500 && score < 1000){
            return 2;
        }else if(score < 500 && score > 200){
            return 3;
        }else{
            return 4;
        }
    }
}
