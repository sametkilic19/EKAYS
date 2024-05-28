package atik.toplama;

import transfer.TransferIstasyonu;

public class AtikToplamaModulu {
    private TransferIstasyonu transferIstasyonu;

    public AtikToplamaModulu(TransferIstasyonu transferIstasyonu) {
        this.transferIstasyonu = transferIstasyonu;
    }

    public void atikTopla(String atikTuru) {
        System.out.println(atikTuru + " türündeki atıklar toplandı.");
        transferIstasyonu.atikKabulEt(atikTuru);
    }
}


