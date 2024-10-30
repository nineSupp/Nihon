/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Win
 */

import java.util.Random;

public class Hira {
    // Array for Hira
    private final String[] hiragana = {
            "あ", "い", "う", "え", "お",
            "か", "き", "く", "け", "こ",
            "が", "ぎ", "ぐ", "げ", "ご",
            "さ", "し", "す", "せ", "そ",
            "ざ", "じ", "ず", "ぜ", "ぞ",
            "た", "ち", "つ", "て", "と",
            "だ", "ぢ", "づ", "で", "ど",
            "な", "に", "ぬ", "ね", "の",
            "は", "ひ", "ふ", "へ", "ほ",
            "ば", "び", "ぶ", "べ", "ぼ",
            "ぱ", "ぴ", "ぷ", "ぺ", "ぽ",
            "ま", "み", "む", "め", "も",
            "や", "ゆ", "よ",
            "ら", "り", "る", "れ", "ろ",
            "わ", "を", "ん"
    };

    // Array for Roman (Romanji)
    private final String[] romanji = {
            "a", "i", "u", "e", "o",
            "ka", "ki", "ku", "ke", "ko",
            "ga", "gi", "gu", "ge", "go",
            "sa", "shi", "su", "se", "so",
            "za", "ji", "zu", "ze", "zo",
            "ta", "chi", "tsu", "te", "to",
            "da", "ji2", "zu2", "de", "do",
            "na", "ni", "nu", "ne", "no",
            "ha", "hi", "fu", "he", "ho",
            "ba", "bi", "bu", "be", "bo",
            "pa", "pi", "pu", "pe", "po",
            "ma", "mi", "mu", "me", "mo",
            "ya", "yu", "yo",
            "ra", "ri", "ru", "re", "ro",
            "wa", "wo", "n"
    };
    
    private static Random random = new Random();
    private int Answer;
    private String TAnswer;
    private String text1= romanji[random.nextInt(romanji.length)];
    private String text2= romanji[random.nextInt(romanji.length)];
    private String text3= romanji[random.nextInt(romanji.length)];
    private String romanA;

    public String ganQuestion() {
        int index = random.nextInt(0,71);
        Answer = index;//assigan the index to Answer
        TAnswer = hiragana[index];  // Hiragana character at that index
        return TAnswer ; // assing the Text of hira    
    }
    public String checkRomaji(String rom) {
        switch (rom) {
            case "ji2":
                return "ji";
            case "zu2":
                return "zu";
            default:
                return rom;
        }
    }
    
    public void getLocation(String romaji) {
        String sb = "assets/hiraganaChar/" + romaji + ".png";
        this.romanA = sb;
    }
    
    //get romanji use index num
    public  String getAnswer(){ return this.romanji[Answer]; }
    
    public  String getText(){ return text1; }
   
    public  String getText2(){ return text2; }
    
    public  String getText3(){ return text3; }
    
    public String getTAnswer(){ return this.TAnswer; }
    
    public String getLo() { return this.romanA; }
   

}