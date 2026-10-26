// NIM 1001260027 -> domain Bengkel, nilai dasar 12
public class Servis0027 {

    // Attribute - semuanya private
    private String namaServis;
    private double biayaServis; // diisi 12000 sesuai NIM
    private double diskon;

    // Constructor berparameter
    public Servis0027(String namaServis, double biayaServis, double diskon) {
        this.namaServis = namaServis;
        this.biayaServis = biayaServis;
        this.diskon = diskon;
    }

    // Getter dan Setter

    public String getNamaServis() {
        return namaServis;
    }

    public void setNamaServis(String namaServis) {
        this.namaServis = namaServis;
    }

    public double getBiayaServis() {
        return biayaServis;
    }

    public void setBiayaServis(double biayaServis) {
        this.biayaServis = biayaServis;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    // Method perhitungan: total biaya setelah diskon
    public double hitungTotalBiaya() {
        return biayaServis - (biayaServis * diskon / 100);
    }
}
