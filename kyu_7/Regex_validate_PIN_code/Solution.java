package kyu_7.Regex_validate_PIN_code;

public class Solution {

    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }

}