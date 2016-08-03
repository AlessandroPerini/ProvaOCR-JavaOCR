/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.OCRScanner;

/**
 *
 * @author aless
 */
public class ProvaConversioneImmagine {
    
    public static void main(String[] args) throws IOException {
        
        OCRScanner scanner = new OCRScanner();
        File file = new File("src/file/image2.jpg");
  
        Image image = ImageIO.read(file);
        
        /**
         * Qua uso il metodo .scan di OCRScanner. Penso sia quello giusto da usare, 
         * ma il risultato è una serie di righe vuote al posto di quelle convertite.
         * Non riesco a capire come sistemare.
         */
        String result = scanner.scan(image, 0, 0, 0, 0, null);
        
        System.out.println("Risultato conversione:\n"+result+"\n");
        
    }
}
