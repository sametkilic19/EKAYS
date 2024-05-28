package enerji.üretim;

public class EnerjiUretimTesisi {
    private static EnerjiUretimTesisi instance;

    private EnerjiUretimTesisi() {
        // Constructor private, böylece dışarıdan erişim engellenir.
    }

    public static synchronized EnerjiUretimTesisi getInstance() {
        if (instance == null) {
            instance = new EnerjiUretimTesisi();
        }
        return instance;
    }

    public void enerjiUret(String atikTuru) {
        System.out.println(atikTuru + " türündeki atıklardan enerji üretiliyor.");
    }
}


