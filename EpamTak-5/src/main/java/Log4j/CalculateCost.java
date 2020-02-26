package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CalculateCost {
	private static final Logger LOGGER = LogManager . getLogger(CalculateCost. class);
	public double Cost(String name,double Sqrfoot)
	{
		FactoryMethod planFactory = new FactoryMethod();
		Payment p = FactoryMethod.getPlan(name);  
		p.getRate();
		double d=p.calculateBill(Sqrfoot);
		LOGGER . debug("THE COST IS :"+d );
		return d;
	}

}