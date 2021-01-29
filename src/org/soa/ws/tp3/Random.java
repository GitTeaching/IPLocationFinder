package org.soa.ws.tp3;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Random {
	
	@WebMethod
	public double getRandomValue();
	
	@WebMethod
	public double getSinusValue(double val);

}
