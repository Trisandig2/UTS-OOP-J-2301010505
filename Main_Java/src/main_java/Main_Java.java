/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main_java;

/**
 *
 * @author LAB F
 */
public class Main_Java {
    public class Buku {
    private int id;
    private String judul;
    private String penulis;

    // Constructor default
    public Buku() {
        this.id = 0;
        this.judul = "";
        this.penulis = "";
    }

    // Constructor overloading
    public Buku(int id, String judul, String penulis) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "ID: " + id + ", Judul: " + judul + ", Penulis: " + penulis;
    }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
