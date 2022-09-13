package com.dsa.google;

import java.util.*;

public class GenerateAllString {

    public static void main(String[] args) {
        generate_binary_string("1??0?101");
    }
    // driver code
    public static List<String> generate_binary_string(String s) {
        ArrayList<String> list = new ArrayList<String>();
        char c[] = s.toCharArray();
        helper(c, 0, list);
        return list;
    }

    public static void helper(char c[], int index, ArrayList<String> list) {
        if (index == c.length) {
            list.add(String.valueOf(c));
            return;
        }

        if (c[index] == '?') {
            c[index] = '0';
            helper(c, index+1, list);
            c[index] = '1';
            helper(c, index+1, list);
            c[index] = '?';
        } else {
            helper(c, index + 1, list);
        }


    }

}
