/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import crossword.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/**
 *
 * @author julien
 */
public class GridView extends JComponent implements MouseListener,KeyListener {
    private Grid grid;
    private int x_actualclic,y_actualclic;
    public GridView(Grid g){
        this.grid=g;
        x_actualclic=0;
        y_actualclic=0;
        this.addMouseListener(this);
        this.addKeyListener(this);
    }
    
    @Override
    public void paintComponent(Graphics graphic){
        graphic=(Graphics2D)graphic;
        for(int i=0; i<grid.getSize();i++){
            for(int j=0;j<grid.getSize();j++){
                if(grid.getSquareTable()[i][j].isBlack()){
                    graphic.setColor(Color.BLACK);
                    graphic.fillRect(i, j, i*20, i*20);
                }else{
                    graphic.setColor(Color.white);
                    graphic.fillRect(i, j, i*20, i*20);
                    graphic.setColor(Color.BLACK);
                    graphic.drawString(grid.getSquareTable()[i][j].getLetterActual()+"", (i*20+(i+1)*20)/2, (j*20+(j+1)*20)/2);
                }
                
            }
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         x_actualclic=e.getX()/20;
         y_actualclic= e.getY()/20;
        
    
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if((e.getKeyChar()>'a' && e.getKeyChar()<'z') || (e.getKeyChar()>'A' && e.getKeyChar()<'Z')){
            this.getGraphics().drawString(" ", (x_actualclic*20+(x_actualclic+1)*20)/2, (y_actualclic*20+(y_actualclic+1)*20)/2);
            this.getGraphics().drawString(e.getKeyChar()+"", (x_actualclic*20+(x_actualclic+1)*20)/2, (y_actualclic*20+(y_actualclic+1)*20)/2);
            grid.getSquareTable()[x_actualclic][y_actualclic].setLetterActual(e.getKeyChar());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
