package Strings;

public class PatternSearching {
    // d is the number of characters in
    // the input alphabet
    public final  static int d = 256;

    public static void RabinKarpAlgorithm(String pat, String txt, int q){
        int m = pat.length();
        int n = txt.length();
        int i, j;
        int p =0; // hash value for pattern
        int t = 0; // hash value for text
        int h = 1;

        // The value of h would be "pow(d,m-1)%q
        for(i = 0; i< m-1; i++){
            h = (h*d)%q;
        }

        //Calculate the hash value of pattern and
        //first window of text
        for(i = 0; i < m; i++){
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }

        //Slide the pattern over the text one by one

        for(i=0; i<= n-m; i++){
            //check the hash values of current window of text and pattern
            // If the hash value matches then only check for characters one by one

            if(p == t){
                //check for characters one by one
                for(j = 0; j< m; j++){
                    if(txt.charAt(i+j) != pat.charAt(j)){
                        break;
                    }
                }

                if(j == m){
                    System.out.println(i);
                }
            }

            //Calculate hash value of next window of text
            //Remove leading digit, and trailing digit
            if( i < n-m){
                t = (d*(t-txt.charAt(i)*h) + txt.charAt(i+m))%q;

                //We might get negative value of t, converting it
                //to positive
                if(t < 0){
                    t =(t + q);
                }
            }
        }

    }
}
