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
        Word w3 = new Word("COURIR", "RUN", 2, 3, false, 2);
        Word w4 = new Word("APPLICATION", "APP", 2, 3, true, 3);

        ArrayList<Word> michel = new ArrayList<>();
        michel.add(w1);
        michel.add(w2);
        michel.add(w3);
        michel.add(w4);

        Grid jacquie = new Grid(michel, 10);
        
        PrincipalView view =new PrincipalView(jacquie);

    }

}
