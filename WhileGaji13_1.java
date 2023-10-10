import java.util.Scanner;

public class WhileGaji13_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int jumlahJamLembur, jumlahKaryawan;
        double totalGajiLembur = 0.0;
        double gajiLembur = 0.0;
        String jabatan;

        System.out.println("Jumlah karyawan yaitu ");
        jumlahKaryawan = sc.nextInt();
        
        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilih kategori jabatan : Direktur, Manajer, karyawan");
            System.out.println("Masukkan jabatan karyawan ke-  "+ (i+1) + ": ");
            jabatan = sc.next();
            System.out.println("Masukkan Jam lembur : ");
            jumlahJamLembur = sc.nextInt();
            i++;
            if ( jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }else {
                System.out.println("Jabatan invalid");
                i--;
                gajiLembur = jumlahJamLembur * 0;
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur : " + totalGajiLembur);
    }
}