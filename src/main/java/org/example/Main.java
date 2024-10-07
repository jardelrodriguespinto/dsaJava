package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMiddle("teslaa"));
    }

    static String getMiddle(String s) {

        // Ja r del

        //Ca mi la

        int middle = s.length() / 2;

        if (s.length() % 2 == 0)
            return s.substring(middle - 1, middle + 1);

        return s.substring(middle, middle + 1);
    }
}