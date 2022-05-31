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
 * <p>Classe Java de shoppingCartInfoEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="shoppingCartInfoEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="store_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="converted_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quote_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="is_virtual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="is_multi_shipping" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="items_count" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="items_qty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="orig_order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_to_base_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_to_quote_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quote_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grand_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_grand_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkout_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_tax_class_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_group_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="customer_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_note_notify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_is_guest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applied_rule_ids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reserved_order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password_hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coupon_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="global_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_to_global_rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_to_quote_rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="customer_taxvat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="subtotal_with_discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal_with_discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ext_shipping_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_balance_amount_used" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_customer_balance_amount_used" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="use_customer_balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_cards_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_gift_cards_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_cards_amount_used" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="use_reward_points" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_points_balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_reward_currency_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_currency_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_address" type="{urn:Magento}shoppingCartAddressEntity" minOccurs="0"/&gt;
 *         &lt;element name="billing_address" type="{urn:Magento}shoppingCartAddressEntity" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{urn:Magento}shoppingCartItemEntityArray" minOccurs="0"/&gt;
 *         &lt;element name="payment" type="{urn:Magento}shoppingCartPaymentEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shoppingCartInfoEntity", propOrder = {
    "storeId",
    "createdAt",
    "updatedAt",
    "convertedAt",
    "quoteId",
    "isActive",
    "isVirtual",
    "isMultiShipping",
    "itemsCount",
    "itemsQty",
    "origOrderId",
    "storeToBaseRate",
    "storeToQuoteRate",
    "baseCurrencyCode",
    "storeCurrencyCode",
    "quoteCurrencyCode",
    "grandTotal",
    "baseGrandTotal",
    "checkoutMethod",
    "customerId",
    "customerTaxClassId",
    "customerGroupId",
    "customerEmail",
    "customerPrefix",
    "customerFirstname",
    "customerMiddlename",
    "customerLastname",
    "customerSuffix",
    "customerNote",
    "customerNoteNotify",
    "customerIsGuest",
    "appliedRuleIds",
    "reservedOrderId",
    "passwordHash",
    "couponCode",
    "globalCurrencyCode",
    "baseToGlobalRate",
    "baseToQuoteRate",
    "customerTaxvat",
    "customerGender",
    "subtotal",
    "baseSubtotal",
    "subtotalWithDiscount",
    "baseSubtotalWithDiscount",
    "extShippingInfo",
    "giftMessageId",
    "giftMessage",
    "customerBalanceAmountUsed",
    "baseCustomerBalanceAmountUsed",
    "useCustomerBalance",
    "giftCardsAmount",
    "baseGiftCardsAmount",
    "giftCardsAmountUsed",
    "useRewardPoints",
    "rewardPointsBalance",
    "baseRewardCurrencyAmount",
    "rewardCurrencyAmount",
    "shippingAddress",
    "billingAddress",
    "items",
    "payment"
})
public class ShoppingCartInfoEntity {

    @XmlElement(name = "store_id")
    protected String storeId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    @XmlElement(name = "converted_at")
    protected String convertedAt;
    @XmlElement(name = "quote_id")
    protected Integer quoteId;
    @XmlElement(name = "is_active")
    protected Integer isActive;
    @XmlElement(name = "is_virtual")
    protected Integer isVirtual;
    @XmlElement(name = "is_multi_shipping")
    protected Integer isMultiShipping;
    @XmlElement(name = "items_count")
    protected Double itemsCount;
    @XmlElement(name = "items_qty")
    protected Double itemsQty;
    @XmlElement(name = "orig_order_id")
    protected String origOrderId;
    @XmlElement(name = "store_to_base_rate")
    protected String storeToBaseRate;
    @XmlElement(name = "store_to_quote_rate")
    protected String storeToQuoteRate;
    @XmlElement(name = "base_currency_code")
    protected String baseCurrencyCode;
    @XmlElement(name = "store_currency_code")
    protected String storeCurrencyCode;
    @XmlElement(name = "quote_currency_code")
    protected String quoteCurrencyCode;
    @XmlElement(name = "grand_total")
    protected String grandTotal;
    @XmlElement(name = "base_grand_total")
    protected String baseGrandTotal;
    @XmlElement(name = "checkout_method")
    protected String checkoutMethod;
    @XmlElement(name = "customer_id")
    protected String customerId;
    @XmlElement(name = "customer_tax_class_id")
    protected String customerTaxClassId;
    @XmlElement(name = "customer_group_id")
    protected Integer customerGroupId;
    @XmlElement(name = "customer_email")
    protected String customerEmail;
    @XmlElement(name = "customer_prefix")
    protected String customerPrefix;
    @XmlElement(name = "customer_firstname")
    protected String customerFirstname;
    @XmlElement(name = "customer_middlename")
    protected String customerMiddlename;
    @XmlElement(name = "customer_lastname")
    protected String customerLastname;
    @XmlElement(name = "customer_suffix")
    protected String customerSuffix;
    @XmlElement(name = "customer_note")
    protected String customerNote;
    @XmlElement(name = "customer_note_notify")
    protected String customerNoteNotify;
    @XmlElement(name = "customer_is_guest")
    protected String customerIsGuest;
    @XmlElement(name = "applied_rule_ids")
    protected String appliedRuleIds;
    @XmlElement(name = "reserved_order_id")
    protected String reservedOrderId;
    @XmlElement(name = "password_hash")
    protected String passwordHash;
    @XmlElement(name = "coupon_code")
    protected String couponCode;
    @XmlElement(name = "global_currency_code")
    protected String globalCurrencyCode;
    @XmlElement(name = "base_to_global_rate")
    protected Double baseToGlobalRate;
    @XmlElement(name = "base_to_quote_rate")
    protected Double baseToQuoteRate;
    @XmlElement(name = "customer_taxvat")
    protected String customerTaxvat;
    @XmlElement(name = "customer_gender")
    protected String customerGender;
    protected Double subtotal;
    @XmlElement(name = "base_subtotal")
    protected Double baseSubtotal;
    @XmlElement(name = "subtotal_with_discount")
    protected Double subtotalWithDiscount;
    @XmlElement(name = "base_subtotal_with_discount")
    protected Double baseSubtotalWithDiscount;
    @XmlElement(name = "ext_shipping_info")
    protected String extShippingInfo;
    @XmlElement(name = "gift_message_id")
    protected String giftMessageId;
    @XmlElement(name = "gift_message")
    protected String giftMessage;
    @XmlElement(name = "customer_balance_amount_used")
    protected Double customerBalanceAmountUsed;
    @XmlElement(name = "base_customer_balance_amount_used")
    protected Double baseCustomerBalanceAmountUsed;
    @XmlElement(name = "use_customer_balance")
    protected String useCustomerBalance;
    @XmlElement(name = "gift_cards_amount")
    protected String giftCardsAmount;
    @XmlElement(name = "base_gift_cards_amount")
    protected String baseGiftCardsAmount;
    @XmlElement(name = "gift_cards_amount_used")
    protected String giftCardsAmountUsed;
    @XmlElement(name = "use_reward_points")
    protected String useRewardPoints;
    @XmlElement(name = "reward_points_balance")
    protected String rewardPointsBalance;
    @XmlElement(name = "base_reward_currency_amount")
    protected String baseRewardCurrencyAmount;
    @XmlElement(name = "reward_currency_amount")
    protected String rewardCurrencyAmount;
    @XmlElement(name = "shipping_address")
    protected ShoppingCartAddressEntity shippingAddress;
    @XmlElement(name = "billing_address")
    protected ShoppingCartAddressEntity billingAddress;
    protected ShoppingCartItemEntityArray items;
    protected ShoppingCartPaymentEntity payment;

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
     * Obtém o valor da propriedade convertedAt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertedAt() {
        return convertedAt;
    }

    /**
     * Define o valor da propriedade convertedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertedAt(String value) {
        this.convertedAt = value;
    }

    /**
     * Obtém o valor da propriedade quoteId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuoteId() {
        return quoteId;
    }

    /**
     * Define o valor da propriedade quoteId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuoteId(Integer value) {
        this.quoteId = value;
    }

    /**
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsActive(Integer value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade isVirtual.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsVirtual() {
        return isVirtual;
    }

    /**
     * Define o valor da propriedade isVirtual.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsVirtual(Integer value) {
        this.isVirtual = value;
    }

    /**
     * Obtém o valor da propriedade isMultiShipping.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsMultiShipping() {
        return isMultiShipping;
    }

    /**
     * Define o valor da propriedade isMultiShipping.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsMultiShipping(Integer value) {
        this.isMultiShipping = value;
    }

    /**
     * Obtém o valor da propriedade itemsCount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getItemsCount() {
        return itemsCount;
    }

    /**
     * Define o valor da propriedade itemsCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setItemsCount(Double value) {
        this.itemsCount = value;
    }

    /**
     * Obtém o valor da propriedade itemsQty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getItemsQty() {
        return itemsQty;
    }

    /**
     * Define o valor da propriedade itemsQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setItemsQty(Double value) {
        this.itemsQty = value;
    }

    /**
     * Obtém o valor da propriedade origOrderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigOrderId() {
        return origOrderId;
    }

    /**
     * Define o valor da propriedade origOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigOrderId(String value) {
        this.origOrderId = value;
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
     * Obtém o valor da propriedade storeToQuoteRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreToQuoteRate() {
        return storeToQuoteRate;
    }

    /**
     * Define o valor da propriedade storeToQuoteRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreToQuoteRate(String value) {
        this.storeToQuoteRate = value;
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
     * Obtém o valor da propriedade quoteCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteCurrencyCode() {
        return quoteCurrencyCode;
    }

    /**
     * Define o valor da propriedade quoteCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteCurrencyCode(String value) {
        this.quoteCurrencyCode = value;
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
     * Obtém o valor da propriedade checkoutMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutMethod() {
        return checkoutMethod;
    }

    /**
     * Define o valor da propriedade checkoutMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutMethod(String value) {
        this.checkoutMethod = value;
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
     * Obtém o valor da propriedade customerTaxClassId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxClassId() {
        return customerTaxClassId;
    }

    /**
     * Define o valor da propriedade customerTaxClassId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxClassId(String value) {
        this.customerTaxClassId = value;
    }

    /**
     * Obtém o valor da propriedade customerGroupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    /**
     * Define o valor da propriedade customerGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerGroupId(Integer value) {
        this.customerGroupId = value;
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
     * Obtém o valor da propriedade customerPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPrefix() {
        return customerPrefix;
    }

    /**
     * Define o valor da propriedade customerPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPrefix(String value) {
        this.customerPrefix = value;
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
     * Obtém o valor da propriedade customerMiddlename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMiddlename() {
        return customerMiddlename;
    }

    /**
     * Define o valor da propriedade customerMiddlename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMiddlename(String value) {
        this.customerMiddlename = value;
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
     * Obtém o valor da propriedade customerSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSuffix() {
        return customerSuffix;
    }

    /**
     * Define o valor da propriedade customerSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSuffix(String value) {
        this.customerSuffix = value;
    }

    /**
     * Obtém o valor da propriedade customerNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNote() {
        return customerNote;
    }

    /**
     * Define o valor da propriedade customerNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNote(String value) {
        this.customerNote = value;
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
     * Obtém o valor da propriedade reservedOrderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedOrderId() {
        return reservedOrderId;
    }

    /**
     * Define o valor da propriedade reservedOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedOrderId(String value) {
        this.reservedOrderId = value;
    }

    /**
     * Obtém o valor da propriedade passwordHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Define o valor da propriedade passwordHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordHash(String value) {
        this.passwordHash = value;
    }

    /**
     * Obtém o valor da propriedade couponCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Define o valor da propriedade couponCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
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
     * Obtém o valor da propriedade baseToGlobalRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    /**
     * Define o valor da propriedade baseToGlobalRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseToGlobalRate(Double value) {
        this.baseToGlobalRate = value;
    }

    /**
     * Obtém o valor da propriedade baseToQuoteRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseToQuoteRate() {
        return baseToQuoteRate;
    }

    /**
     * Define o valor da propriedade baseToQuoteRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseToQuoteRate(Double value) {
        this.baseToQuoteRate = value;
    }

    /**
     * Obtém o valor da propriedade customerTaxvat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxvat() {
        return customerTaxvat;
    }

    /**
     * Define o valor da propriedade customerTaxvat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxvat(String value) {
        this.customerTaxvat = value;
    }

    /**
     * Obtém o valor da propriedade customerGender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGender() {
        return customerGender;
    }

    /**
     * Define o valor da propriedade customerGender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGender(String value) {
        this.customerGender = value;
    }

    /**
     * Obtém o valor da propriedade subtotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * Define o valor da propriedade subtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubtotal(Double value) {
        this.subtotal = value;
    }

    /**
     * Obtém o valor da propriedade baseSubtotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseSubtotal() {
        return baseSubtotal;
    }

    /**
     * Define o valor da propriedade baseSubtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseSubtotal(Double value) {
        this.baseSubtotal = value;
    }

    /**
     * Obtém o valor da propriedade subtotalWithDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubtotalWithDiscount() {
        return subtotalWithDiscount;
    }

    /**
     * Define o valor da propriedade subtotalWithDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubtotalWithDiscount(Double value) {
        this.subtotalWithDiscount = value;
    }

    /**
     * Obtém o valor da propriedade baseSubtotalWithDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseSubtotalWithDiscount() {
        return baseSubtotalWithDiscount;
    }

    /**
     * Define o valor da propriedade baseSubtotalWithDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseSubtotalWithDiscount(Double value) {
        this.baseSubtotalWithDiscount = value;
    }

    /**
     * Obtém o valor da propriedade extShippingInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtShippingInfo() {
        return extShippingInfo;
    }

    /**
     * Define o valor da propriedade extShippingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtShippingInfo(String value) {
        this.extShippingInfo = value;
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
     * Obtém o valor da propriedade customerBalanceAmountUsed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomerBalanceAmountUsed() {
        return customerBalanceAmountUsed;
    }

    /**
     * Define o valor da propriedade customerBalanceAmountUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomerBalanceAmountUsed(Double value) {
        this.customerBalanceAmountUsed = value;
    }

    /**
     * Obtém o valor da propriedade baseCustomerBalanceAmountUsed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseCustomerBalanceAmountUsed() {
        return baseCustomerBalanceAmountUsed;
    }

    /**
     * Define o valor da propriedade baseCustomerBalanceAmountUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseCustomerBalanceAmountUsed(Double value) {
        this.baseCustomerBalanceAmountUsed = value;
    }

    /**
     * Obtém o valor da propriedade useCustomerBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCustomerBalance() {
        return useCustomerBalance;
    }

    /**
     * Define o valor da propriedade useCustomerBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCustomerBalance(String value) {
        this.useCustomerBalance = value;
    }

    /**
     * Obtém o valor da propriedade giftCardsAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardsAmount() {
        return giftCardsAmount;
    }

    /**
     * Define o valor da propriedade giftCardsAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardsAmount(String value) {
        this.giftCardsAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseGiftCardsAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseGiftCardsAmount() {
        return baseGiftCardsAmount;
    }

    /**
     * Define o valor da propriedade baseGiftCardsAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseGiftCardsAmount(String value) {
        this.baseGiftCardsAmount = value;
    }

    /**
     * Obtém o valor da propriedade giftCardsAmountUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardsAmountUsed() {
        return giftCardsAmountUsed;
    }

    /**
     * Define o valor da propriedade giftCardsAmountUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardsAmountUsed(String value) {
        this.giftCardsAmountUsed = value;
    }

    /**
     * Obtém o valor da propriedade useRewardPoints.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseRewardPoints() {
        return useRewardPoints;
    }

    /**
     * Define o valor da propriedade useRewardPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseRewardPoints(String value) {
        this.useRewardPoints = value;
    }

    /**
     * Obtém o valor da propriedade rewardPointsBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardPointsBalance() {
        return rewardPointsBalance;
    }

    /**
     * Define o valor da propriedade rewardPointsBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardPointsBalance(String value) {
        this.rewardPointsBalance = value;
    }

    /**
     * Obtém o valor da propriedade baseRewardCurrencyAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRewardCurrencyAmount() {
        return baseRewardCurrencyAmount;
    }

    /**
     * Define o valor da propriedade baseRewardCurrencyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRewardCurrencyAmount(String value) {
        this.baseRewardCurrencyAmount = value;
    }

    /**
     * Obtém o valor da propriedade rewardCurrencyAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCurrencyAmount() {
        return rewardCurrencyAmount;
    }

    /**
     * Define o valor da propriedade rewardCurrencyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCurrencyAmount(String value) {
        this.rewardCurrencyAmount = value;
    }

    /**
     * Obtém o valor da propriedade shippingAddress.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartAddressEntity }
     *     
     */
    public ShoppingCartAddressEntity getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Define o valor da propriedade shippingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartAddressEntity }
     *     
     */
    public void setShippingAddress(ShoppingCartAddressEntity value) {
        this.shippingAddress = value;
    }

    /**
     * Obtém o valor da propriedade billingAddress.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartAddressEntity }
     *     
     */
    public ShoppingCartAddressEntity getBillingAddress() {
        return billingAddress;
    }

    /**
     * Define o valor da propriedade billingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartAddressEntity }
     *     
     */
    public void setBillingAddress(ShoppingCartAddressEntity value) {
        this.billingAddress = value;
    }

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartItemEntityArray }
     *     
     */
    public ShoppingCartItemEntityArray getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartItemEntityArray }
     *     
     */
    public void setItems(ShoppingCartItemEntityArray value) {
        this.items = value;
    }

    /**
     * Obtém o valor da propriedade payment.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCartPaymentEntity }
     *     
     */
    public ShoppingCartPaymentEntity getPayment() {
        return payment;
    }

    /**
     * Define o valor da propriedade payment.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCartPaymentEntity }
     *     
     */
    public void setPayment(ShoppingCartPaymentEntity value) {
        this.payment = value;
    }

}
