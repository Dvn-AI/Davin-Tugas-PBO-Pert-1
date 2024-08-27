/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sems_3;

/**
 *
 * @author DAGH
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Amphibi
        System.out.println("=> Amphibi");
        Amphibi Axolotl = new Amphibi();
        Axolotl.setBernafas("Insang & Paru-paru");
        Axolotl.setTumbuh("Bisa Tumbuh");
        Axolotl.setBerjalan("Kaki untuk berjalan & ekor untuk berenang");
        Axolotl.setJumlahKaki(4);
        System.out.println("Saya bernafas dengan" + Axolotl.getBernafas() + ", Tumbuh = " + Axolotl.getTumbuh() + ", Berjalan dengan = " + Axolotl.getJumlahKaki() + Axolotl.getBerjalan());
        Axolotl.CiriUtama();
        Axolotl.Kulit();
        Axolotl.Pernapasan();
        Axolotl.Reproduksi();
        
        
        //Reptil
        System.out.println("");
        System.out.println("=> Reptil");
        Reptil Ular = new Reptil();
        Ular.setBernafas("Paru-Paru");
        Ular.setBerjalan("Melata");
        Ular.setTumbuh("Bisa Tumbuh");
        Ular.setJumlahKaki(0);
        Ular.setJenisKulit("Halus");
        System.out.println("Saya bernafas dengan" + Ular.getBernafas() + ", Tumbuh = " + Ular.getTumbuh() + ", Berjalan dengan = " + Ular.getBerjalan() + ", dan memiliki kulit yang " +    Ular.getJenisKulit());
        Ular.CiriUtama();
        Ular.Pernafasan();
        Ular.Reproduksi();
        Ular.SuhuTubuh();
        
        //Aves
        System.out.println("");
        System.out.println("=> Aves");
        Aves Elang = new Aves();
        Elang.setBernafas("Paru-paru & Kantung Udara");
        Elang.setBerjalan("Terbang menggunakan sayap");
        Elang.setTumbuh("Bisa Tumbuh");
        Elang.setJumlahKaki(2);
        Elang.setParuh("Melengkung tajam dan kuat");
        System.out.println("Saya bernafas dengan" + Elang.getBernafas() + ", Tumbuh = " + Elang.getTumbuh() + ", Berjalan dengan = " + Elang.getBerjalan() + Elang.getJumlahKaki() + ", dan memiliki paruh yang " +    Elang.getParuh());
        Elang.CiriUtama();
        Elang.Kicauan();
        Elang.Reproduksi();
        Elang.Sayap();
        
        //Mamalia
        System.out.println("");
        System.out.println("=> Mamalia");
        Mamalia Kucing = new Mamalia();
        Kucing.setBernafas("Paru-Paru");
        Kucing.setBerjalan("Menggunakan Kaki");
        Kucing.setJenisKulit("Berbulu");
        Kucing.setJumlahKaki(4);
        Kucing.setTumbuh("Bisa Tumbuh");
        System.out.println("Saya bernafas dengan" + Kucing.getBernafas() + ", Tumbuh = " + Kucing.getTumbuh() + ", Berjalan dengan = " + Kucing.getBerjalan() + Kucing.getJumlahKaki() +", memiliki kulit yang " +    Kucing.getJenisKulit());
        Kucing.CiriUtama();
        Kucing.KelenjarKeringat();
        Kucing.Kulit();
        Kucing.Reproduksi();
        
        //Pisces
        System.out.println("");
        System.out.println("=> Pisces");
        Pisces Salmon = new Pisces();
        Salmon.setBernafas("Insang");
        Salmon.setBerjalan("Menggunakan Sirip");
        Salmon.setTumbuh("Bisa Tumbuh");
        Salmon.setJenisKulit("Bersisik");
        System.out.println("Saya bernafas dengan" + Salmon.getBernafas() + ", Tumbuh = " + Salmon.getTumbuh() + ", Berjalan dengan = " + Salmon.getBerjalan() +", memiliki kulit yang " +    Salmon.getJenisKulit());
        Salmon.BentukTubuh();
        Salmon.CiriUtama();
        Salmon.Kulit();
        Salmon.Reproduksi();
        
        
        //Monokotil
        System.out.println("");
        System.out.println("=> Monokotil");
        Monokotil Jagung = new Monokotil();
        Jagung.setArahDaun("null");
        Jagung.setTinggi("1,5 hingga 3 meter");
        Jagung.setWarnaDaun("Hijau Tua");
        Jagung.setWarnaBunga("Hijau atau Kuning(tergantung jenis kelamin)");
        System.out.println(" Arah daun ketika pagi hari = " + Jagung.getArahDaun() + ", memiliki warna daun = " + Jagung.getWarnaDaun() + ", memiliki warna bunga = " + Jagung.getWarnaBunga() + ", biasanya tingginya mencapai = " + Jagung.getTinggi());
        Jagung.Akar();
        Jagung.Batang();
        Jagung.Bunga();
        Jagung.Kambium();
        Jagung.KepingBiji();
        Jagung.Reproduksi();
        Jagung.Stomata();
        Jagung.TulangDaun();
        
        
        //Dikotil
        System.out.println("");
        System.out.println("=> Dikotil");
        Dikotil Mawar = new Dikotil();
        Mawar.setArahDaun("null");
        Mawar.setWarnaBunga("Merah, Putih, Kuning, Hijau, Coklat, Pink, Oranye, Ungu, Biru");
        Mawar.setWarnaDaun("Hijau");
        Mawar.setTinggi("1,2 hingga 1,8 meter");
        System.out.println(" Arah daun ketika pagi hari = " + Mawar.getArahDaun() + ", memiliki warna daun = " + Mawar.getWarnaDaun() + ", memiliki warna bunga = " + Mawar.getWarnaBunga() + ", biasanya tingginya mencapai = " + Mawar.getTinggi());
        Mawar.akar();
        Mawar.batang();
        Mawar.bunga();
        Mawar.reproduksi();
        Mawar.kambium();
        Mawar.kepingBiji();
        Mawar.stomata();
        Mawar.tulangDaun();
    }
}
       /* // TODO code application logic here
        Hewan meong = new Hewan();
        System.out.println("Nama saya meong...");
        meong.Bernafas();
        meong.Tumbuh();
        Tumbuhan pencit = new Tumbuhan();
        System.out.println("Nama saya pencit...");
        pencit.setWarnaDaun( "Hijau");
        pencit.setArahDaun( "Timur");
        pencit.Bernafas();
        pencit.Tumbuh();
        System.out.println("Arah Daun Pagi Hari"+ pencit.getArahDaun());
        System.out.println("Warna Daun" + pencit.getWarnaDaun());
        
        System.out.println("");
        Ikan Koi = new Ikan();
        Koi.Bernafas();
        Koi.Tumbuh();
        Koi.setJumlahKaki(2);
        System.out.println("Jumlah kaki koi "+ String.valueOf(Koi.getJumlahKaki()));
    }

}
*/