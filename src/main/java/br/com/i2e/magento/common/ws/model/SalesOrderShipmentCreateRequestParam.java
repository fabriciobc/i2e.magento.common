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
 *         &lt;element name="orderIncrementId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemsQty" type="{urn:Magento}orderItemIdQtyArray"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="includeComment" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "orderIncrementId",
    "itemsQty",
    "comment",
    "email",
    "includeComment"
})
@XmlRootElement(name = "salesOrderShipmentCreateRequestParam")
public class SalesOrderShipmentCreateRequestParam {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String orderIncrementId;
    @XmlElement(required = true)
    protected OrderItemIdQtyArray itemsQty;
    protected String comment;
    protected int email;
    protected int includeComment;

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
     * Obtém o valor da propriedade orderIncrementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIncrementId() {
        return orderIncrementId;
    }

    /**
     * Define o valor da propriedade orderIncrementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIncrementId(String value) {
        this.orderIncrementId = value;
    }

    /**
     * Obtém o valor da propriedade itemsQty.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemIdQtyArray }
     *     
     */
    public OrderItemIdQtyArray getItemsQty() {
        return itemsQty;
    }

    /**
     * Define o valor da propriedade itemsQty.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemIdQtyArray }
     *     
     */
    public void setItemsQty(OrderItemIdQtyArray value) {
        this.itemsQty = value;
    }

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     */
    public int getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     */
    public void setEmail(int value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade includeComment.
     * 
     */
    public int getIncludeComment() {
        return includeComment;
    }

    /**
     * Define o valor da propriedade includeComment.
     * 
     */
    public void setIncludeComment(int value) {
        this.includeComment = value;
    }

}
