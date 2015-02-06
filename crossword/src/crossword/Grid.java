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
    private ArrayList<String> listWord;
    private Square [][] squareTable;

    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<String> getListWord() {
        return listWord;
    }

    public void setListWord(ArrayList<String> listWord) {
        this.listWord = listWord;
    }

    public Square[][] getSquareTable() {
        return squareTable;
    }

    public void setSquareTable(Square[][] squareTable) {
        this.squareTable = squareTable;
    }
    
    
    
}
