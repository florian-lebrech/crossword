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
        Word w6 =new Word("APPUYER","PRESS",4,3,false,5);
        Word w7 =new Word ("MASQUE","MASK",8,1,true,6);
        Word w8 =new Word ("EFFICACE","EFFECTIVE",6,0,true,7);
        Word w9 =new Word ("FINI","FINISHED",0,8,false,8);
        Word w10 =new Word ("CAISSIERE","CASHIER",2,6,false,9);
        Word w11 =new Word ("FRENETIQUE","MANIC",3,5,true,10);
        Word w12 =new Word ("GLOIRE","FAME",6,1,false,11);
        Word w13 =new Word ("CONNECTION SANS FIL","WIFI",0,6,true,12);
        
        ArrayList<Word> listWord = new ArrayList<>();
        listWord.add(w1);
        listWord.add(w2);
        listWord.add(w3);
        listWord.add(w4);
        listWord.add(w5);
        listWord.add(w6);
        listWord.add(w7);
        listWord.add(w8);
        listWord.add(w9);
        listWord.add(w10);
        listWord.add(w11);
        listWord.add(w12);
        listWord.add(w13);
           
        Grid grid_ONE = new Grid(listWord, 10);
        
        
        PrincipalView view =new PrincipalView(grid_ONE);

    }

}
