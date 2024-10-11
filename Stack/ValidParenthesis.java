package Stack;

import java.util.Stack;

// All possible cases :
/*
 Case 1: First element is '(' or '{' or '[' (push in stack)
 Case 2: First element is ')' or '}' or ']' (i.e if stack is emepty after case 1 then return false)
 case 3: If top element is '(' but current element is not ')' or top element is '{' but current element is not '}' 
 or top element is '[' but current element is not ']' then return false; and pop the remaining elements in the stack
 */
public class ValidParenthesis {
    public static void main(String[] args) {
        String s="({{()}}){}({})";
        System.out.println("Valid Parenthesis: "+validPara(s));
    }
    public static boolean  validPara(String s){
        char [] ch=s.toCharArray();
        Stack<Character> stk =new Stack<>();
        for(char c:ch){
            if(c=='('||c=='{'||c=='['){
                stk.push(c);
            }//if stack is empty after the above condition that means the first char is not the opening paranthesis
            else if(stk.empty()){
                return false;
            }
            else if((stk.peek()=='('&&c!=')')||
                    (stk.peek()=='{'&&c!='}')||
                    (stk.peek()=='['&&c!=']')){
                return false;
            }
            else{
                stk.pop();
            }
        }
        return stk.empty();
    }
}
