class Person {
    private String nama, alamat, telepon, email;

    public Person(String nama, String alamat, String telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
               "Alamat: " + alamat + "\n" +
               "Telepon: " + telepon + "\n" +
               "Email: " + email;
    }
}