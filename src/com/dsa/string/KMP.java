package com.dsa.string;

public class KMP {
    public static void main(String[] args) {
        int lps[] = new int[8];
        fillLPS("ababacab", lps);
    }

    private static void fillLPS(String str, int[] lps) {
        for (int i = 0; i < str.length(); i++) {
            lps[i] = longPropPrefSuff(str, i + 1);
        }
        for (int i=0; i<lps.length;i++){
            System.out.print(lps[i]+" ");
        }
    }

    private static int longPropPrefSuff(String str, int n) {
        for (int len = n - 1; len > 0; len--) {
            boolean flag = true;
            for (int i=0; i< len;i++){
                if(str.charAt(i) != str.charAt(n-len+i)){
                    flag=false;
                }
            }
            if (flag==true)
                return len;
        }
        return 0;
    }
}
