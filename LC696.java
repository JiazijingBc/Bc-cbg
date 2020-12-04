public class LC696 {
    public int countBinarySubstrings(String s) {
        if(s.length()==0){
            return 0;
        }
        int count = 0;
        for (int i=0;i<s.length()-1;i++){
            int p = i;
            int j = i+1;
            if (s.charAt(p)!=s.charAt(j)){
                count += 1;
                if(p >= 1 && j < (s.length() -1) ){
                    while (s.charAt(p-1) == s.charAt(p) && s.charAt(j) == s.charAt(j+1)){
                        p -= 1;
                        j += 1;
                        count += 1;
                        if(p < 1 || j >= (s.length() -1) ){
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }

    public int countBinarySubstrings2(String s) {
        int count = 0;
        for (int i=0;i<s.length()-1;i++){

        }





        return count;
    }



    public static void main(String[] args) {
        LC696 lc696 = new LC696();
        System.out.println(lc696.countBinarySubstrings("000111000"));
    }
}
