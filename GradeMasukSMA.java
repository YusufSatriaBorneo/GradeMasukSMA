import java.util.Scanner;

// mengimpor Scanner ke program

public class GradeMasukSMA{
    public static void main(String[] args){
        // deklarasi variabel
        int mtk,bindo,bing,ipa;
        int sekolah = 73;
        int sastra = 75;
        int tekom = 80;
        int totalsemuapelajaran = 4; 
        int totalgrade;
        int kelassanstra = 2;
        int hasiltotalratasastra;
        int hasilsastra;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("Masukan Nilai Matematika kamu");
        mtk = keyboard.nextInt();

        System.out.println("Masukan Nilai Bahsa Indonesia kamu");
        bindo = keyboard.nextInt();

        System.out.println("Masukan Nilai Bahasa Inggris kamu");
        bing = keyboard.nextInt();

        System.out.println("Masukan Nilai IPA kamu");
        ipa = keyboard.nextInt();

        // Operasi Mengatur Rata-rata
        int hasilratamasuksma = mtk + bindo + bing + ipa;
        totalgrade = hasilratamasuksma/totalsemuapelajaran;

        hasilsastra = bindo + bing;
        hasiltotalratasastra = hasilsastra/kelassanstra;

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("Jawaban Yang Di Olah Oleh Komputer :");
        System.out.println("Nilai Rata Kamu Adalah.. " + totalgrade);
        System.out.println("Apakah Kamu Lolos Masuk SMA Ini?  : " + (totalgrade >= sekolah));
        System.out.println("Apakah Kamu Lolos Masuk Kelas Sastra?  : " + (hasiltotalratasastra >= sastra));
        System.out.println("Apakah Kamu Lolos Kelas Teknik Komputer?  : " +(mtk >= tekom));
        
    }
}