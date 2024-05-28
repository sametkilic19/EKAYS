package atik.isleme;
public class AtikIslemeFactory {
    public static AtikIsleme getIsleme(String atikTuru) {
        switch (atikTuru) {
            case "Biyometanizasyon":
                return new Biyometanizasyon();
            case "GazlastirmaYakma":
                return new GazlastirmaYakma();
            default:
                throw new IllegalArgumentException("Bilinmeyen atık türü: " + atikTuru);
        }
    }
}