package day02;

public enum PlayCode {
    // Rock defeats Scissors, Scissors defeats Paper, and Paper defeats Rock
    // A for Rock, B for Paper, and C for Scissors
    // X for Rock, Y for Paper, and Z for Scissors
    // Score: 1 for Rock, 2 for Paper, and 3 for Scissors

    // *** Part 1 ***
    // ROCK("A", "X", 1, "Z"),
    // PAPER("B", "Y", 2, "X"),
    // SCISSORS("C", "Z", 3, "Y");

    // final String opponent;
    // final String mine;
    // final Integer score;
    // final String winValue; // formerly defeats

    // private PlayCode(String opponent, String mine, Integer score, String
    // winValue) {
    // this.opponent = opponent;
    // this.mine = mine;
    // this.score = score;
    // this.winValue = winValue;
    // }

    // *** Part 2 ***

    ROCK("A", "X", 1, "Z", "Y"),
    PAPER("B", "Y", 2, "X", "Z"),
    SCISSORS("C", "Z", 3, "Y", "X");

    final String opponent;
    final String mine;
    final Integer score;
    final String winValue; // formerly defeats
    final String loseValue;

    private PlayCode(String opponent, String mine, Integer score, String winValue, String loseValue) {
        this.opponent = opponent;
        this.mine = mine;
        this.score = score;
        this.winValue = winValue;
        this.loseValue = loseValue;
    }

}
