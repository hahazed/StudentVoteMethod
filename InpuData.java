package ogr.oyj.com;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InpuData {
	 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));  
	 
     public int getInt(String msg,String err) {   	     	   	     	 
    	 int temp=0;
    	 boolean flag=true;   	 
    	 while(flag) {
    	 System.out.println(msg);
    	 String str="";
    	 try {   		    		
    		 str=this.buf.readLine();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }   	 
    	 if(str.matches("^\\d+$")) {
    		  temp=Integer.parseInt(str);
    		  flag=false;
    	 }else {	    		
    	      System.out.println(err);
    	 }
    	}
    	 return temp;
     }     
}
