/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import crossword.Grid;
import java.awt.Color;
import java.awt.Dimension;
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
    private int squareSize;
    
    public GridView(Grid g){
        this.grid=g;
        x_actualclic=0;
        y_actualclic=0;
        squareSize=50;
        
        this.addMouseListener(this);
        this.addKeyListener(this);
        //this.repaint();
        this.setVisible(true);
    }
    
    @Override
    public void paintComponent(Graphics graphic){
        graphic=(Graphics2D)graphic;
        for(int i=0; i<grid.getSize();i++){
            for(int j=0;j<grid.getSize();j++){
                if(grid.getSquareTable()[i][j].isBlack()){
                    graphic.setColor(Color.BLACK);
                    graphic.fillRect(i*squareSize, j*squareSize, squareSize, squareSize);
                }else{
                    graphic.setColor(Color.WHITE);
                    graphic.fillRect(i*squareSize, j*squareSize, squareSize, squareSize);
                  
                    graphic.setColor(Color.BLACK);
                    
                    graphic.drawString(grid.getSquareTable()[i][j].getLetterActual()+"", (i*squareSize+(i+1)*squareSize)/2, (j*squareSize+(j+1)*squareSize)/2);
                }
                graphic.setColor(Color.GRAY);
                graphic.drawRect(i*squareSize, j*squareSize, (i+1)*squareSize, (j+1)*squareSize);
            }
        }
        this.setPreferredSize(new Dimension(squareSize*(grid.getSize()),squareSize*(grid.getSize())));
        //this.validate();
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.x_actualclic=e.getX()/squareSize;
        this.y_actualclic= e.getY()/squareSize;
        
    
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
        if(((e.getKeyChar()>='a' && e.getKeyChar()<='z') || (e.getKeyChar()>='A' && e.getKeyChar()<='Z')) && grid.getSquareTable()[x_actualclic][y_actualclic].isBlack()==false && grid.isThisSquareWordComplete(x_actualclic, y_actualclic)==false){
            grid.getSquareTable()[x_actualclic][y_actualclic].setLetterActual(Character.toUpperCase(e.getKeyChar()));
            this.repaint();
        }
        
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
