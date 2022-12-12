package Unit_5.Labs.linebreakerlab;

public class LineBreaker {
    public static String breakLine(String line, int maxCharsPerLine) {
        line = line.replaceAll(" ", "");
        for (int i = 0; i < line.length(); i+= maxCharsPerLine+1) {
            line = line.substring(0, i) + "\n" + line.substring(i);
        }
        return line;
    }
}
