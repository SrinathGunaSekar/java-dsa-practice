package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedParentheses {
	public static void main(String[] args) {
		String s = "{([])}";
		if(solve(s)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
	
//	public static boolean solve(String s) {
//		Stack<Character> stack = new Stack<Character>();
//		for(char c: s.toCharArray()) {
//			if(c == '{' || c== '(' || c == '[') {
//				stack.push(c);
//			}else {
//				if(stack.isEmpty()) {
//					return false;
//				}
//					char top = stack.pop();
//					if(c == '}' && top!='{' ||
//					   c == ']' && top!='[' ||
//					   c==  ')' && top!='(') {
//						return false;
//				}
//				
//			}
//		}
//		return stack.isEmpty();
//	}
	
	public static boolean solve(String s) {
		List<Character> list  = new ArrayList<Character>();
		for(char c : s.toCharArray()) {
			if(c == '{' || c=='(' || c == '[') {
				list.add(c);
			}else {
				char top = list.get(list.size()-1);
				if(list.isEmpty()) {
					return false;
				}
				if(c=='}' && top!='{' ||
				   c==']' && top!= '['||
				   c==')' && top!= '(' ) {
					return false;
				}
				
				list.remove(list.size()-1);
					
			}
		}
		return list.isEmpty();
	}
}
