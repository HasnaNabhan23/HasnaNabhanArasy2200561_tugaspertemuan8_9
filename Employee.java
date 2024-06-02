class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String telepon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, telepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return "Employee\n" + super.toString() + "\nKantor: " + kantor + "\nGaji: " + gaji + "\nTanggal Dipekerjakan: " + tanggalDipekerjakan;
    }
}