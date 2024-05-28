package EntegreKatiAtikYonetimSistemi;

import atik.islem.strateji.AtikIslemeContext;
import atik.islem.strateji.BiyometanizasyonStratejisi;
import atik.islem.strateji.GazlastirmaYakmaStratejisi;
import atik.toplama.AtikToplamaModulu;
import enerji.üretim.EnerjiUretimTesisi;
import rapor.RaporlamaVeIzlemeModulu;
import transfer.IslemeTesisi;
import transfer.TransferIstasyonu;

public class EntegreKatiAtikYonetimSistemi {
    public static void main(String[] args) {
        // Transfer İstasyonu ve İşleme Tesisleri oluşturuluyor
        TransferIstasyonu transferIstasyonu = new TransferIstasyonu();
        IslemeTesisi biyometanizasyonTesisi = new IslemeTesisi("Biyometanizasyon Tesisi");
        IslemeTesisi gazlastirmaYakmaTesisi = new IslemeTesisi("Gazlaştırma ve Yakma Tesisi");
        
        // İşleme tesisleri transfer istasyonuna ekleniyor
        transferIstasyonu.addObserver(biyometanizasyonTesisi);
        transferIstasyonu.addObserver(gazlastirmaYakmaTesisi);
        
        // Atık Toplama Modülü oluşturuluyor
        AtikToplamaModulu atikToplamaModulu = new AtikToplamaModulu(transferIstasyonu);
        
        // Enerji Üretim Tesisi oluşturuluyor
        EnerjiUretimTesisi enerjiUretimTesisi = EnerjiUretimTesisi.getInstance();
        
        // Raporlama ve İzleme Modülü oluşturuluyor
        RaporlamaVeIzlemeModulu raporlamaVeIzlemeModulu = new RaporlamaVeIzlemeModulu();
        
        // Sistem iş akışı
        String atikTuru = "Organik Atik";
        atikToplamaModulu.atikTopla(atikTuru);
        enerjiUretimTesisi.enerjiUret(atikTuru);
        raporlamaVeIzlemeModulu.izlemeDurumuGuncelle("Atık işlendi ve enerji üretildi.");
        raporlamaVeIzlemeModulu.raporla("Günlük enerji üretim miktarı: 1289 MWs");

        // Atık işleme stratejileri
        AtikIslemeContext context = new AtikIslemeContext();
        context.setStrateji(new BiyometanizasyonStratejisi());
        context.atikIsle();

        context.setStrateji(new GazlastirmaYakmaStratejisi());
        context.atikIsle();
    }
}

