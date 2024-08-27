/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sems_3;

/**
 *
 * @author DAGH
 */
public class Aves extends Hewan {
    private String paruh;
    
    public String getParuh() {
        return paruh;
    }
     public void setParuh(String paruh) {
        this.paruh = paruh;
    }
     
    public void CiriUtama() {
        System.out.println("Bulu adalah ciri khas paling utama dari burung. Bulu berfungsi untuk terbang dan menjaga suhu tubuh");
    }
    public void Sayap() {
        System.out.println("Kebanyakan aves memiliki sayap yang memungkinkan mereka terbang, meskipun beberapa spesies tidak");
    }
    public void Kicauan() {
        System.out.println("Banyak burung memiliki kemampuan untuk berkicau atau menghasilkan suara, yang sering digunakan untuk berkomunikasi, menarik pasangan, atau menandai wilayah");
    }
    public void Reproduksi() {
        System.out.println("Burung bertelur dengan cangkang keras yang terbuat dari kalsium karbonat, yang memberikan perlindungan bagi embrio yang sedang berkembang");
    }
}
