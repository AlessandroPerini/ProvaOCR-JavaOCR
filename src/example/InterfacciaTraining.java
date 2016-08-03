// main.java
// Copyright (c) 2010 William Whitney
// All rights reserved.
// This software is released under the BSD license.
// Please see the accompanying LICENSE.txt for details.
package example;

import java.util.logging.Logger;
import net.sourceforge.javaocr.gui.GUIController;

/**
 * Launches the GUI controller for the javaocr toolkit.
 * @author William Whitney
 */
public class InterfacciaTraining
{

    public InterfacciaTraining()
    {
    }

    /**
     * Main method of application.
     * @param args none needed
     */
    public static void main(String[] args)
    {
        //Create GUI Controller
        GUIController guiController = new GUIController();
        guiController.showGUI();
    }
    private static final Logger LOG = Logger.getLogger(InterfacciaTraining.class.getName());
}
