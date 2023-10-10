import java.util.Scanner;

public class DoWhileCuti13_2 {
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
                } else if ( jatahCuti == 0){
                    break;
                } else {
                    System.out.println("Jatah cuti tidak tersedia, sisa jatah cuti anda tinggal " + jatahCuti);   
                }     
            } else {
                break;
            }
        } while (jatahCuti > 0);
}
    }

