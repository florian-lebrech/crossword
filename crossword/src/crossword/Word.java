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
public class Word {
    
    private String frenchWord;
    private String englishWord;
    private final int posX;
    private final int posY;
    private final boolean vertical;
    
    
 

    public Word(String frenchWord, String englishWord, int posX, int posY, boolean vertical) {
        this.frenchWord = frenchWord;
        this.englishWord = englishWord;
        this.posX = posX;
        this.posY = posY;
        this.vertical = vertical;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean isVertical() {
        return vertical;
    }
    
    
    public String getFrenchWord() {
        return frenchWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setFrenchWord(String frenchWord) {
        this.frenchWord = frenchWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
    
    
}
