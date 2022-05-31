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
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="categoryData" type="{urn:Magento}catalogCategoryEntityCreate"/&gt;
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
    "parentId",
    "categoryData",
    "store"
})
@XmlRootElement(name = "catalogCategoryCreateRequestParam")
public class CatalogCategoryCreateRequestParam {

    @XmlElement(required = true)
    protected String sessionId;
    protected int parentId;
    @XmlElement(required = true)
    protected CatalogCategoryEntityCreate categoryData;
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
     * Obtém o valor da propriedade parentId.
     * 
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * Define o valor da propriedade parentId.
     * 
     */
    public void setParentId(int value) {
        this.parentId = value;
    }

    /**
     * Obtém o valor da propriedade categoryData.
     * 
     * @return
     *     possible object is
     *     {@link CatalogCategoryEntityCreate }
     *     
     */
    public CatalogCategoryEntityCreate getCategoryData() {
        return categoryData;
    }

    /**
     * Define o valor da propriedade categoryData.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogCategoryEntityCreate }
     *     
     */
    public void setCategoryData(CatalogCategoryEntityCreate value) {
        this.categoryData = value;
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
