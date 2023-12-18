package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            System.out.println("skipped sum is " + numberToSkip);
            int result = 0;
            for (int i = 1; i <= lastInRow; i++) {
                result += i;
            }
            result -= numberToSkip;
            System.out.println("counted sum is " + result);
        }
    }
}    
