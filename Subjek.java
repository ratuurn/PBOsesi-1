public class Subjek extends Mentor{
    String nama;

    Subjek(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Subjek \t : " + this.nama);
    }
}
