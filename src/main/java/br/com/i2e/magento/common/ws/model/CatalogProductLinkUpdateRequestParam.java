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
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="linkedProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="data" type="{urn:Magento}catalogProductLinkEntity" minOccurs="0"/&gt;
 *         &lt;element name="identifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "type",
    "productId",
    "linkedProductId",
    "data",
    "identifierType"
})
@XmlRootElement(name = "catalogProductLinkUpdateRequestParam")
public class CatalogProductLinkUpdateRequestParam {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String productId;
    @XmlElement(required = true)
    protected String linkedProductId;
    protected CatalogProductLinkEntity data;
    protected String identifierType;

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
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade productId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define o valor da propriedade productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Obtém o valor da propriedade linkedProductId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedProductId() {
        return linkedProductId;
    }

    /**
     * Define o valor da propriedade linkedProductId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedProductId(String value) {
        this.linkedProductId = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link CatalogProductLinkEntity }
     *     
     */
    public CatalogProductLinkEntity getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogProductLinkEntity }
     *     
     */
    public void setData(CatalogProductLinkEntity value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade identifierType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierType() {
        return identifierType;
    }

    /**
     * Define o valor da propriedade identifierType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierType(String value) {
        this.identifierType = value;
    }

}
