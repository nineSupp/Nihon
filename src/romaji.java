/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class romaji {
    // Array for Roman (Romanji)
    private  String[] romanji = {
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
    
    // User must not be able to see ji2 and zu2.
    // Instead it should be ji and zu respectively.
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
    
    public String getLocation(String rom, String option) {
        String location = "assets/" + option + "/" + rom + ".png";
        return location;
    }
}
