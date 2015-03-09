/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword;

/**
 *
 * @author Flo
 */
public class Square {
    
    private char letterActual;
    private char letterWanted;
    public boolean isSelected=false;
    public Square() {
        this.letterActual = ' ';
        this.letterWanted = ' ';
    }
    
    public Square(char letterWanted) {
        this.letterActual = ' ';
        this.letterWanted = letterWanted;
    }
    
    /**
     * 
     * @return if the square is filled with the good letter
     */
    public boolean isCorrect(){
        return (letterActual==letterWanted);
    }
    
    /**
     * 
     * @return if the square must be black or not
     */
    public boolean isBlack(){
        return letterWanted==' ';
    }

    public char getLetterActual() {
        return letterActual;
    }

    public void setLetterActual(char letterActual) {
        this.letterActual = letterActual;
    }

    public char getLetterWanted() {
        return letterWanted;
    }

    public void setLetterWanted(char letterWanted) {
        this.letterWanted = letterWanted;
    }
    
    
    
}
