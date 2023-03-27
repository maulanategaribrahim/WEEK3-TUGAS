public class Nilai {
    private String nama;
    private String nim;
    private double nilaiTugas;
    private double nilaiUAS;
    private double nilaiUTS;
    private String predikat;
    private String nilaiHuruf;

    public Nilai(String nama, String nim, double nilaiTugas, double nilaiUAS, double nilaiUTS) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUAS = nilaiUAS;
        this.nilaiUTS = nilaiUTS;
        hitungNilai();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
        hitungNilai();
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
        hitungNilai();
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
        hitungNilai();
    }

    public String getPredikat() {
        return predikat;
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }

    private void hitungNilai() {
        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiUTS * 0.35) + (nilaiUAS * 0.45);

        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
            predikat = "Sangat Baik";
        } else if (nilaiAkhir >= 70 && nilaiAkhir <85) {
            nilaiHuruf = "B";
            predikat = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir <70) {
            nilaiHuruf = "C";
            predikat = "Cukup";
        } else if (nilaiAkhir >= 40 && nilaiAkhir <60) {
            nilaiHuruf = "D";
            predikat = "Kurang";
        } else {
            nilaiHuruf = "E";
            predikat = "Sangat Kurang";
        }
    }
}
