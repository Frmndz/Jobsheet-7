import java.util.Scanner;

public class WhileKelipatan13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int kelipatan;
        int total = 0;
        int counter = 0;
        double rataRata = 0;
        
        System.out.println("Masukkan bilangan angka dari 1 sampai 9 :");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++;
        }
            rataRata = (double) total/counter;
        
                System.out.printf("Banyaknya bilangan%d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
                System.out.printf("Rata rata dari bilangan %d tersebut adalah %.2f\n", kelipatan, rataRata);
    }
}