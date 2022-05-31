package br.com.i2e.magento.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
	private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);
	
	private static ObjectMapper mapper = new ObjectMapper();
	private JsonUtils() {}
	
	public static String toJson( Object data ) throws JsonProcessingException {
		
		return mapper.writeValueAsString( data ); 
	}
	
	public static <T> T fromJson( String jsonMessage, Class<T> type ) {
		
		try {
			
			logger.debug( "Convertendo Json para {}: {}", type, jsonMessage );
			return mapper.readValue( jsonMessage, type );
		} catch ( JsonProcessingException e ) {
			
			logger.error( "Erro ao converter json to {}: {}", type, jsonMessage, e );
		}
		
		return null;
	}
}
