class Student extends Person {
    public static final int FRESHMAN = 1, SOPHOMORE = 2, JUNIOR = 3, SENIOR = 4;
    private int statusKelas;

    public Student(String nama, String alamat, String telepon, String email, int statusKelas) {
        super(nama, alamat, telepon, email);
        this.statusKelas = statusKelas;
    }

    @Override
    public String toString() {
        String status;
        switch (statusKelas) {
            case FRESHMAN:
                status = "Freshman";
                break;
            case SOPHOMORE:
                status = "Sophomore";
                break;
            case JUNIOR:
                status = "Junior";
                break;
            case SENIOR:
                status = "Senior";
                break;
            default:
                status = "Unknown";
        }
        return "Student\n" + super.toString() + "\nStatus Kelas: " + status;
    }
}