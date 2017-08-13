package cn.itcast.money;

import java.util.HashMap;
import java.util.Map;


public class MoneyConvert {
	private Map<String, Map<String, Double>> MAP = new HashMap<String, Map<String, Double>>();

	 double getExchangeRate(String source, String dst) {
		 if(MAP.containsKey(source)) {
			 Map<String, Double> map = MAP.get(source);
			 if(map.containsKey(dst)) {
				 return map.get(dst);
			 } else {
				 double usd = map.get("USD");
				 return getCurrency(usd, "USD", dst);
			 }
		 }
		 
		 return -1;
	 }
	 
     double getCurrency(double amount, String source, String dst) {
    	 return amount * getExchangeRate(source, dst);
     }
     
     MoneyConvert() {
    	 Map<String, Double> RMB = new HashMap<String, Double>();
    	 RMB.put("USD", 0.14);
    	 RMB.put("EUR", 0.12);
    	 RMB.put("GBP", 0.11);
    	 MAP.put("RMB",  RMB);
    	 
    	 Map<String, Double> USD = new HashMap<String, Double>();
    	 USD.put("RMB", 6.7);
    	 USD.put("JPY", 110.67);
    	 USD.put("EUR", 0.84);
    	 USD.put("GBP", 0.76);
    	 MAP.put("USD",  USD);
    	 
    	 Map<String, Double> JPY = new HashMap<String, Double>();
    	 JPY.put("USD", 0.009);
    	 JPY.put("EUR", 0.007);
    	 JPY.put("GBP", 0.007);
    	 MAP.put("JPY",  JPY);
    	 
    	 Map<String, Double> EUR = new HashMap<String, Double>();
    	 EUR.put("RMB", 7.91);
    	 EUR.put("JPY", 130.26);
    	 EUR.put("USD", 1.17);
    	 EUR.put("GBP", 0.9);
    	 MAP.put("EUR",  EUR);
    	 
    	 Map<String, Double> GBP = new HashMap<String, Double>();
    	 GBP.put("RMB", 8.76);
    	 GBP.put("JPY", 144.25);
    	 GBP.put("EUR", 1.1);
    	 GBP.put("USD", 1.3);
    	 MAP.put("GBP",  GBP);
    	 
     }
}
