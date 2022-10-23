import java.sql.Time;

public class Program {

    public static void main(String[] args) {
        //Overriding

        Murid mhs = new Murid("Ratu Rismawati");
        mhs.info();

        mhs = new Mentor("Alun Sujjada M.Kom");
        mhs.info();

        mhs = new Subjek("Pemrograman berorientasi Objek");
        mhs.info();

        waktu(100);
        waktu("22 Mei 2022");
        waktu("Kamis",4, "Sore");
    }

    //Overloading
    static void waktu(int Wkt){
        System.out.println("Waktu Kuliah/M \t : " + Wkt);
    }

    static void waktu(String Wkt){
        System.out.println("Pada Tanggal \t : " + Wkt);
    }

    static void waktu(String hari, int Wkt, String waktu){
        System.out.println("Waktu \t\t\t : " + hari + ", Pukul " + Wkt + " " + waktu);
    }


}
