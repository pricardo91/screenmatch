package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {

	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public <T> T obterDados(String json, Class<T> classeGenerica) {

		try {
			return mapper.readValue(json, classeGenerica);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
}
