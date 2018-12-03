package practice.java.basic;

import java.util.Stack;

public class stringFuntionsPractice {
    
    public char convertTheValue(char a){
        char b = 0;
switch (a) {
    case ('{'):
        b='}';
        break;
    case ('('):
        b=')';
    break;
    case ('['):
        b=']';
    break;

}
return b;
}

    public static void main(String[] args) {
        stringFuntionsPractice s= new stringFuntionsPractice();
        
        String d= "{}{[][]()}" ;
        boolean flag =true;
        char[] a= d.toCharArray();
        
        System.out.println(a.length);
        
        if ((a.length)%2 !=0 ) {
           System.out.println("the string is not balanced");
           flag = false;
           System.out.println("the Array is not balanced");
        }
        Stack s1= new Stack();
        
        for (int i = 0; i < a.length; i++) {
           if ((a[i]=='{') || (a[i]=='[')|| (a[i])=='(') {
               
               s1.push(a[i]);
                           
           }
           else if ((a[i]=='}') || (a[i]==']')|| (a[i])==')') {
               if (s1.size()>0) {
                   
               
                   char out1= (char) s1.pop();
                   char expOpt=s.convertTheValue(out1);
                   if (expOpt!=a[i]) {
                       System.out.println("the string is imbalanced");
                       break;
                       
                   }   
               }
               
           if (i==(a.length-1)){
                   if (s1.isEmpty()) 
                   System.out.println("String is balanced");
                   else 
                   System.out.println("the string is not balanced");
               }

               
           }
               
               
           }
           
        }
        
        
           
                   }
        
        
        
        
