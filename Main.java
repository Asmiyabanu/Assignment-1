import java.util.*;
public class Main
{
	 public static boolean isValid(String s) {
        Stack<Integer> stack = new Stack<>();        
        String open = "({[";
        String close = ")}]";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (open.contains(c + "")) {
                int id = open.indexOf(c);
                stack.push(id);
            } 
            else {
                int id = close.indexOf(c);
                if (stack.isEmpty() || id != stack.pop()) return false; 
            }
        }
        return stack.isEmpty();
    }
	
  public static void main(String[] args) {
      String s = "([])";
      boolean check = isValid(s);
          if(check){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
  }
}