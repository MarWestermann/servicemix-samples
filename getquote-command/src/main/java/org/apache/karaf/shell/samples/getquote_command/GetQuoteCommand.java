package org.apache.karaf.shell.samples.getquote_command;

import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import webservicex.wrapper.StockQuoteService;
import webservicex.wrapper.StockQuoteServiceImpl;

@Command(scope = "test", name = "hello", description="Says hello")
public class GetQuoteCommand extends OsgiCommandSupport {
	
	StockQuoteService service = null;
	
    @Override
    protected Object doExecute() throws Exception {
        
    	
    	if (service == null) {
    		service = new StockQuoteServiceImpl();
    	}
    
    	System.out.println("executing.. answer: " + service.getQuote("AMZ"));
    		
        
        return null;
    }

	public StockQuoteService getService() {
		return service;
	}

	public void setService(StockQuoteService service) {
		this.service = service;
	}

}
