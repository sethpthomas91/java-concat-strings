package org.sethpthomas91.javaConcatStrings;

import java.lang.reflect.Array;

public class StringManipulator {
    public String removeBlankSpaces(String userString) {
        String answer = userString.trim();
        return answer;
    }

    public char[] generateArrayOfString(String userString) {
        int stringLength = userString.length();
        char[] answer = new char[stringLength];
        for (int i = 0; i < stringLength; i++) {
            answer[i] = userString.charAt(i);
        }
        return answer;
    }
}
