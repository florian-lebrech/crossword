/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import crossword.Grid;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author julien
 */
public class DefinitionView extends JPanel {
    private ArrayList <JLabel> vert_words,hor_words;
    private Grid grid;
    private GridBagConstraints cont = new GridBagConstraints();
    public DefinitionView(Grid g){
        grid=g;
        vert_words=new ArrayList<>();
        hor_words=new ArrayList<>();
        cont.fill=GridBagConstraints.BOTH;
        this.setLayout(new GridBagLayout());
        cont.gridx=0;
        cont.gridy=0;
        this.add(new JLabel("Translations :"));
        cont.gridx=1;
        cont.gridy=1;
        this.add(new JLabel(" Vertical words"));
        cont.gridx=2;
        cont.gridy=2;
        this.fullFillArrayLists();
        for(int i=0;i<vert_words.size();i++){
            this.add(vert_words.get(i));
            cont.gridy+=1;
        }
        cont.gridx=1;
        cont.gridy+=1;
        this.add(new JLabel(" Horizontal words"));
        cont.gridx=2;
        for(int i=0;i<hor_words.size();i++){
            this.add(hor_words.get(i));
            cont.gridy+=1;
        }
        
    }
    public void fullFillArrayLists(){
        int vert_count=1,hor_count=1;
        for(int i=0;i<grid.getListWord().size();i++){    
            if(grid.getListWord().get(i).isVertical()){
                vert_words.add(new JLabel(vert_count+"-"+grid.getListWord().get(i).getFrenchWord()));
                vert_count++;
            }else{
                hor_words.add(new JLabel(hor_count+"-"+grid.getListWord().get(i).getFrenchWord()));
                hor_count++;
            }
        }
    }
}
