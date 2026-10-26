// NIM 1001260027 -> domain Bengkel, nilai dasar 12
public class Bengkel0027 {

    // Attribute - semuanya private
    private String namaBengkel;
    private String alamat;
    private String nomorTelepon;

    // Constructor berparameter
    public Bengkel0027(String namaBengkel, String alamat, String nomorTelepon) {
        this.namaBengkel = namaBengkel;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter dan Setter

    public String getNamaBengkel() {
        return namaBengkel;
    }

    public void setNamaBengkel(String namaBengkel) {
        this.namaBengkel = namaBengkel;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Method tampil data servis
    public void tampilkanServis(Servis0027 s1, Servis0027 s2) {
        System.out.println("=== Servis 1 ===");
        System.out.println("Nama Servis  : " + s1.getNamaServis());
        System.out.println("Biaya Servis : Rp " + s1.getBiayaServis());
        System.out.println("Total Biaya  : Rp " + s1.hitungTotalBiaya());

        System.out.println("\n=== Servis 2 ===");
        System.out.println("Nama Servis  : " + s2.getNamaServis());
        System.out.println("Biaya Servis : Rp " + s2.getBiayaServis());
        System.out.println("Total Biaya  : Rp " + s2.hitungTotalBiaya());
    }

    // Main method
    public static void main(String[] args) {
        // Membuat 2 object Servis dengan data berbeda
        Servis0027 servis1 = new Servis0027("Ganti Oli", 12000, 10);
        Servis0027 servis2 = new Servis0027("Tune Up", 12000, 20);

        // Membuat object Bengkel
        Bengkel0027 bengkel = new Bengkel0027("Bengkel Maju", "Jl. Raya No. 1", "08123456789");

        // Menampilkan hasil
        bengkel.tampilkanServis(servis1, servis2);
    }
}
