package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int numberToPrint = cathetusLength;
            for (int k = cathetusLength; k > i; k--) {
                System.out.print(" ");
                numberToPrint--;
            }
            for (int j = 1; j <= i; j++){

                System.out.print(numberToPrint--);
            }
            for (int p = 1; p < i; p++){
                System.out.print(numberToPrint++ + 2);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
