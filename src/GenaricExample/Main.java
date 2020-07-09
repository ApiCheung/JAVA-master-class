package GenaricExample;

import java.util.ArrayList;

/**
 * @author Esmee Zhang
 * @date 7/9/20 5:27 下午
 * @projectName JAVA-master-class
 */
public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer bchk = new SoccerPlayer("bchk");

        Team<FootballPlayer> adlaideCrows = new Team<>("Adle crwo");
        adlaideCrows.addPlayer(joe);
        //
        //adlaideCrows.addPlayer(bchk);

        System.out.println(adlaideCrows.numPlayers());
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicageo");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won;twkr");
        brokenTeam.addPlayer(bchk);

        Team<FootballPlayer> hawThow = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremental");

        hawThow.matchResult(fremantle, 1, 0);
        hawThow.matchResult(adlaideCrows, 3, 8);
        adlaideCrows.matchResult(fremantle, 2, 1);
       // adlaideCrows.matchResult(baseballTeam,1 ,1);

    }
}
