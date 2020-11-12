import java.util.Arrays;

public class Simulation {

    public int numberOfDies;
    public int numberOfTosses;
    private int dieVal;
    private int[] binArrPrint;



    public Simulation(int numDie, int numOfTosses) {
        this.numberOfDies = numDie;
        this.numberOfTosses = numOfTosses;
    }


    public void runSimulation() {
        Dice dice = new Dice(numberOfDies);
        Bins binsObj = new Bins(numberOfDies,numberOfTosses);
        for(int i = 0; i < numberOfTosses; i++) {
            dieVal = dice.tossAndSum();
            binsObj.incBin(dieVal - numberOfDies);
        }
        this.binArrPrint = binsObj.getIncbinArr();

    }

    public void printResults() {
        System.out.printf("**********\n"+"Simulation of '%d' " +
                "dice tossed for '%d' times\n"+"**********\n\n", numberOfDies, numberOfTosses);
        for (int j = 0; j < numberOfDies * 6 - (numberOfDies - 1); j++) {

            System.out.printf("%2d : %8d: %4.2f %s\n",j + 2, binArrPrint[j], getPercentage(j), getStars(j));
        }
    }

    public Double getPercentage(int j) {
        Double percent = 0.0;
        percent = (double)binArrPrint[j] / numberOfTosses;

        return percent;
    }

    public String getStars(int j) {
        String stars = "";
        Integer percentage = (int)Math.floor(getPercentage(j) * 100);
        for (int k = 0; k < percentage; k++)
            stars += "*";
            return stars;
    }


}

