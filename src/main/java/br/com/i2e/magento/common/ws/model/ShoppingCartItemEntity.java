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
 * <p>Classe Java de shoppingCartItemEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="shoppingCartItemEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent_item_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_virtual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applied_rule_ids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additional_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="free_shipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_qty_decimal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="no_discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="custom_price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="discount_percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="discount_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tax_percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tax_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="row_total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_row_total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="row_total_with_discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="row_weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="product_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_before_discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tax_before_discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="original_custom_price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="price_incl_tax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_price_incl_tax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="row_total_incl_tax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_row_total_incl_tax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="gift_message_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message_available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied_row_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_applied_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_applied_row_amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_disposition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_row_disposition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_disposition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_row_disposition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tax_class_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shoppingCartItemEntity", propOrder = {
    "itemId",
    "createdAt",
    "updatedAt",
    "productId",
    "storeId",
    "parentItemId",
    "isVirtual",
    "sku",
    "name",
    "description",
    "appliedRuleIds",
    "additionalData",
    "freeShipping",
    "isQtyDecimal",
    "noDiscount",
    "weight",
    "qty",
    "price",
    "basePrice",
    "customPrice",
    "discountPercent",
    "discountAmount",
    "baseDiscountAmount",
    "taxPercent",
    "taxAmount",
    "baseTaxAmount",
    "rowTotal",
    "baseRowTotal",
    "rowTotalWithDiscount",
    "rowWeight",
    "productType",
    "baseTaxBeforeDiscount",
    "taxBeforeDiscount",
    "originalCustomPrice",
    "baseCost",
    "priceInclTax",
    "basePriceInclTax",
    "rowTotalInclTax",
    "baseRowTotalInclTax",
    "giftMessageId",
    "giftMessage",
    "giftMessageAvailable",
    "weeeTaxApplied",
    "weeeTaxAppliedAmount",
    "weeeTaxAppliedRowAmount",
    "baseWeeeTaxAppliedAmount",
    "baseWeeeTaxAppliedRowAmount",
    "weeeTaxDisposition",
    "weeeTaxRowDisposition",
    "baseWeeeTaxDisposition",
    "baseWeeeTaxRowDisposition",
    "taxClassId"
})
public class ShoppingCartItemEntity {

    @XmlElement(name = "item_id")
    protected String itemId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    @XmlElement(name = "product_id")
    protected String productId;
    @XmlElement(name = "store_id")
    protected String storeId;
    @XmlElement(name = "parent_item_id")
    protected String parentItemId;
    @XmlElement(name = "is_virtual")
    protected Integer isVirtual;
    protected String sku;
    protected String name;
    protected String description;
    @XmlElement(name = "applied_rule_ids")
    protected String appliedRuleIds;
    @XmlElement(name = "additional_data")
    protected String additionalData;
    @XmlElement(name = "free_shipping")
    protected String freeShipping;
    @XmlElement(name = "is_qty_decimal")
    protected String isQtyDecimal;
    @XmlElement(name = "no_discount")
    protected String noDiscount;
    protected Double weight;
    protected Double qty;
    protected Double price;
    @XmlElement(name = "base_price")
    protected Double basePrice;
    @XmlElement(name = "custom_price")
    protected Double customPrice;
    @XmlElement(name = "discount_percent")
    protected Double discountPercent;
    @XmlElement(name = "discount_amount")
    protected Double discountAmount;
    @XmlElement(name = "base_discount_amount")
    protected Double baseDiscountAmount;
    @XmlElement(name = "tax_percent")
    protected Double taxPercent;
    @XmlElement(name = "tax_amount")
    protected Double taxAmount;
    @XmlElement(name = "base_tax_amount")
    protected Double baseTaxAmount;
    @XmlElement(name = "row_total")
    protected Double rowTotal;
    @XmlElement(name = "base_row_total")
    protected Double baseRowTotal;
    @XmlElement(name = "row_total_with_discount")
    protected Double rowTotalWithDiscount;
    @XmlElement(name = "row_weight")
    protected Double rowWeight;
    @XmlElement(name = "product_type")
    protected String productType;
    @XmlElement(name = "base_tax_before_discount")
    protected Double baseTaxBeforeDiscount;
    @XmlElement(name = "tax_before_discount")
    protected Double taxBeforeDiscount;
    @XmlElement(name = "original_custom_price")
    protected Double originalCustomPrice;
    @XmlElement(name = "base_cost")
    protected Double baseCost;
    @XmlElement(name = "price_incl_tax")
    protected Double priceInclTax;
    @XmlElement(name = "base_price_incl_tax")
    protected Double basePriceInclTax;
    @XmlElement(name = "row_total_incl_tax")
    protected Double rowTotalInclTax;
    @XmlElement(name = "base_row_total_incl_tax")
    protected Double baseRowTotalInclTax;
    @XmlElement(name = "gift_message_id")
    protected String giftMessageId;
    @XmlElement(name = "gift_message")
    protected String giftMessage;
    @XmlElement(name = "gift_message_available")
    protected String giftMessageAvailable;
    @XmlElement(name = "weee_tax_applied")
    protected Double weeeTaxApplied;
    @XmlElement(name = "weee_tax_applied_amount")
    protected Double weeeTaxAppliedAmount;
    @XmlElement(name = "weee_tax_applied_row_amount")
    protected Double weeeTaxAppliedRowAmount;
    @XmlElement(name = "base_weee_tax_applied_amount")
    protected Double baseWeeeTaxAppliedAmount;
    @XmlElement(name = "base_weee_tax_applied_row_amount")
    protected Double baseWeeeTaxAppliedRowAmount;
    @XmlElement(name = "weee_tax_disposition")
    protected Double weeeTaxDisposition;
    @XmlElement(name = "weee_tax_row_disposition")
    protected Double weeeTaxRowDisposition;
    @XmlElement(name = "base_weee_tax_disposition")
    protected Double baseWeeeTaxDisposition;
    @XmlElement(name = "base_weee_tax_row_disposition")
    protected Double baseWeeeTaxRowDisposition;
    @XmlElement(name = "tax_class_id")
    protected String taxClassId;

    /**
     * Obtém o valor da propriedade itemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Define o valor da propriedade itemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
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
     * Obtém o valor da propriedade parentItemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentItemId() {
        return parentItemId;
    }

    /**
     * Define o valor da propriedade parentItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentItemId(String value) {
        this.parentItemId = value;
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
     * Obtém o valor da propriedade sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Define o valor da propriedade sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Obtém o valor da propriedade additionalData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Define o valor da propriedade additionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

    /**
     * Obtém o valor da propriedade freeShipping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeShipping() {
        return freeShipping;
    }

    /**
     * Define o valor da propriedade freeShipping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeShipping(String value) {
        this.freeShipping = value;
    }

    /**
     * Obtém o valor da propriedade isQtyDecimal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsQtyDecimal() {
        return isQtyDecimal;
    }

    /**
     * Define o valor da propriedade isQtyDecimal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsQtyDecimal(String value) {
        this.isQtyDecimal = value;
    }

    /**
     * Obtém o valor da propriedade noDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoDiscount() {
        return noDiscount;
    }

    /**
     * Define o valor da propriedade noDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoDiscount(String value) {
        this.noDiscount = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Obtém o valor da propriedade qty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQty() {
        return qty;
    }

    /**
     * Define o valor da propriedade qty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQty(Double value) {
        this.qty = value;
    }

    /**
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade basePrice.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     * Define o valor da propriedade basePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBasePrice(Double value) {
        this.basePrice = value;
    }

    /**
     * Obtém o valor da propriedade customPrice.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomPrice() {
        return customPrice;
    }

    /**
     * Define o valor da propriedade customPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomPrice(Double value) {
        this.customPrice = value;
    }

    /**
     * Obtém o valor da propriedade discountPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Define o valor da propriedade discountPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountPercent(Double value) {
        this.discountPercent = value;
    }

    /**
     * Obtém o valor da propriedade discountAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define o valor da propriedade discountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountAmount(Double value) {
        this.discountAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    /**
     * Define o valor da propriedade baseDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseDiscountAmount(Double value) {
        this.baseDiscountAmount = value;
    }

    /**
     * Obtém o valor da propriedade taxPercent.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxPercent() {
        return taxPercent;
    }

    /**
     * Define o valor da propriedade taxPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxPercent(Double value) {
        this.taxPercent = value;
    }

    /**
     * Obtém o valor da propriedade taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define o valor da propriedade taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxAmount(Double value) {
        this.taxAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseTaxAmount() {
        return baseTaxAmount;
    }

    /**
     * Define o valor da propriedade baseTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseTaxAmount(Double value) {
        this.baseTaxAmount = value;
    }

    /**
     * Obtém o valor da propriedade rowTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRowTotal() {
        return rowTotal;
    }

    /**
     * Define o valor da propriedade rowTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRowTotal(Double value) {
        this.rowTotal = value;
    }

    /**
     * Obtém o valor da propriedade baseRowTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseRowTotal() {
        return baseRowTotal;
    }

    /**
     * Define o valor da propriedade baseRowTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseRowTotal(Double value) {
        this.baseRowTotal = value;
    }

    /**
     * Obtém o valor da propriedade rowTotalWithDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRowTotalWithDiscount() {
        return rowTotalWithDiscount;
    }

    /**
     * Define o valor da propriedade rowTotalWithDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRowTotalWithDiscount(Double value) {
        this.rowTotalWithDiscount = value;
    }

    /**
     * Obtém o valor da propriedade rowWeight.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRowWeight() {
        return rowWeight;
    }

    /**
     * Define o valor da propriedade rowWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRowWeight(Double value) {
        this.rowWeight = value;
    }

    /**
     * Obtém o valor da propriedade productType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Define o valor da propriedade productType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Obtém o valor da propriedade baseTaxBeforeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseTaxBeforeDiscount() {
        return baseTaxBeforeDiscount;
    }

    /**
     * Define o valor da propriedade baseTaxBeforeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseTaxBeforeDiscount(Double value) {
        this.baseTaxBeforeDiscount = value;
    }

    /**
     * Obtém o valor da propriedade taxBeforeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxBeforeDiscount() {
        return taxBeforeDiscount;
    }

    /**
     * Define o valor da propriedade taxBeforeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxBeforeDiscount(Double value) {
        this.taxBeforeDiscount = value;
    }

    /**
     * Obtém o valor da propriedade originalCustomPrice.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOriginalCustomPrice() {
        return originalCustomPrice;
    }

    /**
     * Define o valor da propriedade originalCustomPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOriginalCustomPrice(Double value) {
        this.originalCustomPrice = value;
    }

    /**
     * Obtém o valor da propriedade baseCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseCost() {
        return baseCost;
    }

    /**
     * Define o valor da propriedade baseCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseCost(Double value) {
        this.baseCost = value;
    }

    /**
     * Obtém o valor da propriedade priceInclTax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceInclTax() {
        return priceInclTax;
    }

    /**
     * Define o valor da propriedade priceInclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceInclTax(Double value) {
        this.priceInclTax = value;
    }

    /**
     * Obtém o valor da propriedade basePriceInclTax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBasePriceInclTax() {
        return basePriceInclTax;
    }

    /**
     * Define o valor da propriedade basePriceInclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBasePriceInclTax(Double value) {
        this.basePriceInclTax = value;
    }

    /**
     * Obtém o valor da propriedade rowTotalInclTax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRowTotalInclTax() {
        return rowTotalInclTax;
    }

    /**
     * Define o valor da propriedade rowTotalInclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRowTotalInclTax(Double value) {
        this.rowTotalInclTax = value;
    }

    /**
     * Obtém o valor da propriedade baseRowTotalInclTax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseRowTotalInclTax() {
        return baseRowTotalInclTax;
    }

    /**
     * Define o valor da propriedade baseRowTotalInclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseRowTotalInclTax(Double value) {
        this.baseRowTotalInclTax = value;
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
     * Obtém o valor da propriedade giftMessageAvailable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessageAvailable() {
        return giftMessageAvailable;
    }

    /**
     * Define o valor da propriedade giftMessageAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftMessageAvailable(String value) {
        this.giftMessageAvailable = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxApplied.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeeeTaxApplied() {
        return weeeTaxApplied;
    }

    /**
     * Define o valor da propriedade weeeTaxApplied.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeeeTaxApplied(Double value) {
        this.weeeTaxApplied = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxAppliedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeeeTaxAppliedAmount() {
        return weeeTaxAppliedAmount;
    }

    /**
     * Define o valor da propriedade weeeTaxAppliedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeeeTaxAppliedAmount(Double value) {
        this.weeeTaxAppliedAmount = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxAppliedRowAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeeeTaxAppliedRowAmount() {
        return weeeTaxAppliedRowAmount;
    }

    /**
     * Define o valor da propriedade weeeTaxAppliedRowAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeeeTaxAppliedRowAmount(Double value) {
        this.weeeTaxAppliedRowAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseWeeeTaxAppliedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseWeeeTaxAppliedAmount() {
        return baseWeeeTaxAppliedAmount;
    }

    /**
     * Define o valor da propriedade baseWeeeTaxAppliedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseWeeeTaxAppliedAmount(Double value) {
        this.baseWeeeTaxAppliedAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseWeeeTaxAppliedRowAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseWeeeTaxAppliedRowAmount() {
        return baseWeeeTaxAppliedRowAmount;
    }

    /**
     * Define o valor da propriedade baseWeeeTaxAppliedRowAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseWeeeTaxAppliedRowAmount(Double value) {
        this.baseWeeeTaxAppliedRowAmount = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxDisposition.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeeeTaxDisposition() {
        return weeeTaxDisposition;
    }

    /**
     * Define o valor da propriedade weeeTaxDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeeeTaxDisposition(Double value) {
        this.weeeTaxDisposition = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxRowDisposition.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeeeTaxRowDisposition() {
        return weeeTaxRowDisposition;
    }

    /**
     * Define o valor da propriedade weeeTaxRowDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeeeTaxRowDisposition(Double value) {
        this.weeeTaxRowDisposition = value;
    }

    /**
     * Obtém o valor da propriedade baseWeeeTaxDisposition.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseWeeeTaxDisposition() {
        return baseWeeeTaxDisposition;
    }

    /**
     * Define o valor da propriedade baseWeeeTaxDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseWeeeTaxDisposition(Double value) {
        this.baseWeeeTaxDisposition = value;
    }

    /**
     * Obtém o valor da propriedade baseWeeeTaxRowDisposition.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseWeeeTaxRowDisposition() {
        return baseWeeeTaxRowDisposition;
    }

    /**
     * Define o valor da propriedade baseWeeeTaxRowDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseWeeeTaxRowDisposition(Double value) {
        this.baseWeeeTaxRowDisposition = value;
    }

    /**
     * Obtém o valor da propriedade taxClassId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClassId() {
        return taxClassId;
    }

    /**
     * Define o valor da propriedade taxClassId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClassId(String value) {
        this.taxClassId = value;
    }

}
