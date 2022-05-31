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
 * <p>Classe Java de salesOrderEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salesOrderEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grand_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_paid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_qty_ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_online_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_offline_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_grand_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_paid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_qty_ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_online_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_offline_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_address_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_address_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_to_base_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_to_order_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_to_global_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_to_order_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remote_ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applied_rule_ids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="global_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quote_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_virtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_note_notify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_is_guest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email_sent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_address" type="{urn:Magento}salesOrderAddressEntity" minOccurs="0"/&gt;
 *         &lt;element name="billing_address" type="{urn:Magento}salesOrderAddressEntity" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{urn:Magento}salesOrderItemEntityArray" minOccurs="0"/&gt;
 *         &lt;element name="payment" type="{urn:Magento}salesOrderPaymentEntity" minOccurs="0"/&gt;
 *         &lt;element name="status_history" type="{urn:Magento}salesOrderStatusHistoryEntityArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderEntity", propOrder = {
    "incrementId",
    "parentId",
    "storeId",
    "createdAt",
    "updatedAt",
    "isActive",
    "customerId",
    "taxAmount",
    "shippingAmount",
    "discountAmount",
    "subtotal",
    "grandTotal",
    "totalPaid",
    "totalRefunded",
    "totalQtyOrdered",
    "totalCanceled",
    "totalInvoiced",
    "totalOnlineRefunded",
    "totalOfflineRefunded",
    "baseTaxAmount",
    "baseShippingAmount",
    "baseDiscountAmount",
    "baseSubtotal",
    "baseGrandTotal",
    "baseTotalPaid",
    "baseTotalRefunded",
    "baseTotalQtyOrdered",
    "baseTotalCanceled",
    "baseTotalInvoiced",
    "baseTotalOnlineRefunded",
    "baseTotalOfflineRefunded",
    "billingAddressId",
    "billingFirstname",
    "billingLastname",
    "shippingAddressId",
    "shippingFirstname",
    "shippingLastname",
    "billingName",
    "shippingName",
    "storeToBaseRate",
    "storeToOrderRate",
    "baseToGlobalRate",
    "baseToOrderRate",
    "weight",
    "storeName",
    "remoteIp",
    "status",
    "state",
    "appliedRuleIds",
    "globalCurrencyCode",
    "baseCurrencyCode",
    "storeCurrencyCode",
    "orderCurrencyCode",
    "shippingMethod",
    "shippingDescription",
    "customerEmail",
    "customerFirstname",
    "customerLastname",
    "quoteId",
    "isVirtual",
    "customerGroupId",
    "customerNoteNotify",
    "customerIsGuest",
    "emailSent",
    "orderId",
    "giftMessageId",
    "giftMessage",
    "shippingAddress",
    "billingAddress",
    "items",
    "payment",
    "statusHistory"
})
public class SalesOrderEntity {

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
    @XmlElement(name = "customer_id")
    protected String customerId;
    @XmlElement(name = "tax_amount")
    protected String taxAmount;
    @XmlElement(name = "shipping_amount")
    protected String shippingAmount;
    @XmlElement(name = "discount_amount")
    protected String discountAmount;
    protected String subtotal;
    @XmlElement(name = "grand_total")
    protected String grandTotal;
    @XmlElement(name = "total_paid")
    protected String totalPaid;
    @XmlElement(name = "total_refunded")
    protected String totalRefunded;
    @XmlElement(name = "total_qty_ordered")
    protected String totalQtyOrdered;
    @XmlElement(name = "total_canceled")
    protected String totalCanceled;
    @XmlElement(name = "total_invoiced")
    protected String totalInvoiced;
    @XmlElement(name = "total_online_refunded")
    protected String totalOnlineRefunded;
    @XmlElement(name = "total_offline_refunded")
    protected String totalOfflineRefunded;
    @XmlElement(name = "base_tax_amount")
    protected String baseTaxAmount;
    @XmlElement(name = "base_shipping_amount")
    protected String baseShippingAmount;
    @XmlElement(name = "base_discount_amount")
    protected String baseDiscountAmount;
    @XmlElement(name = "base_subtotal")
    protected String baseSubtotal;
    @XmlElement(name = "base_grand_total")
    protected String baseGrandTotal;
    @XmlElement(name = "base_total_paid")
    protected String baseTotalPaid;
    @XmlElement(name = "base_total_refunded")
    protected String baseTotalRefunded;
    @XmlElement(name = "base_total_qty_ordered")
    protected String baseTotalQtyOrdered;
    @XmlElement(name = "base_total_canceled")
    protected String baseTotalCanceled;
    @XmlElement(name = "base_total_invoiced")
    protected String baseTotalInvoiced;
    @XmlElement(name = "base_total_online_refunded")
    protected String baseTotalOnlineRefunded;
    @XmlElement(name = "base_total_offline_refunded")
    protected String baseTotalOfflineRefunded;
    @XmlElement(name = "billing_address_id")
    protected String billingAddressId;
    @XmlElement(name = "billing_firstname")
    protected String billingFirstname;
    @XmlElement(name = "billing_lastname")
    protected String billingLastname;
    @XmlElement(name = "shipping_address_id")
    protected String shippingAddressId;
    @XmlElement(name = "shipping_firstname")
    protected String shippingFirstname;
    @XmlElement(name = "shipping_lastname")
    protected String shippingLastname;
    @XmlElement(name = "billing_name")
    protected String billingName;
    @XmlElement(name = "shipping_name")
    protected String shippingName;
    @XmlElement(name = "store_to_base_rate")
    protected String storeToBaseRate;
    @XmlElement(name = "store_to_order_rate")
    protected String storeToOrderRate;
    @XmlElement(name = "base_to_global_rate")
    protected String baseToGlobalRate;
    @XmlElement(name = "base_to_order_rate")
    protected String baseToOrderRate;
    protected String weight;
    @XmlElement(name = "store_name")
    protected String storeName;
    @XmlElement(name = "remote_ip")
    protected String remoteIp;
    protected String status;
    protected String state;
    @XmlElement(name = "applied_rule_ids")
    protected String appliedRuleIds;
    @XmlElement(name = "global_currency_code")
    protected String globalCurrencyCode;
    @XmlElement(name = "base_currency_code")
    protected String baseCurrencyCode;
    @XmlElement(name = "store_currency_code")
    protected String storeCurrencyCode;
    @XmlElement(name = "order_currency_code")
    protected String orderCurrencyCode;
    @XmlElement(name = "shipping_method")
    protected String shippingMethod;
    @XmlElement(name = "shipping_description")
    protected String shippingDescription;
    @XmlElement(name = "customer_email")
    protected String customerEmail;
    @XmlElement(name = "customer_firstname")
    protected String customerFirstname;
    @XmlElement(name = "customer_lastname")
    protected String customerLastname;
    @XmlElement(name = "quote_id")
    protected String quoteId;
    @XmlElement(name = "is_virtual")
    protected String isVirtual;
    @XmlElement(name = "customer_group_id")
    protected String customerGroupId;
    @XmlElement(name = "customer_note_notify")
    protected String customerNoteNotify;
    @XmlElement(name = "customer_is_guest")
    protected String customerIsGuest;
    @XmlElement(name = "email_sent")
    protected String emailSent;
    @XmlElement(name = "order_id")
    protected String orderId;
    @XmlElement(name = "gift_message_id")
    protected String giftMessageId;
    @XmlElement(name = "gift_message")
    protected String giftMessage;
    @XmlElement(name = "shipping_address")
    protected SalesOrderAddressEntity shippingAddress;
    @XmlElement(name = "billing_address")
    protected SalesOrderAddressEntity billingAddress;
    protected SalesOrderItemEntityArray items;
    protected SalesOrderPaymentEntity payment;
    @XmlElement(name = "status_history")
    protected SalesOrderStatusHistoryEntityArray statusHistory;

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
     * Obtém o valor da propriedade customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define o valor da propriedade customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
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
     * Obtém o valor da propriedade totalPaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPaid() {
        return totalPaid;
    }

    /**
     * Define o valor da propriedade totalPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPaid(String value) {
        this.totalPaid = value;
    }

    /**
     * Obtém o valor da propriedade totalRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRefunded() {
        return totalRefunded;
    }

    /**
     * Define o valor da propriedade totalRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRefunded(String value) {
        this.totalRefunded = value;
    }

    /**
     * Obtém o valor da propriedade totalQtyOrdered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalQtyOrdered() {
        return totalQtyOrdered;
    }

    /**
     * Define o valor da propriedade totalQtyOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalQtyOrdered(String value) {
        this.totalQtyOrdered = value;
    }

    /**
     * Obtém o valor da propriedade totalCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCanceled() {
        return totalCanceled;
    }

    /**
     * Define o valor da propriedade totalCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCanceled(String value) {
        this.totalCanceled = value;
    }

    /**
     * Obtém o valor da propriedade totalInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalInvoiced() {
        return totalInvoiced;
    }

    /**
     * Define o valor da propriedade totalInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalInvoiced(String value) {
        this.totalInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade totalOnlineRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOnlineRefunded() {
        return totalOnlineRefunded;
    }

    /**
     * Define o valor da propriedade totalOnlineRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOnlineRefunded(String value) {
        this.totalOnlineRefunded = value;
    }

    /**
     * Obtém o valor da propriedade totalOfflineRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOfflineRefunded() {
        return totalOfflineRefunded;
    }

    /**
     * Define o valor da propriedade totalOfflineRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOfflineRefunded(String value) {
        this.totalOfflineRefunded = value;
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
     * Obtém o valor da propriedade baseTotalPaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalPaid() {
        return baseTotalPaid;
    }

    /**
     * Define o valor da propriedade baseTotalPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalPaid(String value) {
        this.baseTotalPaid = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalRefunded() {
        return baseTotalRefunded;
    }

    /**
     * Define o valor da propriedade baseTotalRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalRefunded(String value) {
        this.baseTotalRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalQtyOrdered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalQtyOrdered() {
        return baseTotalQtyOrdered;
    }

    /**
     * Define o valor da propriedade baseTotalQtyOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalQtyOrdered(String value) {
        this.baseTotalQtyOrdered = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalCanceled() {
        return baseTotalCanceled;
    }

    /**
     * Define o valor da propriedade baseTotalCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalCanceled(String value) {
        this.baseTotalCanceled = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalInvoiced() {
        return baseTotalInvoiced;
    }

    /**
     * Define o valor da propriedade baseTotalInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalInvoiced(String value) {
        this.baseTotalInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalOnlineRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalOnlineRefunded() {
        return baseTotalOnlineRefunded;
    }

    /**
     * Define o valor da propriedade baseTotalOnlineRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalOnlineRefunded(String value) {
        this.baseTotalOnlineRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalOfflineRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalOfflineRefunded() {
        return baseTotalOfflineRefunded;
    }

    /**
     * Define o valor da propriedade baseTotalOfflineRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalOfflineRefunded(String value) {
        this.baseTotalOfflineRefunded = value;
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
     * Obtém o valor da propriedade billingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingName() {
        return billingName;
    }

    /**
     * Define o valor da propriedade billingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingName(String value) {
        this.billingName = value;
    }

    /**
     * Obtém o valor da propriedade shippingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * Define o valor da propriedade shippingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingName(String value) {
        this.shippingName = value;
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
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Obtém o valor da propriedade storeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Define o valor da propriedade storeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Obtém o valor da propriedade remoteIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIp() {
        return remoteIp;
    }

    /**
     * Define o valor da propriedade remoteIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIp(String value) {
        this.remoteIp = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Obtém o valor da propriedade appliedRuleIds.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedRuleIds() {
        return appliedRuleIds;
    }

    /**
     * Define o valor da propriedade appliedRuleIds.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedRuleIds(String value) {
        this.appliedRuleIds = value;
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
     * Obtém o valor da propriedade shippingMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Define o valor da propriedade shippingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Obtém o valor da propriedade shippingDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDescription() {
        return shippingDescription;
    }

    /**
     * Define o valor da propriedade shippingDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDescription(String value) {
        this.shippingDescription = value;
    }

    /**
     * Obtém o valor da propriedade customerEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Define o valor da propriedade customerEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Obtém o valor da propriedade customerFirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstname() {
        return customerFirstname;
    }

    /**
     * Define o valor da propriedade customerFirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstname(String value) {
        this.customerFirstname = value;
    }

    /**
     * Obtém o valor da propriedade customerLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastname() {
        return customerLastname;
    }

    /**
     * Define o valor da propriedade customerLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastname(String value) {
        this.customerLastname = value;
    }

    /**
     * Obtém o valor da propriedade quoteId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId() {
        return quoteId;
    }

    /**
     * Define o valor da propriedade quoteId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId(String value) {
        this.quoteId = value;
    }

    /**
     * Obtém o valor da propriedade isVirtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVirtual() {
        return isVirtual;
    }

    /**
     * Define o valor da propriedade isVirtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVirtual(String value) {
        this.isVirtual = value;
    }

    /**
     * Obtém o valor da propriedade customerGroupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGroupId() {
        return customerGroupId;
    }

    /**
     * Define o valor da propriedade customerGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGroupId(String value) {
        this.customerGroupId = value;
    }

    /**
     * Obtém o valor da propriedade customerNoteNotify.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNoteNotify() {
        return customerNoteNotify;
    }

    /**
     * Define o valor da propriedade customerNoteNotify.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNoteNotify(String value) {
        this.customerNoteNotify = value;
    }

    /**
     * Obtém o valor da propriedade customerIsGuest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIsGuest() {
        return customerIsGuest;
    }

    /**
     * Define o valor da propriedade customerIsGuest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIsGuest(String value) {
        this.customerIsGuest = value;
    }

    /**
     * Obtém o valor da propriedade emailSent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSent() {
        return emailSent;
    }

    /**
     * Define o valor da propriedade emailSent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSent(String value) {
        this.emailSent = value;
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
     * Obtém o valor da propriedade giftMessageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessageId() {
        return giftMessageId;
    }

    /**
     * Define o valor da propriedade giftMessageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftMessageId(String value) {
        this.giftMessageId = value;
    }

    /**
     * Obtém o valor da propriedade giftMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * Define o valor da propriedade giftMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftMessage(String value) {
        this.giftMessage = value;
    }

    /**
     * Obtém o valor da propriedade shippingAddress.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderAddressEntity }
     *     
     */
    public SalesOrderAddressEntity getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Define o valor da propriedade shippingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderAddressEntity }
     *     
     */
    public void setShippingAddress(SalesOrderAddressEntity value) {
        this.shippingAddress = value;
    }

    /**
     * Obtém o valor da propriedade billingAddress.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderAddressEntity }
     *     
     */
    public SalesOrderAddressEntity getBillingAddress() {
        return billingAddress;
    }

    /**
     * Define o valor da propriedade billingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderAddressEntity }
     *     
     */
    public void setBillingAddress(SalesOrderAddressEntity value) {
        this.billingAddress = value;
    }

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderItemEntityArray }
     *     
     */
    public SalesOrderItemEntityArray getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderItemEntityArray }
     *     
     */
    public void setItems(SalesOrderItemEntityArray value) {
        this.items = value;
    }

    /**
     * Obtém o valor da propriedade payment.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderPaymentEntity }
     *     
     */
    public SalesOrderPaymentEntity getPayment() {
        return payment;
    }

    /**
     * Define o valor da propriedade payment.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderPaymentEntity }
     *     
     */
    public void setPayment(SalesOrderPaymentEntity value) {
        this.payment = value;
    }

    /**
     * Obtém o valor da propriedade statusHistory.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderStatusHistoryEntityArray }
     *     
     */
    public SalesOrderStatusHistoryEntityArray getStatusHistory() {
        return statusHistory;
    }

    /**
     * Define o valor da propriedade statusHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderStatusHistoryEntityArray }
     *     
     */
    public void setStatusHistory(SalesOrderStatusHistoryEntityArray value) {
        this.statusHistory = value;
    }

}
