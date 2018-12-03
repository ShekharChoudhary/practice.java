package practice.java.basic;
public class AlphabeticalSorting {
    
    public int comp (String s, String s1){
        int len1=s.length();
        int len2 = s1.length();
        int min=0;
        char a1[]=s.toCharArray();
        char a2[]=s1.toCharArray();
        
        if (len1>len2) {
        min=len2;
        }
        else
           min=len1;
        
        for (int i = 0; i < min; i++) {
               int c1 = a1[i];
               int c2 = a2[i];
               if (c1!=c2) {
                   return c1-c2;
                       }
               
           }
        return 0;
        }
        
    public static void main(String[] args) {
        
        
        String names[]={"rahul","arpit","jasmine","sunaina","bipul"};
        
        
        AlphabeticalSorting alpha = new AlphabeticalSorting();
        String temp="";
        
        
        for (int j = 0; j < names.length-1; j++){
               for (int i = 0; i < names.length-1; i++) {
                   String s=names[i];
                   String s1=names[i+1];
                   
                   if (alpha.comp(s,s1)>0) {
                               
                       temp=names[i]; //temp is a String that was declared earlier
                       names[i]=names[i+1];
                       names[i+1]=temp;
                       }
                       
               }
        
        }
        
        
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }
        
        
        
        
        
        
        
               
        
        
        
        
        
    }

}

