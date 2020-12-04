public class Offer05 {
    public String replaceSpace(String s) {
        char[] array = new char[s.length() * 3];
        int flag = 0;
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ' '){
                array[flag++] = '%';
                array[flag++] = '2';
                array[flag++] = '0';
            }else {
                array[flag++] = c;
            }
        }
        String s1 = new String(array, 0, flag);
        return s1;
    }
}
