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

        for (int j = 0; j < numberOfDies * 6 - (numberOfDies - 1); j++) {
            String percent = String.format("%.2f",(double)binArrPrint[j] / numberOfTosses);
            System.out.println(j + 2 + " " + binArrPrint[j] +
                    " " + percent);
        }
    }







}

