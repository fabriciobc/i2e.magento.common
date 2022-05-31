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
 * <p>Classe Java de salesOrderItemEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salesOrderItemEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quote_item_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product_options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_virtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applied_rule_ids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="free_shipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_qty_decimal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="no_discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qty_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qty_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qty_ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qty_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qty_shipped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="original_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_original_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_amount_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="row_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_row_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="row_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_row_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="row_weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message_available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_before_discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_before_discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied_row_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_applied_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_applied_row_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_row_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_row_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderItemEntity", propOrder = {
    "itemId",
    "orderId",
    "quoteItemId",
    "createdAt",
    "updatedAt",
    "productId",
    "productType",
    "productOptions",
    "weight",
    "isVirtual",
    "sku",
    "name",
    "appliedRuleIds",
    "freeShipping",
    "isQtyDecimal",
    "noDiscount",
    "qtyCanceled",
    "qtyInvoiced",
    "qtyOrdered",
    "qtyRefunded",
    "qtyShipped",
    "cost",
    "price",
    "basePrice",
    "originalPrice",
    "baseOriginalPrice",
    "taxPercent",
    "taxAmount",
    "baseTaxAmount",
    "taxInvoiced",
    "baseTaxInvoiced",
    "discountPercent",
    "discountAmount",
    "baseDiscountAmount",
    "discountInvoiced",
    "baseDiscountInvoiced",
    "amountRefunded",
    "baseAmountRefunded",
    "rowTotal",
    "baseRowTotal",
    "rowInvoiced",
    "baseRowInvoiced",
    "rowWeight",
    "giftMessageId",
    "giftMessage",
    "giftMessageAvailable",
    "baseTaxBeforeDiscount",
    "taxBeforeDiscount",
    "weeeTaxApplied",
    "weeeTaxAppliedAmount",
    "weeeTaxAppliedRowAmount",
    "baseWeeeTaxAppliedAmount",
    "baseWeeeTaxAppliedRowAmount",
    "weeeTaxDisposition",
    "weeeTaxRowDisposition",
    "baseWeeeTaxDisposition",
    "baseWeeeTaxRowDisposition"
})
public class SalesOrderItemEntity {

    @XmlElement(name = "item_id")
    protected String itemId;
    @XmlElement(name = "order_id")
    protected String orderId;
    @XmlElement(name = "quote_item_id")
    protected String quoteItemId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    @XmlElement(name = "product_id")
    protected String productId;
    @XmlElement(name = "product_type")
    protected String productType;
    @XmlElement(name = "product_options")
    protected String productOptions;
    protected String weight;
    @XmlElement(name = "is_virtual")
    protected String isVirtual;
    protected String sku;
    protected String name;
    @XmlElement(name = "applied_rule_ids")
    protected String appliedRuleIds;
    @XmlElement(name = "free_shipping")
    protected String freeShipping;
    @XmlElement(name = "is_qty_decimal")
    protected String isQtyDecimal;
    @XmlElement(name = "no_discount")
    protected String noDiscount;
    @XmlElement(name = "qty_canceled")
    protected String qtyCanceled;
    @XmlElement(name = "qty_invoiced")
    protected String qtyInvoiced;
    @XmlElement(name = "qty_ordered")
    protected String qtyOrdered;
    @XmlElement(name = "qty_refunded")
    protected String qtyRefunded;
    @XmlElement(name = "qty_shipped")
    protected String qtyShipped;
    protected String cost;
    protected String price;
    @XmlElement(name = "base_price")
    protected String basePrice;
    @XmlElement(name = "original_price")
    protected String originalPrice;
    @XmlElement(name = "base_original_price")
    protected String baseOriginalPrice;
    @XmlElement(name = "tax_percent")
    protected String taxPercent;
    @XmlElement(name = "tax_amount")
    protected String taxAmount;
    @XmlElement(name = "base_tax_amount")
    protected String baseTaxAmount;
    @XmlElement(name = "tax_invoiced")
    protected String taxInvoiced;
    @XmlElement(name = "base_tax_invoiced")
    protected String baseTaxInvoiced;
    @XmlElement(name = "discount_percent")
    protected String discountPercent;
    @XmlElement(name = "discount_amount")
    protected String discountAmount;
    @XmlElement(name = "base_discount_amount")
    protected String baseDiscountAmount;
    @XmlElement(name = "discount_invoiced")
    protected String discountInvoiced;
    @XmlElement(name = "base_discount_invoiced")
    protected String baseDiscountInvoiced;
    @XmlElement(name = "amount_refunded")
    protected String amountRefunded;
    @XmlElement(name = "base_amount_refunded")
    protected String baseAmountRefunded;
    @XmlElement(name = "row_total")
    protected String rowTotal;
    @XmlElement(name = "base_row_total")
    protected String baseRowTotal;
    @XmlElement(name = "row_invoiced")
    protected String rowInvoiced;
    @XmlElement(name = "base_row_invoiced")
    protected String baseRowInvoiced;
    @XmlElement(name = "row_weight")
    protected String rowWeight;
    @XmlElement(name = "gift_message_id")
    protected String giftMessageId;
    @XmlElement(name = "gift_message")
    protected String giftMessage;
    @XmlElement(name = "gift_message_available")
    protected String giftMessageAvailable;
    @XmlElement(name = "base_tax_before_discount")
    protected String baseTaxBeforeDiscount;
    @XmlElement(name = "tax_before_discount")
    protected String taxBeforeDiscount;
    @XmlElement(name = "weee_tax_applied")
    protected String weeeTaxApplied;
    @XmlElement(name = "weee_tax_applied_amount")
    protected String weeeTaxAppliedAmount;
    @XmlElement(name = "weee_tax_applied_row_amount")
    protected String weeeTaxAppliedRowAmount;
    @XmlElement(name = "base_weee_tax_applied_amount")
    protected String baseWeeeTaxAppliedAmount;
    @XmlElement(name = "base_weee_tax_applied_row_amount")
    protected String baseWeeeTaxAppliedRowAmount;
    @XmlElement(name = "weee_tax_disposition")
    protected String weeeTaxDisposition;
    @XmlElement(name = "weee_tax_row_disposition")
    protected String weeeTaxRowDisposition;
    @XmlElement(name = "base_weee_tax_disposition")
    protected String baseWeeeTaxDisposition;
    @XmlElement(name = "base_weee_tax_row_disposition")
    protected String baseWeeeTaxRowDisposition;

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
     * Obtém o valor da propriedade quoteItemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteItemId() {
        return quoteItemId;
    }

    /**
     * Define o valor da propriedade quoteItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteItemId(String value) {
        this.quoteItemId = value;
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
     * Obtém o valor da propriedade productOptions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOptions() {
        return productOptions;
    }

    /**
     * Define o valor da propriedade productOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOptions(String value) {
        this.productOptions = value;
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
     * Obtém o valor da propriedade qtyCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyCanceled() {
        return qtyCanceled;
    }

    /**
     * Define o valor da propriedade qtyCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyCanceled(String value) {
        this.qtyCanceled = value;
    }

    /**
     * Obtém o valor da propriedade qtyInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyInvoiced() {
        return qtyInvoiced;
    }

    /**
     * Define o valor da propriedade qtyInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyInvoiced(String value) {
        this.qtyInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade qtyOrdered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyOrdered() {
        return qtyOrdered;
    }

    /**
     * Define o valor da propriedade qtyOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyOrdered(String value) {
        this.qtyOrdered = value;
    }

    /**
     * Obtém o valor da propriedade qtyRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyRefunded() {
        return qtyRefunded;
    }

    /**
     * Define o valor da propriedade qtyRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyRefunded(String value) {
        this.qtyRefunded = value;
    }

    /**
     * Obtém o valor da propriedade qtyShipped.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyShipped() {
        return qtyShipped;
    }

    /**
     * Define o valor da propriedade qtyShipped.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyShipped(String value) {
        this.qtyShipped = value;
    }

    /**
     * Obtém o valor da propriedade cost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Define o valor da propriedade cost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade basePrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Define o valor da propriedade basePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Obtém o valor da propriedade originalPrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Define o valor da propriedade originalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPrice(String value) {
        this.originalPrice = value;
    }

    /**
     * Obtém o valor da propriedade baseOriginalPrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseOriginalPrice() {
        return baseOriginalPrice;
    }

    /**
     * Define o valor da propriedade baseOriginalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseOriginalPrice(String value) {
        this.baseOriginalPrice = value;
    }

    /**
     * Obtém o valor da propriedade taxPercent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPercent() {
        return taxPercent;
    }

    /**
     * Define o valor da propriedade taxPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPercent(String value) {
        this.taxPercent = value;
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
     * Obtém o valor da propriedade taxInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInvoiced() {
        return taxInvoiced;
    }

    /**
     * Define o valor da propriedade taxInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInvoiced(String value) {
        this.taxInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseTaxInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTaxInvoiced() {
        return baseTaxInvoiced;
    }

    /**
     * Define o valor da propriedade baseTaxInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTaxInvoiced(String value) {
        this.baseTaxInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade discountPercent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Define o valor da propriedade discountPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercent(String value) {
        this.discountPercent = value;
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
     * Obtém o valor da propriedade discountInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountInvoiced() {
        return discountInvoiced;
    }

    /**
     * Define o valor da propriedade discountInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountInvoiced(String value) {
        this.discountInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseDiscountInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDiscountInvoiced() {
        return baseDiscountInvoiced;
    }

    /**
     * Define o valor da propriedade baseDiscountInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDiscountInvoiced(String value) {
        this.baseDiscountInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade amountRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountRefunded() {
        return amountRefunded;
    }

    /**
     * Define o valor da propriedade amountRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountRefunded(String value) {
        this.amountRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseAmountRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAmountRefunded() {
        return baseAmountRefunded;
    }

    /**
     * Define o valor da propriedade baseAmountRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAmountRefunded(String value) {
        this.baseAmountRefunded = value;
    }

    /**
     * Obtém o valor da propriedade rowTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowTotal() {
        return rowTotal;
    }

    /**
     * Define o valor da propriedade rowTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowTotal(String value) {
        this.rowTotal = value;
    }

    /**
     * Obtém o valor da propriedade baseRowTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRowTotal() {
        return baseRowTotal;
    }

    /**
     * Define o valor da propriedade baseRowTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRowTotal(String value) {
        this.baseRowTotal = value;
    }

    /**
     * Obtém o valor da propriedade rowInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowInvoiced() {
        return rowInvoiced;
    }

    /**
     * Define o valor da propriedade rowInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowInvoiced(String value) {
        this.rowInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseRowInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRowInvoiced() {
        return baseRowInvoiced;
    }

    /**
     * Define o valor da propriedade baseRowInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRowInvoiced(String value) {
        this.baseRowInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade rowWeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowWeight() {
        return rowWeight;
    }

    /**
     * Define o valor da propriedade rowWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowWeight(String value) {
        this.rowWeight = value;
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
     * Obtém o valor da propriedade baseTaxBeforeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTaxBeforeDiscount() {
        return baseTaxBeforeDiscount;
    }

    /**
     * Define o valor da propriedade baseTaxBeforeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTaxBeforeDiscount(String value) {
        this.baseTaxBeforeDiscount = value;
    }

    /**
     * Obtém o valor da propriedade taxBeforeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxBeforeDiscount() {
        return taxBeforeDiscount;
    }

    /**
     * Define o valor da propriedade taxBeforeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxBeforeDiscount(String value) {
        this.taxBeforeDiscount = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxApplied.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeeTaxApplied() {
        return weeeTaxApplied;
    }

    /**
     * Define o valor da propriedade weeeTaxApplied.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeeTaxApplied(String value) {
        this.weeeTaxApplied = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxAppliedAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeeTaxAppliedAmount() {
        return weeeTaxAppliedAmount;
    }

    /**
     * Define o valor da propriedade weeeTaxAppliedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeeTaxAppliedAmount(String value) {
        this.weeeTaxAppliedAmount = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxAppliedRowAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeeTaxAppliedRowAmount() {
        return weeeTaxAppliedRowAmount;
    }

    /**
     * Define o valor da propriedade weeeTaxAppliedRowAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeeTaxAppliedRowAmount(String value) {
        this.weeeTaxAppliedRowAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseWeeeTaxAppliedAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseWeeeTaxAppliedAmount() {
        return baseWeeeTaxAppliedAmount;
    }

    /**
     * Define o valor da propriedade baseWeeeTaxAppliedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseWeeeTaxAppliedAmount(String value) {
        this.baseWeeeTaxAppliedAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseWeeeTaxAppliedRowAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseWeeeTaxAppliedRowAmount() {
        return baseWeeeTaxAppliedRowAmount;
    }

    /**
     * Define o valor da propriedade baseWeeeTaxAppliedRowAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseWeeeTaxAppliedRowAmount(String value) {
        this.baseWeeeTaxAppliedRowAmount = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxDisposition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeeTaxDisposition() {
        return weeeTaxDisposition;
    }

    /**
     * Define o valor da propriedade weeeTaxDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeeTaxDisposition(String value) {
        this.weeeTaxDisposition = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxRowDisposition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeeTaxRowDisposition() {
        return weeeTaxRowDisposition;
    }

    /**
     * Define o valor da propriedade weeeTaxRowDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeeTaxRowDisposition(String value) {
        this.weeeTaxRowDisposition = value;
    }

    /**
     * Obtém o valor da propriedade baseWeeeTaxDisposition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseWeeeTaxDisposition() {
        return baseWeeeTaxDisposition;
    }

    /**
     * Define o valor da propriedade baseWeeeTaxDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseWeeeTaxDisposition(String value) {
        this.baseWeeeTaxDisposition = value;
    }

    /**
     * Obtém o valor da propriedade baseWeeeTaxRowDisposition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseWeeeTaxRowDisposition() {
        return baseWeeeTaxRowDisposition;
    }

    /**
     * Define o valor da propriedade baseWeeeTaxRowDisposition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseWeeeTaxRowDisposition(String value) {
        this.baseWeeeTaxRowDisposition = value;
    }

}
