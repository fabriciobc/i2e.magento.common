//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.08 às 08:24:17 PM BRT 
//


package br.com.i2e.magento.common.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quoteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="productsData" type="{urn:Magento}shoppingCartProductEntityArray"/&gt;
 *         &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "quoteId",
    "productsData",
    "store"
})
@XmlRootElement(name = "shoppingCartProductRemoveRequestParam")
public class ShoppingCartProductRemoveRequestParam {

    @XmlElement(required = true)
    protected String sessionId;
    protected int quoteId;
    @XmlElement(required = true)
    protected ShoppingCartProductEntityArray productsData;
    protected String store;

    /**
     * Obtém o valor da propriedade sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Define o valor da propriedade sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Obtém o valor da propriedade quoteId.
     * 
     */
    public int getQuoteId() {
        return quoteId;
    }

    /**
     * Define o valor da propriedade quoteId.
     * 
     */
    public void setQuoteId(int value) {
        this.quoteId = value;
    }

    /**
     * Obtém o valor da propriedade productsData.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartProductEntityArray }
     *     
     */
    public ShoppingCartProductEntityArray getProductsData() {
        return productsData;
    }

    /**
     * Define o valor da propriedade productsData.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartProductEntityArray }
     *     
     */
    public void setProductsData(ShoppingCartProductEntityArray value) {
        this.productsData = value;
    }

    /**
     * Obtém o valor da propriedade store.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStore() {
        return store;
    }

    /**
     * Define o valor da propriedade store.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStore(String value) {
        this.store = value;
    }

}