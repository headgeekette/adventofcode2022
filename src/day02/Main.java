package day02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    private static PlayCode getPlayCode(String code) {
        for (PlayCode playCode : PlayCode.values()) {
            if (code.equals(playCode.opponent) || code.equals(playCode.mine)) {
                return playCode;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Reader reader = new Reader();
        List<Strategy> plays = new ArrayList<Strategy>();

        try {
            plays = reader.getStrategyInput("src/day02/input.txt");
            runPart1(plays);

            /*
             * the second column says how the round needs to end:
             * X means you need to lose,
             * Y means you need to end the round in a draw,
             * Z means you need to win.
             */

            Integer totalScore = 0;
            for (Strategy strategy : plays) {
                // figure out the end result of round: win, lose, or draw
                Score endResult = null;
                for (Score scoreValue : Score.values()) {
                    if (scoreValue.code.equals(strategy.getMyPlay())) {
                        endResult = scoreValue;
                        break;
                    }
                }
                totalScore += endResult.score;
                // from end result, get play
                PlayCode opponentPlay = getPlayCode(strategy.getOpponentPlay());
                PlayCode myPlay = null;
                switch (endResult) {
                    case WIN:
                        // System.out.println("It's a win!!");
                        myPlay = getPlayCode(opponentPlay.loseValue);
                        break;
                    case LOSE:
                        // System.out.println("It's a lose!!");
                        myPlay = getPlayCode(opponentPlay.winValue);
                        break;
                    case DRAW:
                        // System.out.println("It's a draw!!");
                        myPlay = opponentPlay;
                        break;
                    default:
                        break;
                }
                totalScore += myPlay.score;
            }
            System.out.println("Part 2: " + totalScore);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void runPart1(List<Strategy> plays) {
        Integer totalScore = 0;
        for (Strategy strategy : plays) {
            PlayCode myPLay = getPlayCode(strategy.getMyPlay());
            totalScore += myPLay.score;
            PlayCode opponentPlay = getPlayCode(strategy.getOpponentPlay());
            // Rock defeats Scissors, Scissors defeats Paper, and Paper defeats Rock
            if (opponentPlay == myPLay) {
                // System.out.println("It's a draw!!");
                totalScore += Score.DRAW.score;
            } else if (opponentPlay.winValue.equals(myPLay.mine)) {
                // System.out.println("I lost!");
                totalScore += Score.LOSE.score;
            } else {
                // System.out.println("I won!");
                totalScore += Score.WIN.score;
            }

        }
        System.out.println("Part 1: " + totalScore);

        // answer is 13526
    }
}
