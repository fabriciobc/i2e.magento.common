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
 * <p>Classe Java de salesOrderInvoiceItemEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salesOrderInvoiceItemEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="row_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_row_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_applied_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_applied_row_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_applied_row_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weee_tax_row_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_weee_tax_row_disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_item_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderInvoiceItemEntity", propOrder = {
    "incrementId",
    "parentId",
    "createdAt",
    "updatedAt",
    "isActive",
    "weeeTaxApplied",
    "qty",
    "cost",
    "price",
    "taxAmount",
    "rowTotal",
    "basePrice",
    "baseTaxAmount",
    "baseRowTotal",
    "baseWeeeTaxAppliedAmount",
    "baseWeeeTaxAppliedRowAmount",
    "weeeTaxAppliedAmount",
    "weeeTaxAppliedRowAmount",
    "weeeTaxDisposition",
    "weeeTaxRowDisposition",
    "baseWeeeTaxDisposition",
    "baseWeeeTaxRowDisposition",
    "sku",
    "name",
    "orderItemId",
    "productId",
    "itemId"
})
public class SalesOrderInvoiceItemEntity {

    @XmlElement(name = "increment_id")
    protected String incrementId;
    @XmlElement(name = "parent_id")
    protected String parentId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    @XmlElement(name = "is_active")
    protected String isActive;
    @XmlElement(name = "weee_tax_applied")
    protected String weeeTaxApplied;
    protected String qty;
    protected String cost;
    protected String price;
    @XmlElement(name = "tax_amount")
    protected String taxAmount;
    @XmlElement(name = "row_total")
    protected String rowTotal;
    @XmlElement(name = "base_price")
    protected String basePrice;
    @XmlElement(name = "base_tax_amount")
    protected String baseTaxAmount;
    @XmlElement(name = "base_row_total")
    protected String baseRowTotal;
    @XmlElement(name = "base_weee_tax_applied_amount")
    protected String baseWeeeTaxAppliedAmount;
    @XmlElement(name = "base_weee_tax_applied_row_amount")
    protected String baseWeeeTaxAppliedRowAmount;
    @XmlElement(name = "weee_tax_applied_amount")
    protected String weeeTaxAppliedAmount;
    @XmlElement(name = "weee_tax_applied_row_amount")
    protected String weeeTaxAppliedRowAmount;
    @XmlElement(name = "weee_tax_disposition")
    protected String weeeTaxDisposition;
    @XmlElement(name = "weee_tax_row_disposition")
    protected String weeeTaxRowDisposition;
    @XmlElement(name = "base_weee_tax_disposition")
    protected String baseWeeeTaxDisposition;
    @XmlElement(name = "base_weee_tax_row_disposition")
    protected String baseWeeeTaxRowDisposition;
    protected String sku;
    protected String name;
    @XmlElement(name = "order_item_id")
    protected String orderItemId;
    @XmlElement(name = "product_id")
    protected String productId;
    @XmlElement(name = "item_id")
    protected String itemId;

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
     * Obtém o valor da propriedade qty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Define o valor da propriedade qty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
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
     * Obtém o valor da propriedade orderItemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * Define o valor da propriedade orderItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemId(String value) {
        this.orderItemId = value;
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

}
