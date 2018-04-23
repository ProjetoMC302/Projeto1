package com.mc302.testes;

import java.io.IOException;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;

public class TestesRotas 
{
    public static void main( String[] args ) throws ApiException, InterruptedException, IOException
    {
    	GeoApiContext 	context = GeoContexto.getContexto();
    	
    	Direcoes direcoes1 = new Direcoes(context, "75 9th Ave, New York, NY", "MetLife Stadium Dr East Rutherford, NJ 07073");
    	direcoes1.calcularRotas();
    	System.out.println("Rotas de 75 9th Ave, New York, NY"
    			+ "para MetLife Stadium Dr East Rutherford, NJ 07073");
    	System.out.println(direcoes1.jsonEtapas());
    	
    	Direcoes direcoes2 = new Direcoes(context, "Av. Dr. Romeu Tórtima, 1500 - Cidade Universitária, Campinas - SP",
    										"R. Dr. Pereira Lima, 85 - Vila Industrial, Campinas - SP");
    	direcoes2.calcularRotas();
    	System.out.println("Rotas do Bardana para a Rodoviaria de Campinas");
    	System.out.println(direcoes2.jsonEtapas());
        
    }
}
