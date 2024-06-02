class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String telepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, telepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Staff\n" + super.toString() + "\nGelar: " + gelar;
    }
}