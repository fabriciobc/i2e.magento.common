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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de salesOrderShipmentEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salesOrderShipmentEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_address_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{urn:Magento}salesOrderShipmentItemEntityArray" minOccurs="0"/&gt;
 *         &lt;element name="tracks" type="{urn:Magento}salesOrderShipmentTrackEntityArray" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{urn:Magento}salesOrderShipmentCommentEntityArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderShipmentEntity", propOrder = {
    "incrementId",
    "parentId",
    "storeId",
    "createdAt",
    "updatedAt",
    "isActive",
    "shippingAddressId",
    "shippingFirstname",
    "shippingLastname",
    "orderId",
    "orderIncrementId",
    "orderCreatedAt",
    "totalQty",
    "shipmentId",
    "items",
    "tracks",
    "comments"
})
public class SalesOrderShipmentEntity {

    @XmlElement(name = "increment_id")
    protected String incrementId;
    @XmlElement(name = "parent_id")
    protected String parentId;
    @XmlElement(name = "store_id")
    protected String storeId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    @XmlElement(name = "is_active")
    protected String isActive;
    @XmlElement(name = "shipping_address_id")
    protected String shippingAddressId;
    @XmlElement(name = "shipping_firstname")
    protected String shippingFirstname;
    @XmlElement(name = "shipping_lastname")
    protected String shippingLastname;
    @XmlElement(name = "order_id")
    protected String orderId;
    @XmlElement(name = "order_increment_id")
    protected String orderIncrementId;
    @XmlElement(name = "order_created_at")
    protected String orderCreatedAt;
    @XmlElement(name = "total_qty")
    protected String totalQty;
    @XmlElement(name = "shipment_id")
    protected String shipmentId;
    protected SalesOrderShipmentItemEntityArray items;
    protected SalesOrderShipmentTrackEntityArray tracks;
    protected SalesOrderShipmentCommentEntityArray comments;

    /**
     * Obtém o valor da propriedade incrementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementId() {
        return incrementId;
    }

    /**
     * Define o valor da propriedade incrementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementId(String value) {
        this.incrementId = value;
    }

    /**
     * Obtém o valor da propriedade parentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Define o valor da propriedade parentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Obtém o valor da propriedade storeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Define o valor da propriedade storeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreId(String value) {
        this.storeId = value;
    }

    /**
     * Obtém o valor da propriedade createdAt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Define o valor da propriedade createdAt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    /**
     * Obtém o valor da propriedade updatedAt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Define o valor da propriedade updatedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedAt(String value) {
        this.updatedAt = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade shippingAddressId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressId() {
        return shippingAddressId;
    }

    /**
     * Define o valor da propriedade shippingAddressId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressId(String value) {
        this.shippingAddressId = value;
    }

    /**
     * Obtém o valor da propriedade shippingFirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingFirstname() {
        return shippingFirstname;
    }

    /**
     * Define o valor da propriedade shippingFirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingFirstname(String value) {
        this.shippingFirstname = value;
    }

    /**
     * Obtém o valor da propriedade shippingLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingLastname() {
        return shippingLastname;
    }

    /**
     * Define o valor da propriedade shippingLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingLastname(String value) {
        this.shippingLastname = value;
    }

    /**
     * Obtém o valor da propriedade orderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Define o valor da propriedade orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
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
     * Obtém o valor da propriedade orderCreatedAt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCreatedAt() {
        return orderCreatedAt;
    }

    /**
     * Define o valor da propriedade orderCreatedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCreatedAt(String value) {
        this.orderCreatedAt = value;
    }

    /**
     * Obtém o valor da propriedade totalQty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalQty() {
        return totalQty;
    }

    /**
     * Define o valor da propriedade totalQty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalQty(String value) {
        this.totalQty = value;
    }

    /**
     * Obtém o valor da propriedade shipmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Define o valor da propriedade shipmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentId(String value) {
        this.shipmentId = value;
    }

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderShipmentItemEntityArray }
     *     
     */
    public SalesOrderShipmentItemEntityArray getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderShipmentItemEntityArray }
     *     
     */
    public void setItems(SalesOrderShipmentItemEntityArray value) {
        this.items = value;
    }

    /**
     * Obtém o valor da propriedade tracks.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderShipmentTrackEntityArray }
     *     
     */
    public SalesOrderShipmentTrackEntityArray getTracks() {
        return tracks;
    }

    /**
     * Define o valor da propriedade tracks.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderShipmentTrackEntityArray }
     *     
     */
    public void setTracks(SalesOrderShipmentTrackEntityArray value) {
        this.tracks = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderShipmentCommentEntityArray }
     *     
     */
    public SalesOrderShipmentCommentEntityArray getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderShipmentCommentEntityArray }
     *     
     */
    public void setComments(SalesOrderShipmentCommentEntityArray value) {
        this.comments = value;
    }

}
