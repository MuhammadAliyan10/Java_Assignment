public class Star {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 18; j++) {
                if ((i == 4 && j == 1) || (i == 4 && j == 3) || (i == 4 && j == 5) || (i == 4 && j == 7)
                        || (i == 4 && j == 9) || (i == 4 && j == 11) || (i == 4 && j == 13) || (i == 4 && j == 16)
                        || (i == 4 && j == 18)) {
                    System.out.print("*");
                } else if ((i == 1 && j == 9) || (i == 2 && j == 8) || (i == 2 && j == 10) || (i == 3 && j == 7)
                        || (i == 3 && j == 11) || (i == 5 && j == 5) || (i == 5 && j == 13) || (i == 6 && j == 4)
                        || (i == 6 && j == 14) || (i == 7 && j == 3) || (i == 7 && j == 15) || (i == 8 && j == 2)
                        || (i == 8 && j == 16) || (i == 9 && j == 1) || (i == 10 && j == 1) || (i == 9 && j == 17)
                        || (i == 10 && j == 18) || (i == 4 && j == 3) || (i == 5 && j == 1) || (i == 5 && j == 1)
                        || (i == 6 && j == 4) || (i == 7 && j == 7) || (i == 8 && j == 10) || (i == 9 && j == 13)
                        || (i == 10 && j == 16) || (i == 5 && j == 17) || (i == 6 && j == 14) || (i == 7 && j == 11)
                        || (i == 8 && j == 8) || (i == 9 && j == 5) || (i == 10 && j == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
