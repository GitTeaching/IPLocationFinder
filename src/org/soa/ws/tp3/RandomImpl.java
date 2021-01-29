package org.soa.ws.tp3;

import javax.jws.WebService;

@WebService(endpointInterface="org.soa.ws.tp3.Random")
public class RandomImpl implements Random{

	@Override
	public double getRandomValue() {
		return Math.random();
	}

	@Override
	public double getSinusValue(double val) {
		return Math.sin(val);
	}

}
