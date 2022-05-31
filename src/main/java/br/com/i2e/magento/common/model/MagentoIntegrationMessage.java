package br.com.i2e.magento.common.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.NonNull;
@Data
public class MagentoIntegrationMessage {
	public static final MagentoIntegrationMessage EMPTY_REQUEST = new MagentoIntegrationMessage(MagentoIntegrationMessage.CATEGORIA.EMPTY);

	public enum CATEGORIA {
		CRIAR_PRODUTOS, DETALHE_PRODUTO, CLIENTE, FAMILIA, EMPTY;
	}
	public enum STATUS {
		PREPARADO, PRONTO, ERRO;
	}
	
	private String traceabilityCode;
	private @NonNull CATEGORIA categoria;
	private String tipo;
	private String codigo;
	private LocalDate dataDe;
	private LocalDate dataAte;
	private String info;
	private STATUS status; 
}
