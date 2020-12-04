import java.util.*;

public class LC20 {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Deque<Character> stack = new LinkedList<>();
        if(s.length()%2==1){
            return false;
        }
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if(stack.isEmpty()){
                    return false;
                }
                else if(map.get(c)!=stack.pop()){
                    return false;
                }
            }
            else {
                stack.push(c);
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LC20 lc20 = new LC20();
        System.out.println(lc20.isValid("(("));
    }
}
