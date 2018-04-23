package com.mc302.testes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.errors.ApiException;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsRoute;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.TravelMode;

/**
 * Esta classe armazena informacoes referentes a direcoes
 * de um ponto a outro.
 * Nela eh armazenado um vetor de rotas, mas pode-se entender como uma rota apenas,
 * ja que no momento ela nao trabalha com rotas alternativas.
 * @author Bruno Arnoni Falkenburg
 *
 */
public class Direcoes {
	private DirectionsApiRequest pedido;

	private final GeoApiContext context;
	
	private String origem;
	private String destino;
	private DirectionsResult resultado;
	private DirectionsRoute[] rotas;
	
	/* bloco com os construtores */
	public Direcoes(GeoApiContext context){
		this.context = context;
		origem = "VAZIO";
		destino = "VAZIO";
		rotas = null;
		pedido = null;
		resultado = null;
	}
	
	public Direcoes(GeoApiContext context, String origem, String destino){
		this.context = context;
		this.origem = origem;
		this.destino = destino;
		rotas = null;
		resultado = null;
		pedido = null;
	}
	
	/**
	 * Este metodo calcula uma rota entre dois locais.
	 * @throws ApiException
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void calcularRotas() throws ApiException, InterruptedException, IOException{
	
		pedido = DirectionsApi.getDirections(context, origem, destino)
				.alternatives(false) //caso seja interessante armazenar rotas alternativas, altere este valor para true
				.destination(destino)
				.origin(origem)
				.mode(TravelMode.DRIVING); //apesar se der o modo padrao, acho interessante explicitar
		resultado = pedido.await();
	}
	
	/**
	 * Este metodo transforma as etapas para chegar de um ponto a outro para
	 * o formato json 
	 * @return - uma String formatada como json
	 */
	public String jsonEtapas(){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(resultado.routes[0].legs);
	}

	/* bloco de gets e sets */
	public DirectionsApiRequest getPedido() {
		return pedido;
	}

	public void setPedido(DirectionsApiRequest pedido) {
		this.pedido = pedido;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public DirectionsResult getResultado() {
		return resultado;
	}

	public void setResultado(DirectionsResult resultado) {
		this.resultado = resultado;
	}

	public DirectionsRoute[] getRotas() {
		return rotas;
	}

	public void setRotas(DirectionsRoute[] rotas) {
		this.rotas = rotas;
	}

	public GeoApiContext getContext() {
		return context;
	}

}
