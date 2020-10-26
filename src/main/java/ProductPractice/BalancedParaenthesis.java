package ProductPractice;

import java.util.Stack;

public class BalancedParaenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String exp ="({})";
		
		boolean b = isBalancedParenthesis(exp);
		
		System.out.println(b);
			}
	
	public static boolean isBalancedParenthesis(String exp)
	{
		
        Stack<Character> stk = new Stack<Character>();
		
		for(int i=0;i<exp.length();i++)
		{
			char x = exp.charAt(i);
			
			 if(x =='(' || x=='{' || x=='[' )
			 {
				 stk.push(x);
				 continue;
			 }
			 
			 if(stk.isEmpty())
			 return false;
			 
			 switch(x)
			 {
			 
			 case ')':
				 stk.pop();
				 if(x=='}' || x==']')
				 {
					 return false;
				 }
				 break;
				 
			 case '}':
				 stk.pop();
				 if(x==')'|| x==']')
					 return false;
				  break;
				 
			 case ']':
				 stk.pop();
				 if(x==')' || x=='}')
					 return false;
				  break;
			 
			 }
		}
				
		return (stk.isEmpty());
	}

}
