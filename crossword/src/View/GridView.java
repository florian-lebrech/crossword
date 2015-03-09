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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/**
 *
 * @author julien
 */
public class GridView extends JComponent implements MouseListener,KeyListener,ActionListener {
    private Grid grid;
    private int x_actualclic,y_actualclic;
    private int squareSize;
    private CongratulationsPopUp popup;
    public GridView(Grid g){
        this.grid=g;
        x_actualclic=0;
        y_actualclic=0;
        grid.getSquareTable()[x_actualclic][y_actualclic].isSelected=true;
        squareSize=50;
        
        this.addMouseListener(this);
        this.addKeyListener(this);
        //this.repaint();
        this.setPreferredSize(new Dimension(squareSize*(grid.getSize()),squareSize*(grid.getSize())));
        this.setBounds(0,0,squareSize*(grid.getSize()),squareSize*(grid.getSize()));
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
                    if(grid.getSquareTable()[i][j].isSelected){
                    graphic.setColor(Color.RED);
                    graphic.fillRect(i*squareSize, j*squareSize, squareSize, squareSize);
                    }else{
                    graphic.setColor(Color.WHITE);
                    graphic.fillRect(i*squareSize, j*squareSize, squareSize, squareSize); 
                    }
                  if(grid.isThisSquareWordComplete(i, j)){
                                      graphic.setColor(Color.GREEN);  
                   graphic.drawString(grid.getSquareTable()[i][j].getLetterActual()+"", (i*squareSize+(i+1)*squareSize)/2, (j*squareSize+(j+1)*squareSize)/2);
           
                  }else{
                    graphic.setColor(Color.BLACK);  
                   graphic.drawString(grid.getSquareTable()[i][j].getLetterActual()+"", (i*squareSize+(i+1)*squareSize)/2, (j*squareSize+(j+1)*squareSize)/2);
                  }
                }
                graphic.setColor(Color.GRAY);
                graphic.drawRect(i*squareSize, j*squareSize, (i+1)*squareSize, (j+1)*squareSize);
            }
            for(int k=0;k<grid.getListWord().size();k++){
                int tmp=grid.getListWord().get(k).getWordNumber();
                tmp++;
                graphic.drawString(tmp+"", grid.getListWord().get(k).getPosX()*50+10 
                        ,grid.getListWord().get(k).getPosY()*50+10);
            }
        }
        
        //this.validate();
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       grid.getSquareTable()[x_actualclic][y_actualclic].isSelected=false;
        this.x_actualclic=e.getX()/squareSize;
        this.y_actualclic= e.getY()/squareSize;
        grid.getSquareTable()[x_actualclic][y_actualclic].isSelected=true;
        this.repaint();
        
    
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
        if(grid.isGridFinished()){
            popup=new CongratulationsPopUp(grid);
            popup.getValid().addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==popup.getValid()){
            for(int i=0;i<grid.getSize();i++){
                for(int j=0;j<grid.getSize();j++){
                    grid.getSquareTable()[i][j].setLetterActual(' ');
                }
            }
            popup.dispose();
            this.repaint();
        }
    }
}
