/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.HashMap;
import net.sourceforge.javaocr.gui.meanSquareOCR.TrainingImageSpec;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImage;
import net.sourceforge.javaocr.ocrPlugins.mseOCR.TrainingImageLoader;

/**
 *
 * @author aless
 */
public class Utility {

    public static HashMap<Character, ArrayList<TrainingImage>> getTrainingImageHashMap(ArrayList<TrainingImageSpec> imgs) throws Exception {
        TrainingImageLoader loader = new TrainingImageLoader();
        HashMap<Character, ArrayList<TrainingImage>> trainingImages = new HashMap<Character, ArrayList<TrainingImage>>();
        for (int i = 0; i < imgs.size(); i++) {
            loader.load(imgs.get(i).getFileLocation(), imgs.get(i).getCharRange(), trainingImages);
        }
        return trainingImages;
    }
    
}
