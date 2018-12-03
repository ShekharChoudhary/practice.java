package practice.java.basic;
public class Assignment2_String {

    public static void main(String[] args) {
           String x= "rahulnavgire";
           char a[] =x.toCharArray();
           char b[]=new char[a.length];
           int count=0;
           int counter =-1;
           boolean flag= true;
           
           for (int k = 0; k < a.length; k++) {
               flag=true;
               for (int l = 0; l < counter; l++) {
                   if (a[k]==b[l] ) {
                       flag=false;
                       break;
                   }
                   }
               
               if (flag) {
                   counter=counter+1;
                   b[counter]=a[k];
                   
               }
           
           }
        
           String x1= new String(b);
            System.out.println(x1.trim());
           

           char[] c = (x1.trim()).toCharArray();
           
           
           
           for (int i = 0; i < c.length; i++) {
               for (int j = 0; j < a.length; j++) {
                   if (c[i]==a[j]) {
                       count= count+1;
                   }
           
               }
               
               System.out.println(c[i]+" is repeated "+count+" times");
               count =0;
               
           }
           
           
        
        
        
    }

}
