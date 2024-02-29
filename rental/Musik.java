/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental;

/**
 *
 * @author dzaka
 */
public class Musik extends DVD {
    private String penyanyi;
    private String produser;
    private String topHits;

    public Musik(String judul, String publisher, char kategori, 
            int stok, String penyanyi, String produser, String topHits) {
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public String getTopHits() {
        return topHits;
    }

    public void setTopHits(String topHits) {
        this.topHits = topHits;
    }
}
