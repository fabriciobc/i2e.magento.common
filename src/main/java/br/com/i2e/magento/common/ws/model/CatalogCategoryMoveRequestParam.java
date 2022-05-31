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
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="afterId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "categoryId",
    "parentId",
    "afterId"
})
@XmlRootElement(name = "catalogCategoryMoveRequestParam")
public class CatalogCategoryMoveRequestParam {

    @XmlElement(required = true)
    protected String sessionId;
    protected int categoryId;
    protected int parentId;
    @XmlElement(required = true)
    protected String afterId;

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
     * Obtém o valor da propriedade categoryId.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Define o valor da propriedade categoryId.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
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
     * Obtém o valor da propriedade afterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterId() {
        return afterId;
    }

    /**
     * Define o valor da propriedade afterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterId(String value) {
        this.afterId = value;
    }

}
