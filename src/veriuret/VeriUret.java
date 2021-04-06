/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriuret;

import java.io.BufferedWriter;
import java.util.Random;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author feyza
 */
public class VeriUret {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws URISyntaxException, IOException {
      
     
        File file = new File("denem2.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        try {
            
            FileWriter fos = new FileWriter(file);
           PrintWriter bw = new PrintWriter(fos);
          
            
            for(int i = 0; i < 10000; i++){
                double derse_devam = ThreadLocalRandom.current().nextDouble(0,100);
                double odev_sayisi = ThreadLocalRandom.current().nextDouble(0,5);
                double sinav_notu = ThreadLocalRandom.current().nextDouble(0,100);
                Uret b = new Uret(derse_devam,odev_sayisi,sinav_notu);
              
                bw.println(b);
            }
            
            bw.close();
          
        } catch (URISyntaxException | IOException ex) {
            System.out.print(ex.getMessage());
        }
        System.out.println("Bitti");
    }
}
    
