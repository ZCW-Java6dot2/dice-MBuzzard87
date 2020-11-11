public class Dice {

    private int numOfD;


    public Dice(int numOfD) {
        this.numOfD = numOfD;
    }


    public Integer tossAndSum() {
        Integer sumDie = 0;

        for (int i = 0; i < numOfD; i++) {
            sumDie += (int) Math.ceil(Math.random() * 6);
        }
        return sumDie;
    }

}

