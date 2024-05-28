package transfer;

public class IslemeTesisi implements Observer {
    private String tesisAdi;

    public IslemeTesisi(String tesisAdi) {
        this.tesisAdi = tesisAdi;
    }

    @Override
    public void update(String message) {
        System.out.println(tesisAdi + ": " + message);
    }
}
