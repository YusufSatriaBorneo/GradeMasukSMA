import java.util.Scanner;

// mengimpor Scanner ke program

public class GradeMasukSMA{
    public static void main(String[] args){
        // deklarasi variabel
        int mtk,bindo,bing,ipa;
        int sekolah,sastra,tekom;
        double averagesastra, averagesekolah;
        boolean issastra,istekom,issekolah;

        // inisialisasi nilai variabel
        sekolah = 73;
        sastra = 75;
        tekom = 80;

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

        // Operasi Mengatur Rata-rata integer
        averagesekolah = ((mtk + bindo + bing + ipa) / 4);
        
        averagesastra = ((bindo + bing) / 2);

        // alogirtma boolean

        issekolah = averagesekolah >= sekolah;

        issastra = averagesastra >= sastra;
        
        istekom = mtk > tekom;

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("Jawaban Yang Di Olah Oleh Komputer :");
        System.out.println("Nilai Rata Kamu Adalah.. " +  averagesekolah);
        System.out.println("Apakah Kamu Lolos Masuk SMA Ini?  : " +  issekolah);
        System.out.println("Apakah Kamu Lolos Masuk Kelas Sastra?  : " + issastra);
        System.out.println("Apakah Kamu Lolos Kelas Teknik Komputer?  : " + istekom);
        
    }
}