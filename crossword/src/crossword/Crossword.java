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
        Word w6 = new Word("APPUYER", "PRESS", 4, 3, false, 5);
        Word w7 = new Word("MASQUE", "MASK", 8, 1, true, 6);
        Word w8 = new Word("EFFICACE", "EFFECTIVE", 6, 0, true, 7);
        Word w9 = new Word("FINI", "FINISHED", 0, 8, false, 8);
        Word w10 = new Word("CAISSIERE", "CASHIER", 2, 6, false, 9);
        Word w11 = new Word("FRENETIQUE", "MANIC", 3, 5, true, 10);
        Word w12 = new Word("GLOIRE", "FAME", 6, 1, false, 11);
        Word w13 = new Word("CONNECTION SANS FIL", "WIFI", 0, 6, true, 12);
        Word w14 = new Word("MOYENNE", "AVERAGE", 0, 0, true, 13);
        Word w15 = new Word("MOT CROISES", "CROSSWORD", 0, 0, true, 14);
        Word w16 = new Word("MOTIF", "REASON", 0, 0, true, 15);
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

        //Grid grid_ONE = new Grid(listWord, 10);
        PrincipalView view = new PrincipalView(try_generate());

    }

    public static Grid try_generate() {
        Grid g;
        ArrayList<Word> dico = new ArrayList<>();
        ArrayList<Word> list = new ArrayList<>();
        //INIT du dico
        Word w1 = new Word("IVRE", "DRUNK", 0, 0, true, 0);
        Word w2 = new Word("HEUREUX", "HAPPY", 4, 0, true, 1);
        Word w3 = new Word("COURIR", "RUN", 0, 1, false, 2);
        Word w4 = new Word("APPLICATION", "APP", 2, 2, false, 3);
        Word w5 = new Word("NOM", "NAME", 2, 1, true, 4);
        Word w6 = new Word("APPUYER", "PRESS", 4, 3, false, 5);
        Word w7 = new Word("MASQUE", "MASK", 8, 1, true, 6);
        Word w8 = new Word("EFFICACE", "EFFECTIVE", 6, 0, true, 7);
        Word w9 = new Word("FINI", "FINISHED", 0, 8, false, 8);
        Word w10 = new Word("CAISSIERE", "CASHIER", 2, 6, false, 9);
        Word w11 = new Word("FRENETIQUE", "MANIC", 3, 5, true, 10);
        Word w12 = new Word("GLOIRE", "FAME", 6, 1, false, 11);
        Word w13 = new Word("CONNECTION SANS FIL", "WIFI", 0, 6, true, 12);
        Word w14 = new Word("MOYENNE", "AVERAGE", 0, 0, true, 13);
        Word w15 = new Word("MOT CROISES", "CROSSWORD", 0, 0, true, 14);
        Word w16 = new Word("MOTIF", "REASON", 0, 0, true, 15);
        Word w17 = new Word("FOLIE", "INSANITY", 0, 0, true, 16);
        Word w18 = new Word("TELEPHONE", "PHONE", 0, 0, true, 17);
        Word w19 = new Word("INVOQUER", "SUMMON", 0, 0, true, 18);
        Word w20 = new Word("ACCIDENT MORTEL", "FATALITY", 0, 0, true, 19);
        //ajout des mots au dico
        dico.add(w1);
        dico.add(w2);
        dico.add(w3);
        dico.add(w4);
        dico.add(w5);
        dico.add(w6);
        dico.add(w7);
        dico.add(w8);
        dico.add(w9);
        dico.add(w10);
        dico.add(w11);
        dico.add(w12);
        dico.add(w13);
        dico.add(w14);
        dico.add(w15);
        dico.add(w16);
        dico.add(w17);
        dico.add(w18);
        dico.add(w19);
        dico.add(w20);
        //CHOIX du premier Mots
        list.add(dico.get((int) (Math.random() * (dico.size() - 1))));
        dico.remove(list.get(0));
        //placement du Premier mot
        int tmp;
        boolean f;
        tmp = (int) (Math.random() * 2);
        if (tmp == 0) {
            f = true;
        } else {
            f = false;
        }
        list.get(0).setPosX(0);
        list.get(0).setPosY(0);
        list.get(0).setVertical(f);
        list.get(0).setWordNumber(0);
        int nb_mots = 1;
        boolean gridComplete = false;
        boolean vert;
        if (f) {
            vert = false;
        } else {
            vert = true;
        }
        //placement du 2eme mot
        int posx = 0, posy = 0;
        char first_letter = list.get(0).getEnglishWord().charAt(1);
        for (int i = 0; i < dico.size(); i++) {
            if (first_letter == dico.get(i).getEnglishWord().charAt(0)) {
                if (vert) {

                    posx = 1;
                    posy = 0;
                } else {

                    posx = 0;
                    posy = 1;
                }
                list.add(dico.get(i));
                dico.remove(i);
                list.get(1).setPosX(posx);
                list.get(1).setPosY(posy);
                list.get(1).setVertical(vert);
                list.get(1).setWordNumber(1);
                if (vert) {
                    vert = false;
                } else {
                    vert = true;
                }
                break;
            }
        }
        if (list.size() == 1) {
            first_letter = list.get(0).getEnglishWord().charAt(2);

            for (int i = 0; i < dico.size(); i++) {
                if (first_letter == dico.get(i).getEnglishWord().charAt(0)) {
                    if (vert) {

                        posx = 2;
                        posy = 0;
                    } else {

                        posx = 0;
                        posy = 2;
                    }
                    list.add(dico.get(i));
                    dico.remove(i);
                    list.get(1).setPosX(posx);
                    list.get(1).setPosY(posy);
                    list.get(1).setVertical(vert);
                    list.get(1).setWordNumber(1);
                    if (vert) {
                        vert = false;
                    } else {
                        vert = true;
                    }
                    break;
                }
            }
        }

        int infinite = 0;
        //placement du 3eme mot
        while (!gridComplete) {
            char first_letter_2 = list.get(list.size() - 1).getEnglishWord().charAt(2);
            infinite += 1;
            for (int i = 0; i < dico.size(); i++) {
                if (!vert) {
                    if (first_letter_2 == dico.get(i).getEnglishWord().charAt(0)) {
                        if (dico.get(i).getEnglishWord().length() + posx <= 9) {
                            posy += 2;

                            list.add(dico.get(i));
                            dico.remove(i);
                            nb_mots++;
                            list.get(nb_mots).setPosX(posx);
                            list.get(nb_mots).setPosY(posy);
                            list.get(nb_mots).setVertical(false);
                            list.get(nb_mots).setWordNumber(nb_mots);

                            
                            infinite = 0;
                            vert = true;
                            break;
                        } else {
                            gridComplete = true;
                            break;
                        }
                    }

                } else {

                    if (first_letter_2 == dico.get(i).getEnglishWord().charAt(0)) {
                        if (dico.get(i).getEnglishWord().length() + posy <= 9) {
                            list.add(dico.get(i));
                            dico.remove(i);
                            posx += 2;
                            nb_mots++;
                            list.get(nb_mots).setPosX(posx);
                            list.get(nb_mots).setPosY(posy);
                            list.get(nb_mots).setVertical(true);
                            list.get(nb_mots).setWordNumber(nb_mots);

                            
                            infinite = 0;
                            vert = false;
                            break;
                        } else {
                            gridComplete = true;
                            break;
                        }
                    }

                }
            }
            if (infinite == 3) {
                gridComplete = true;
            }

        }

        //RETURN
        g = new Grid(list, 12);
        return g;
    }
}
