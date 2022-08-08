package com.dsa.string;

public class RabinKarp {

    static final int d = 256;
    static final int q = 101;

    static void RbSearch(String pat, String txt, int M, int N) {

        //Compute p and t
        int patHash = 0, textHash = 0;
        for (int i = 0; i < M; i++) {
            patHash += (pat.charAt(i) * Math.pow(d, M - i - 1));
            textHash += (txt.charAt(i) * Math.pow(d, M - i - 1));
        }
        patHash = patHash % q;
        textHash = textHash % q;
        for (int i = 0; i <= (N - M); i++) {
            //Check for hit
            if (patHash == textHash) {
                boolean flag = true;
                for (int j = 0; j < M; j++)
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                if (flag == true) System.out.print(i + " ");
            }
            //Compute ti+1 using t
            if (i < N - M) {
//                textHash = 0;
//                for (int j = 0; j < M; j++) {
//                    textHash += (txt.charAt(j) * Math.pow(d, M - j - 1));
//                }
//                textHash = textHash % q;
//                if (textHash < 0) textHash = textHash + q;

//                //(pat.charAt(i) * Math.pow(d, M - i - 1)) % q
                int prev = ((txt.charAt(i) * (int) Math.pow(d, M - 1)) % q);
                textHash = ((d * (textHash - prev) + txt.charAt(i + M)) % q);
                if (textHash < 0) textHash = textHash + q;
            }
        }
    }


    static void RBSearch(String pat, String txt, int M, int N) {

        //Compute (d^(M-1))%q
        int h = 1;
        for (int i = 1; i <= M - 1; i++)
            h = (h * d) % q;

        //Compute p and t
        int p = 0, t = 0;
        // for next time d will add as d2 and d3
        for (int i = 0; i < M; i++) {
            p = (p * d + pat.charAt(i)) % q;
            p += (pat.charAt(i) * Math.pow(d, M - i - 1));
            t += (txt.charAt(i) * Math.pow(d, M - i - 1));
        }
        p = p % q;
        t = t % q;

        for (int i = 0; i <= (N - M); i++) {
            //Check for hit
            if (p == t) {
                boolean flag = true;
                for (int j = 0; j < M; j++)
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                if (flag == true) System.out.print(i + " ");
            }
//            //Compute ti+1 using ti
//
            if (i < N - M) {
                t = ((d * (t - txt.charAt(i) * h)) + txt.charAt(i + M)) % q;
                if (t < 0) t = t + q;
            }
        }

    }

    public static void main(String args[]) {
        String txt = "batmanandrobinarebat";
        String pat = "bat";
        System.out.print("All index numbers where pattern found: ");
        System.out.println();
        RBSearch(pat, txt, pat.length(), txt.length());
         RbSearch(pat, txt, pat.length(), txt.length());
    }
}

// Time Complexity
// Best/avg Case - O(n+m)
//Worst case     - O(n*m)