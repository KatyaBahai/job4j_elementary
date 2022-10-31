package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean result = false;
        if (name.isEmpty()
                || Character.isUpperCase(name.codePointAt(0))
                || Character.isDigit(name.codePointAt(0))) {
            return false;
        }

        for (int index = 0; index < name.length(); index++) {
            if (isSpecialSymbol(name.codePointAt(index))
                    || isUpperLatinLetter(name.codePointAt(index))
                    || isLowerLatinLetter(name.codePointAt(index))
                    || Character.isDigit(name.codePointAt(index))) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code != 36 && code != 95;
    }

    public static boolean isUpperLatinLetter(int code) {
               return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
