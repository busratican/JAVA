
public class TrianglePrinting {
       public static void main(String[] args){
    	     
    	   char asteriks='*';
    	   int counter=1;
    	   int star=1;
    	   
    	   
       for(counter=1; counter<=9; counter++){
    		    for(star=1; star<=counter; star++){
    		   
    			   System.out.print(asteriks);
    			   
    			   if(counter== star)
    				   System.out.println();
    			
    		   }
    	   }
    	   
    	   
    	   System.out.print("\t\t");
    	  
    	   int counter1=9;
    	   int star1=9;
    	   
       
       
       
	   for(counter1=9; counter1>=1; counter1--){
		    for(star1=9; counter1>=star1; star1--){
		   
			   System.out.print(asteriks);
			   
			   if(counter1== star1)
				   System.out.println();
			
		   }
	   }
	  
	   
	   }
       }

    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       

