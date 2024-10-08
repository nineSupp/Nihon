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
    private static String[] hiragana = {
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
    private static String[] romanji = {
            "a", "i", "u", "e", "o",
            "ka", "ki", "ku", "ke", "ko",
            "ga", "gi", "gu", "ge", "go",
            "sa", "shi", "su", "se", "so",
            "za", "ji", "zu", "ze", "zo",
            "ta", "chi", "tsu", "te", "to",
            "da", "ji", "zu", "de", "do",
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
    private static int Answer;
    private static int scorer = 0;
    private static int numAnswer =  random.nextInt(1, 4);
    private  String TAnswer;
    private static String text1= romanji[random.nextInt(romanji.length)];
    private static String text2= romanji[random.nextInt(romanji.length)];
    private static String text3= romanji[random.nextInt(romanji.length)];
    


   
    public String ganQuestion() {
        int index = random.nextInt(hiragana.length);
        Answer = index;//assigan the index to Answer
        return TAnswer = hiragana[index]; // assing the Text of hira    
    }
    
//public static String  ganAnswer1() {
//        numAnswer = random.nextInt(1, 4);      
//        for (int i = 1; i <= 3; i++) {
//            int index = random.nextInt(71);
//            int index2 = random.nextInt(71);
//                text1 = romanji[index];
//                
//            }   
//        return text1;
//    }
//
//public static String  ganAnswer2() {
//        numAnswer = random.nextInt(1, 4);      
//        for (int i = 1; i <= 3; i++) {
//            int index = random.nextInt(71);
//            int index2 = random.nextInt(71);
//                text2 = romanji[index];
//                
//            }   
//        return text2;
//    }
public static String getAnswer(){
    return romanji[Answer];//get romanji use index num
}
public static String getText(){
    return text1;
}
public static String getText2(){
    return text2;
}
public static String getText3(){
    return text3;
}
   

    public static void setScorer(int input) {
        for (int i = 1; i < 3; i++) {
            if (numAnswer == input) {
                scorer++;
                break;
            } else {
                System.out.print("Try agian:");
            
            }
        }

    }
    
}
