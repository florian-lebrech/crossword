/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword;

import View.PrincipalView;
import java.util.ArrayList;

/**
 *
 * @author Flo
 */
public class Crossword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Word w1 = new Word("IVRE", "DRUNK", 0, 0, true, 0);
        Word w2 = new Word("HEUREUX", "HAPPY", 4, 0, true, 1);
        Word w3 = new Word("COURIR", "RUN", 0, 1, false, 2);
        Word w4 = new Word("APPLICATION", "APP", 2, 2, false, 3);
        Word w5 = new Word("NOM", "NAME", 2, 1, true, 4);

        ArrayList<Word> listWord = new ArrayList<>();
        listWord.add(w1);
        listWord.add(w2);
        listWord.add(w3);
        listWord.add(w4);
        listWord.add(w5);
        
           
        Grid gridWord = new Grid(listWord, 10);
        
        PrincipalView view =new PrincipalView(gridWord);

    }

}
