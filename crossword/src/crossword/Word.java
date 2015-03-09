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
    private int posX;
    private int posY;
    private boolean vertical;
    private boolean right;
    private int wordNumber;

    public void setWordNumber(int wordNumber) {
        this.wordNumber = wordNumber;
    }

    
    public boolean isRight() {
        return right;
    }

    public int getWordNumber() {
        return wordNumber;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }
    
    
 

    public Word(String frenchWord, String englishWord, int posX, int posY, boolean vertical, int wordNumber) {
        this.frenchWord = frenchWord;
        this.englishWord = englishWord;
        this.posX = posX;
        this.posY = posY;
        this.vertical = vertical;
        this.right=false;
        this.wordNumber=wordNumber;
    }

    public void setIsRight(boolean isRight) {
        this.right = isRight;
    }

    public boolean isIsRight() {
        return right;
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
