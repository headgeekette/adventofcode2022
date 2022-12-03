package day02;

public enum Score {
    // 0 if you lost, 3 if the round was a draw, and 6 if you won
    // X means you need to lose, Y means you need to end the round in a draw, and Z
    // means you need to win.

    /*
     * Part 1
     */
    // LOSE(0),
    // DRAW(3),
    // WIN(6);

    // final Integer score;

    // private Score(Integer score) {
    // this.score = score;
    // }

    // Part 2
    LOSE("X", 0),
    DRAW("Y", 3),
    WIN("Z", 6);

    final String code;
    final Integer score;

    private Score(String code, Integer score) {
        this.code = code;
        this.score = score;
    }

    public Score getScore(String code) {
        switch (code) {
            case "X":
                return LOSE;
            case "Y":
                return DRAW;
            case "Z":
                return WIN;
            default:
                return null;
        }
    }

}
