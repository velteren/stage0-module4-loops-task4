package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int skippedSum = 0;
            int countedSum = 0;
            for (int i = 1; i <= numberToSkip; i++) {
                skippedSum += i;
            }
            System.out.println("skipped sum is " + skippedSum);
            for (int i = 1; i <= lastInRow; i++) {
                countedSum += i;
            }
            System.out.println("counted sum is " + (countedSum - skippedSum));
        }
    }
}    
