
package clever.teens;

import java.io.*;
import java.util.Scanner;
public  class CleverTeens {
    static int G(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum+=((i+1)*a[i]);
        return sum;
    }


static private final String INPUT = "func.in";  
static private final String OUTPUT = "tandard output";
    
    public static void main(String[] args) {
     FileInputStream instream = null;  
     PrintStream outstream = null; 
       int cLine=0;
       int arr[]={0},T,max=0;
     try {  
          instream = new FileInputStream(INPUT);  
          outstream = new PrintStream(new FileOutputStream(OUTPUT));  
          System.setIn(instream);  
          System.setOut(outstream);  
      } catch (Exception e) {  
          System.err.println("Error Occurred.");  
      }
     Scanner in = new Scanner(System.in);  
      for (;in.hasNext();) {  
          if(cLine==0){
             T=Integer.parseInt( in.nextLine()); 
             cLine++;
          }
           else{
             int N=Integer.parseInt( in.nextLine());
             arr=new int[N];  
             
             for(int i=0;i<N;i++)
                 arr[i]= in.nextInt();
             cLine+=2;
               
           max=G(arr);
          for(int i=0;i< N;i++)
          {
              int temp;
              for(int j=i;j<N;j++)
              {
                  temp=arr[i];
                  arr[i]=arr[j];
                   arr[j]=temp;
                   int now=G(arr);
                   if(now>max)
                       max=now;
              }
          }
          }
      }  
      System.out.println(max);
      System.err.println("done.");
    }
    
    
}
