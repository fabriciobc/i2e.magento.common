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
 * <p>Classe Java de salesOrderInvoiceEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salesOrderInvoiceEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="global_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_to_base_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_to_order_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_to_global_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_to_order_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_grand_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_address_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grand_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoice_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{urn:Magento}salesOrderInvoiceItemEntityArray" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{urn:Magento}salesOrderInvoiceCommentEntityArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderInvoiceEntity", propOrder = {
    "incrementId",
    "parentId",
    "storeId",
    "createdAt",
    "updatedAt",
    "isActive",
    "globalCurrencyCode",
    "baseCurrencyCode",
    "storeCurrencyCode",
    "orderCurrencyCode",
    "storeToBaseRate",
    "storeToOrderRate",
    "baseToGlobalRate",
    "baseToOrderRate",
    "subtotal",
    "baseSubtotal",
    "baseGrandTotal",
    "discountAmount",
    "baseDiscountAmount",
    "shippingAmount",
    "baseShippingAmount",
    "taxAmount",
    "baseTaxAmount",
    "billingAddressId",
    "billingFirstname",
    "billingLastname",
    "orderId",
    "orderIncrementId",
    "orderCreatedAt",
    "state",
    "grandTotal",
    "invoiceId",
    "items",
    "comments"
})
public class SalesOrderInvoiceEntity {

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
    @XmlElement(name = "global_currency_code")
    protected String globalCurrencyCode;
    @XmlElement(name = "base_currency_code")
    protected String baseCurrencyCode;
    @XmlElement(name = "store_currency_code")
    protected String storeCurrencyCode;
    @XmlElement(name = "order_currency_code")
    protected String orderCurrencyCode;
    @XmlElement(name = "store_to_base_rate")
    protected String storeToBaseRate;
    @XmlElement(name = "store_to_order_rate")
    protected String storeToOrderRate;
    @XmlElement(name = "base_to_global_rate")
    protected String baseToGlobalRate;
    @XmlElement(name = "base_to_order_rate")
    protected String baseToOrderRate;
    protected String subtotal;
    @XmlElement(name = "base_subtotal")
    protected String baseSubtotal;
    @XmlElement(name = "base_grand_total")
    protected String baseGrandTotal;
    @XmlElement(name = "discount_amount")
    protected String discountAmount;
    @XmlElement(name = "base_discount_amount")
    protected String baseDiscountAmount;
    @XmlElement(name = "shipping_amount")
    protected String shippingAmount;
    @XmlElement(name = "base_shipping_amount")
    protected String baseShippingAmount;
    @XmlElement(name = "tax_amount")
    protected String taxAmount;
    @XmlElement(name = "base_tax_amount")
    protected String baseTaxAmount;
    @XmlElement(name = "billing_address_id")
    protected String billingAddressId;
    @XmlElement(name = "billing_firstname")
    protected String billingFirstname;
    @XmlElement(name = "billing_lastname")
    protected String billingLastname;
    @XmlElement(name = "order_id")
    protected String orderId;
    @XmlElement(name = "order_increment_id")
    protected String orderIncrementId;
    @XmlElement(name = "order_created_at")
    protected String orderCreatedAt;
    protected String state;
    @XmlElement(name = "grand_total")
    protected String grandTotal;
    @XmlElement(name = "invoice_id")
    protected String invoiceId;
    protected SalesOrderInvoiceItemEntityArray items;
    protected SalesOrderInvoiceCommentEntityArray comments;

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
     * Obtém o valor da propriedade globalCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCurrencyCode() {
        return globalCurrencyCode;
    }

    /**
     * Define o valor da propriedade globalCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCurrencyCode(String value) {
        this.globalCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade baseCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    /**
     * Define o valor da propriedade baseCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyCode(String value) {
        this.baseCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade storeCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    /**
     * Define o valor da propriedade storeCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCurrencyCode(String value) {
        this.storeCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade orderCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCurrencyCode() {
        return orderCurrencyCode;
    }

    /**
     * Define o valor da propriedade orderCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCurrencyCode(String value) {
        this.orderCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade storeToBaseRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreToBaseRate() {
        return storeToBaseRate;
    }

    /**
     * Define o valor da propriedade storeToBaseRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreToBaseRate(String value) {
        this.storeToBaseRate = value;
    }

    /**
     * Obtém o valor da propriedade storeToOrderRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreToOrderRate() {
        return storeToOrderRate;
    }

    /**
     * Define o valor da propriedade storeToOrderRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreToOrderRate(String value) {
        this.storeToOrderRate = value;
    }

    /**
     * Obtém o valor da propriedade baseToGlobalRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    /**
     * Define o valor da propriedade baseToGlobalRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseToGlobalRate(String value) {
        this.baseToGlobalRate = value;
    }

    /**
     * Obtém o valor da propriedade baseToOrderRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseToOrderRate() {
        return baseToOrderRate;
    }

    /**
     * Define o valor da propriedade baseToOrderRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseToOrderRate(String value) {
        this.baseToOrderRate = value;
    }

    /**
     * Obtém o valor da propriedade subtotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * Define o valor da propriedade subtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal(String value) {
        this.subtotal = value;
    }

    /**
     * Obtém o valor da propriedade baseSubtotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSubtotal() {
        return baseSubtotal;
    }

    /**
     * Define o valor da propriedade baseSubtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSubtotal(String value) {
        this.baseSubtotal = value;
    }

    /**
     * Obtém o valor da propriedade baseGrandTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseGrandTotal() {
        return baseGrandTotal;
    }

    /**
     * Define o valor da propriedade baseGrandTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseGrandTotal(String value) {
        this.baseGrandTotal = value;
    }

    /**
     * Obtém o valor da propriedade discountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define o valor da propriedade discountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    /**
     * Define o valor da propriedade baseDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDiscountAmount(String value) {
        this.baseDiscountAmount = value;
    }

    /**
     * Obtém o valor da propriedade shippingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Define o valor da propriedade shippingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAmount(String value) {
        this.shippingAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingAmount() {
        return baseShippingAmount;
    }

    /**
     * Define o valor da propriedade baseShippingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingAmount(String value) {
        this.baseShippingAmount = value;
    }

    /**
     * Obtém o valor da propriedade taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define o valor da propriedade taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTaxAmount() {
        return baseTaxAmount;
    }

    /**
     * Define o valor da propriedade baseTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTaxAmount(String value) {
        this.baseTaxAmount = value;
    }

    /**
     * Obtém o valor da propriedade billingAddressId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressId() {
        return billingAddressId;
    }

    /**
     * Define o valor da propriedade billingAddressId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressId(String value) {
        this.billingAddressId = value;
    }

    /**
     * Obtém o valor da propriedade billingFirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingFirstname() {
        return billingFirstname;
    }

    /**
     * Define o valor da propriedade billingFirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingFirstname(String value) {
        this.billingFirstname = value;
    }

    /**
     * Obtém o valor da propriedade billingLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingLastname() {
        return billingLastname;
    }

    /**
     * Define o valor da propriedade billingLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingLastname(String value) {
        this.billingLastname = value;
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
     * Obtém o valor da propriedade state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define o valor da propriedade state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtém o valor da propriedade grandTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandTotal() {
        return grandTotal;
    }

    /**
     * Define o valor da propriedade grandTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandTotal(String value) {
        this.grandTotal = value;
    }

    /**
     * Obtém o valor da propriedade invoiceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Define o valor da propriedade invoiceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceId(String value) {
        this.invoiceId = value;
    }

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderInvoiceItemEntityArray }
     *     
     */
    public SalesOrderInvoiceItemEntityArray getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderInvoiceItemEntityArray }
     *     
     */
    public void setItems(SalesOrderInvoiceItemEntityArray value) {
        this.items = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderInvoiceCommentEntityArray }
     *     
     */
    public SalesOrderInvoiceCommentEntityArray getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderInvoiceCommentEntityArray }
     *     
     */
    public void setComments(SalesOrderInvoiceCommentEntityArray value) {
        this.comments = value;
    }

}
