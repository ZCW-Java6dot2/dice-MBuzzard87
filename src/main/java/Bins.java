import java.util.ArrayList;

public class Bins {
    private int[] incbinArr;


    public Bins(int numberOfDies, int numberOfTosses) {
        this.incbinArr = new int[numberOfDies * 6 - (numberOfDies - 1)];
    }

    public void incBin(int i) {
        incbinArr[i]++;
    }

    public int[] getIncbinArr() {
        return incbinArr;
    }






}

