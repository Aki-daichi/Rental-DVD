/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author dzaka
 */
public class Film extends DVD{
    private String pemeran;
    private String sutradara;

    public Film(String judul, String publisher, char kategori, int stok, 
            String pemeran, String sutradara) {
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
    }

    public String getPemeran() {
        return pemeran;
    }

    public void setPameran(String pemeran) {
        this.pemeran = pemeran;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }
}
