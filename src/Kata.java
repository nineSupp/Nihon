///*
 /*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pilotjones
 */

import java.util.Random;

public class Kata {
    private final String[] katakana = {
            "ア", "イ", "ウ", "エ", "オ",
            "カ", "キ", "ク", "ケ", "コ",
            "ガ", "ギ", "グ", "ゲ", "ゴ",
            "サ", "シ", "ス", "セ", "ソ",
            "ザ", "ジ", "ズ", "ゼ", "ゾ",
            "タ", "チ", "ツ", "テ", "ト",
            "ダ", "ヂ", "ヅ", "デ", "ド",
            "ナ", "ニ", "ヌ", "ネ", "ノ",
            "ハ", "ヒ", "フ", "ヘ", "ホ",
            "バ", "ビ", "ブ", "ベ", "ボ",
            "パ", "ピ", "プ", "ペ", "ポ",
            "マ", "ミ", "ム", "メ", "モ",
            "ヤ", "ユ", "ヨ",
            "ラ", "リ", "ル", "レ", "ロ",
            "ワ", "ヲ", "ン"
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
        TAnswer = katakana[index];  // Hiragana character at that index
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
        String sb = "assets/katakanaChar/" + romaji + ".png";
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
