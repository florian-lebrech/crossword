/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword;

import java.util.ArrayList;

/**
 *
 * @author Flo
 */
public class Grid {

    private int size;
    private ArrayList<Word> listWord;
    private Square[][] squareTable;

    public boolean isGridFinished() {
        for (int i = 0; i < size; i++) {
            for(int j=0;j<size;j++){
                if(!squareTable[i][j].isCorrect()){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Word> getListWord() {
        return listWord;
    }

    public void setListWord(ArrayList<Word> listWord) {
        this.listWord = listWord;
    }

    public Square[][] getSquareTable() {
        return squareTable;
    }

    public void setSquareTable(Square[][] squareTable) {
        this.squareTable = squareTable;
    }

    public Grid(ArrayList<Word> listWord, int size) {
        this.listWord = listWord;
        this.size = size;
        squareTable = new Square[10][10];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squareTable[i][j] = new Square();
            }
        }

        for (Word w : listWord) {
            char c[] = w.getEnglishWord().toCharArray();
            int i = 0;
            while (i < c.length) {
                if (w.isVertical()) {
                    squareTable[w.getPosX()][w.getPosY() + i].setLetterWanted(c[i]);
                } else {
                    squareTable[w.getPosX() + i][w.getPosY()].setLetterWanted(c[i]);
                }
                i++;
            }
        }
    }

    public Grid() {

    }

    @Override
    public String toString() {
        String s = new String();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                s += squareTable[i][j].getLetterWanted();
            }
            s += '\n';
        }
        return s;
    }

}
