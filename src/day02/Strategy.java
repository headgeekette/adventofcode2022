package day02;

public class Strategy {
    private String opponentPlay; // A, B, C
    private String myPlay; // X, Y, Z

    public Strategy(String opponentPlay, String myPlay) {
        this.opponentPlay = opponentPlay;
        this.myPlay = myPlay;
    }

    public String getOpponentPlay() {
        return opponentPlay;
    }

    public void setOpponentPlay(String opponentPlay) {
        this.opponentPlay = opponentPlay;
    }

    public String getMyPlay() {
        return myPlay;
    }

    public void setMyPlay(String myPlay) {
        this.myPlay = myPlay;
    }

    @Override
    public String toString() {
        return "Strategy [opponentPlay=" + opponentPlay + ", myPlay=" + myPlay + "]";
    }

}
