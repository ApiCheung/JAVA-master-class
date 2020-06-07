/**
 * @author Esmee Zhang
 * @date 6/5/20 7:02 下午
 * @projectName learning
 */
public class methodover {
    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("new is"+ newScore);


    }
    public static int calculateScore(String playerName, int score){
        System.out.println(playerName+" "+score);
        return score *1000;
    }
    //overloading the method只改变返回的内容也无法 overloading
    public static int calculateScore(int score){
        System.out.println(" "+score);
        return score *1000;
    }



        // write your code here
        public static void printYearsAndDays(long minutes){
            if(minutes < 0){
                System.out.println("Invalid Value");
            }

            int year = (int)(minutes/60/24/365);
            int day = (int)((minutes - (year * 60 *365 *24))/24);

            System.out.println(minutes + " min = " + year + " y " + "and " + day  +"d");

        }

}
