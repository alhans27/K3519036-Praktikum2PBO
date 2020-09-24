/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;

/**
 *
 * @author GGibran
 */
public class Keramik2 {
    double luasLantai = 100;
    int panjang;
    int lebar;
    int harga;
    int pcs;
    
    Keramik2(int p, int l, int cost, int jml){
        this.panjang = p;
        this.lebar = l;
        this.harga = cost;
        this.pcs = jml;
    }
    
    double luasLantai(){
        double luas;
        luas = this.luasLantai * 10000;
        return luas;
    }
    int luasKeramik(){
        int luasKeramik;
        luasKeramik = this.panjang * this.lebar;
        return luasKeramik;
    }
    
    double butuhKeramik(){
        double butuhKeramik;
        butuhKeramik = luasLantai() / luasKeramik();
        return butuhKeramik;
    }
     
    void biaya(){
        double biaya;
        biaya = butuhKeramik() * this.harga / this.pcs;
        System.out.println("Biaya yang dibutuhkan apabila memilih keramik tersebut adalah: +- " + biaya + " Rupiah");
    }
}
