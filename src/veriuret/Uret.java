/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriuret;

/**
 *
 * @author feyza
 */
import java.io.File;
import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author feyza
 */
public class Uret {
   private FIS fis;
    private double derse_devam;
    private double odev_sayisi;
    private double sinav_notu;

    public Uret(double dersed, double odevs, double sinavn) throws URISyntaxException {
        
        File dosya = new File(getClass().getResource("bulanikmantik.fcl").toURI());
        fis = FIS.load(dosya.getPath(), true);
        derse_devam = dersed;
        odev_sayisi = odevs;
        sinav_notu = sinavn;
        
    }
    public Uret() throws URISyntaxException {
        
        File dosya = new File(getClass().getResource("bulanikmantik.fcl").toURI());
        fis = FIS.load(dosya.getPath(), true);
        derse_devam = 0;
        odev_sayisi = 0;
        sinav_notu = 0;
        
        fis.setVariable("derse_devam",derse_devam );
        fis.setVariable("odev_sayisi", odev_sayisi);
        fis.setVariable("sinav_notu", sinav_notu);
        fis.evaluate();
    
       
        
    }
        
    public FIS getModel() {
        return fis;
    }

    @Override
    public String toString() {
         String cikti="Derse devam : "+derse_devam+"\n"
                    +"Odev sayisi : "+odev_sayisi+"\n"
                    +"Sinav notu : "+sinav_notu+"\n"
                    +"Basari notu : "+fis.getVariable("basari_notu").getValue();
        return cikti;
    }
}

