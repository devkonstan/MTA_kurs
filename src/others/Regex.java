package others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile("Marcin");
        Matcher matcher = compiledPattern.matcher("Marcin");
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
    }
}
