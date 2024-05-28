package atik.islem.strateji;

public class AtikIslemeContext {
    private AtikIslemeStratejisi strateji;

    public void setStrateji(AtikIslemeStratejisi strateji) {
        this.strateji = strateji;
    }

    public void atikIsle() {
        strateji.islemYap();
    }
}