package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryMethod {
	private static final Logger LOGGER = LogManager.getLogger(FactoryMethod. class);
	public static Payment getPlan(String planType){  

      if(planType.equalsIgnoreCase("standard")) {  
             return new StandardMaterial();  
           }   
       else if(planType.equalsIgnoreCase("Abovestandard")){  
            return new AboveStandardMaterial();  
        }   
      else if(planType.equalsIgnoreCase("Highstandard")) {  
            return new HighstandardMaterial();  
      }
      else if(planType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new HighstandardFullautomaticMaterial();
      }
  return null;  
}  
}