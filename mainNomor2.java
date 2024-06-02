public class mainNomor2 {
    public static void main(String[] args) {
        Person person = new Person("Zeravina", "Daarut Tauhid", "0812345900", "zeravina@gmail.com");
        Student student = new Student("Hasna", "Hegarmanah", "089765432", "hasna@gmail.com", Student.JUNIOR);
        Employee employee = new Employee("Budi", "Ciamis", "0891457364", "budi@gmail.com", "IT", 70000, new MyDate(2024, 5, 1));
        Faculty faculty = new Faculty("Albert", "Cihampelas", "0855467677", "albert@gmail.com", "Computer Science", 80000, new MyDate(2022, 12, 5), 30, "Professor");
        Staff staff = new Staff("Xiaojun", "Gg Melati", "08970987621", "xiao@gmail.com", "Tata Usaha", 40000, new MyDate(2021, 9, 9), "Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}