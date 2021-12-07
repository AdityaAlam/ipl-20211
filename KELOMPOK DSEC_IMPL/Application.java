/**
 *
 * @author Kelompok DSEC
 */
public class Application {
    public static void main(String[] args){
        System.out.println("==========================================================");
        System.out.println("| Class biasa                                            |");
        System.out.println("==========================================================");
        Orang Andi = new Orang();
        Andi.setNama("Andi");
        System.out.println("Class Andi : " + Andi.getNama());
        Orang Budi = new Orang();
        Budi.setNama("Budi");
        System.out.println("Class Budi : " + Budi.getNama());
        Andi.setNama("Candra");
        System.out.println("Ubah Andi menjadi " + Andi.getNama());
        Budi.setNama("Dedi");
        System.out.println("Ubah Budi menjadi " + Budi.getNama());
        // singleton
        System.out.println("==========================================================");
        System.out.println("| Singleton                                               |");
        System.out.println("==========================================================");
        OrangSingleton andiSingleton = OrangSingleton.getInstance("Andi");
        OrangSingleton budiSingleton = OrangSingleton.getInstance("Budi");
        // test output
        System.out.println("Class AndiSingleton : " + andiSingleton.getNama());
        System.out.println("Class BudiSingleton : " + budiSingleton.getNama());
        // test ubah nama
        andiSingleton.setNama("Candra");
        System.out.println("Ubah AndiSingleton menjadi " + andiSingleton.getNama());
        System.out.println("Cetak BudiSingleton : " + budiSingleton.getNama());
        budiSingleton.setNama("Dedi");
        System.out.println("Ubah BudiSingleton menjadi " + budiSingleton.getNama());
        System.out.println("Cetak AndiSingleton : " + andiSingleton.getNama());
    }
}