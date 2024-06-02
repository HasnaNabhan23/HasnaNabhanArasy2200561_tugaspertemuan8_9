class Faculty extends Employee {
    private double jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String telepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, double jamKerja, String pangkat) {
        super(nama, alamat, telepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Faculty\n" + super.toString() + "\nJam Kerja: " + jamKerja + "\nPangkat: " + pangkat;
    }
}