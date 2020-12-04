import java.util.LinkedList;
import java.util.Stack;

public class LC844 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)!='#'){
                stack1.push(S.charAt(i));
            }else if(S.charAt(i) == '#' && stack1.size()!=0){
                stack1.pop();
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if(T.charAt(i)!='#'){
                stack2.push(T.charAt(i));
            }else if(T.charAt(i) == '#' && stack2.size()!=0){
                stack2.pop();
            }
        }
        if(stack1.size()!=stack2.size()){
            return false;
        }else {
            while (stack1.size()!=0){
                if (stack1.pop() != stack2.pop()){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "b";
        LC844 lc844 = new LC844();
        System.out.println(lc844.backspaceCompare(s,t));
    }
}
