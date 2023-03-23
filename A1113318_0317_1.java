import java.util.Scanner;

public class  A1113318_0317_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入n值：");
        int n = scanner.nextInt();

        System.out.print("請輸入m值：");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (i+1) * (j+1);
            }
        }

        System.out.println("您所輸入的n和m值所產生的n*m陣列如下：");
        for (int [] row: array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
