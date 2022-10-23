public class Mentor extends Murid{
    String nama;

    Mentor(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Nama Mentor \t\t : " + this.nama);
    }
}
