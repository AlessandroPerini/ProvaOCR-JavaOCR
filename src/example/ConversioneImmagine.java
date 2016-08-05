/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
import net.sourceforge.javaocr.gui.meanSquareOCR.TrainingImageSpec;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.CharacterRange;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.OCRScanner;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImage;
import utils.Utility;

/**
 *
 * @author aless
 */
public class ConversioneImmagine {
    
    public static void main(String[] args) throws IOException, Exception {
        
        
        /**
         * Trining del sistema tramite 3 immagini
         * 
         */
        ArrayList<TrainingImageSpec> imgs = new ArrayList<>();
        
        TrainingImageSpec trainImage = new TrainingImageSpec();
        
        
        trainImage.setFileLocation("src/file/training/training1.jpg");
        trainImage.setCharRange(new CharacterRange((int) '0', (int) '9'));
        imgs.add(trainImage);
               
        trainImage.setFileLocation("src/file/training/training2.jpg");
        trainImage.setCharRange(new CharacterRange((int) '!', (int) '~'));
        imgs.add(trainImage);
        
        trainImage.setFileLocation("src/file/training/training3.png");
        trainImage.setCharRange(new CharacterRange((int) '!', (int) '~'));
        imgs.add(trainImage);
        
        
        OCRScanner ocrScanner = new OCRScanner();
        HashMap<Character, ArrayList<TrainingImage>> trainingImages = Utility.getTrainingImageHashMap(imgs);
        ocrScanner.addTrainingImages(trainingImages);
        
        
        /**
         * Conversione documento
         * 
         */
        
        String filToConvert = "src/file/hpljPicaSample.jpg";
        
        BufferedImage targetImage = ImageIO.read(new File(filToConvert));
        
        System.out.println("\nProcessing...\n");
        
        String text = ocrScanner.scan(targetImage, 0, 0, 0, 0, null);
        System.out.println("Risultato conversione:\n\n"+text+"\n");
        
    }
}
