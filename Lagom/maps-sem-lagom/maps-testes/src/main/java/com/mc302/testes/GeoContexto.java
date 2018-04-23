package com.mc302.testes;

import com.google.maps.GeoApiContext;

/**
 * Esta classe armazena o GeoApiContext, que sera o mesmo em todo o programa
 * @author ra167906
 *
 */
public class GeoContexto {
	private final static GeoApiContext contexto = new GeoApiContext.Builder().apiKey("AIzaSyAsLL3K5BJeSTpx75RTegyE9jMShGSGpgw").build();

	public static GeoApiContext getContexto() {
		return contexto;
	}
}
