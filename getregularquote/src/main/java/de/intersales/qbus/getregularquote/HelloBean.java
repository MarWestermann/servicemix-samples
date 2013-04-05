package de.intersales.qbus.getregularquote;

import webservicex.wrapper.StockQuoteService;


/**
 * A bean which we use in the route
 */
public class HelloBean {

	StockQuoteService service = null;
	
   public String getActualQuote() {
	   return service.getQuote("AMZ");
   }

public StockQuoteService getService() {
	return service;
}

public void setService(StockQuoteService service) {
	this.service = service;
}

   
}
