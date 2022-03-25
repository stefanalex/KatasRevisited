package com.warpit.arraystack.reversestream;



public class ReverseString{
	
	

	
	String reverseString(String input){
	     StringBuffer reverse = new StringBuffer();
		 
        
		 if(input!=null){
			 int inputSize=input.length();
		     for(int i=1;i<inputSize+1;i++){
		    	 reverse.append(input.charAt(inputSize-i));
		    	
			 }
	     }
		 
		 return reverse.toString();
	}
	
	
	
	

}
