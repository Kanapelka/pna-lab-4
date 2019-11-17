package tcp.server;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomRequestProcessor implements IRequestProcessor {
    private Pattern vowelsRegExpr = Pattern.compile("[eyuioa]", Pattern.CASE_INSENSITIVE);
    private Pattern consonantsRegExpr = Pattern.compile("[qwrtpsdfghklzxcvbnm]", Pattern.CASE_INSENSITIVE);

    @Override
    public String execute(String request) {
        return "Vowels: " + GetVowelsCount(request) + ", Consonants: " + GetConsonantsCount(request);
    }

    private int GetVowelsCount(String string) {
        var matches = 0;
        var matcher = vowelsRegExpr.matcher(string);
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }

    private int GetConsonantsCount(String string) {
        var matches = 0;
        var matcher = consonantsRegExpr.matcher(string);
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }
}
