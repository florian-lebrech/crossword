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

    
    public Word(String frenchWord, String englishWord) {
        this.frenchWord = frenchWord;
        this.englishWord = englishWord;
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
