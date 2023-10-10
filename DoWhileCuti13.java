import java.util.Scanner;

public class DoWhileCuti13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahHari, jatahCuti;
        String konfirmasi;

        System.out.println("Jatah cuti : ");
        jatahCuti = sc.nextInt();

        do{
            System.out.println("Apakah anda ingin mengambil cuti ? (y/t)");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Masukkan jumlah hari cuti anda : ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti ){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jumlah cuti : " + jatahCuti);
                }else {
                    System.out.println("Jatah cuti anda tidak tersedia");
                    break;
                }
            } 
        }while (jatahCuti > 0);
    }
}
