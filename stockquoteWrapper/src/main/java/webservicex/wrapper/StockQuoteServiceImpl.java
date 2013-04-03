package webservicex.wrapper;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.webservicex.StockQuote;

public class StockQuoteServiceImpl implements StockQuoteService {
	private final static Log log = LogFactory.getLog(StockQuoteServiceImpl.class);
	private String wsdlLocation = "http://www.webservicex.net/stockquote.asmx?WSDL";
	
	public String getQuote(String symbol) {
		URL url;
		try {
			url = new URL(wsdlLocation);
			StockQuote stockQuote = new StockQuote(url);
			return stockQuote.getStockQuoteSoap12().getQuote(symbol);
		
		} catch (MalformedURLException e) {
			log.error("error calling the service: " + e.getMessage());
		}
		
		
		return null;
	}

}
