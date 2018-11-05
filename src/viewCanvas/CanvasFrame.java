/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewCanvas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author user only
 */
public class CanvasFrame extends JFrame{
    private BolaPanel bolaPanel;
    public CanvasFrame() {
        init();
    }
 
    public void init(){
        this.setSize(500, 300);
        this.setLayout(new BorderLayout());
        bolaPanel = new BolaPanel();
        
        this.setVisible(true);
    }
}
