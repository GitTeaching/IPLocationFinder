package org.soa.ws.client;

public class RandomClient {

	public static void main(String[] args) {
		
		RandomImplService service = new RandomImplService();
		Random stub = service.getRandomImplPort();
		
		double[] tab = new double[5];            
		double som = 0;

		for(int i=0; i<5; i++) {
			tab[i]= stub.getRandomValue();
			if(tab[i]>=0.5)
				som = som + stub.getSinusValue(tab[i]);
		}
		
		System.out.println(som);
	}

}
