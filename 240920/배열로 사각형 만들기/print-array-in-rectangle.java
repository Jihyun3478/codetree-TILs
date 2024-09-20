public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];

        for(int i = 0; i < 5; i++) {
            numbers[0][i] = 1;
            numbers[i][0] = 1;
        }

        for(int i = 1; i < 5; i++) {
            for(int j = 1; j < 5; j++) {
                numbers[i][j] = numbers[i-1][j] + numbers[i][j-1];
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}