package Unit_2._2_8.wordgames;

public class WordGames {
    private String word;

    public WordGames(String text)
    {
        word = text;
    }

    public String scramble()
    {
        // switch first half
        // and second half
        // of the word
        return word.substring(word.length() / 2) + word.substring(0, word.length() / 2);
    }


    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
    }


    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        return word.substring(0, word.indexOf(insertChar)) + insertText + word.substring(word.indexOf(insertChar));
    }


    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }
}
