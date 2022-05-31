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
 * <p>Classe Java de catalogInventoryStockItemUpdateEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="catalogInventoryStockItemUpdateEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_in_stock" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="manage_stock" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="use_config_manage_stock" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="min_qty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="use_config_min_qty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="min_sale_qty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="use_config_min_sale_qty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="max_sale_qty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="use_config_max_sale_qty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="is_qty_decimal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="backorders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="use_config_backorders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="notify_stock_qty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="use_config_notify_stock_qty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogInventoryStockItemUpdateEntity", propOrder = {
    "qty",
    "isInStock",
    "manageStock",
    "useConfigManageStock",
    "minQty",
    "useConfigMinQty",
    "minSaleQty",
    "useConfigMinSaleQty",
    "maxSaleQty",
    "useConfigMaxSaleQty",
    "isQtyDecimal",
    "backorders",
    "useConfigBackorders",
    "notifyStockQty",
    "useConfigNotifyStockQty"
})
public class CatalogInventoryStockItemUpdateEntity {

    protected String qty;
    @XmlElement(name = "is_in_stock")
    protected Integer isInStock;
    @XmlElement(name = "manage_stock")
    protected Integer manageStock;
    @XmlElement(name = "use_config_manage_stock")
    protected Integer useConfigManageStock;
    @XmlElement(name = "min_qty")
    protected Integer minQty;
    @XmlElement(name = "use_config_min_qty")
    protected Integer useConfigMinQty;
    @XmlElement(name = "min_sale_qty")
    protected Integer minSaleQty;
    @XmlElement(name = "use_config_min_sale_qty")
    protected Integer useConfigMinSaleQty;
    @XmlElement(name = "max_sale_qty")
    protected Integer maxSaleQty;
    @XmlElement(name = "use_config_max_sale_qty")
    protected Integer useConfigMaxSaleQty;
    @XmlElement(name = "is_qty_decimal")
    protected Integer isQtyDecimal;
    protected Integer backorders;
    @XmlElement(name = "use_config_backorders")
    protected Integer useConfigBackorders;
    @XmlElement(name = "notify_stock_qty")
    protected Integer notifyStockQty;
    @XmlElement(name = "use_config_notify_stock_qty")
    protected Integer useConfigNotifyStockQty;

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
     * Obtém o valor da propriedade isInStock.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsInStock() {
        return isInStock;
    }

    /**
     * Define o valor da propriedade isInStock.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsInStock(Integer value) {
        this.isInStock = value;
    }

    /**
     * Obtém o valor da propriedade manageStock.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManageStock() {
        return manageStock;
    }

    /**
     * Define o valor da propriedade manageStock.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManageStock(Integer value) {
        this.manageStock = value;
    }

    /**
     * Obtém o valor da propriedade useConfigManageStock.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseConfigManageStock() {
        return useConfigManageStock;
    }

    /**
     * Define o valor da propriedade useConfigManageStock.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseConfigManageStock(Integer value) {
        this.useConfigManageStock = value;
    }

    /**
     * Obtém o valor da propriedade minQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinQty() {
        return minQty;
    }

    /**
     * Define o valor da propriedade minQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinQty(Integer value) {
        this.minQty = value;
    }

    /**
     * Obtém o valor da propriedade useConfigMinQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseConfigMinQty() {
        return useConfigMinQty;
    }

    /**
     * Define o valor da propriedade useConfigMinQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseConfigMinQty(Integer value) {
        this.useConfigMinQty = value;
    }

    /**
     * Obtém o valor da propriedade minSaleQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinSaleQty() {
        return minSaleQty;
    }

    /**
     * Define o valor da propriedade minSaleQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinSaleQty(Integer value) {
        this.minSaleQty = value;
    }

    /**
     * Obtém o valor da propriedade useConfigMinSaleQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseConfigMinSaleQty() {
        return useConfigMinSaleQty;
    }

    /**
     * Define o valor da propriedade useConfigMinSaleQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseConfigMinSaleQty(Integer value) {
        this.useConfigMinSaleQty = value;
    }

    /**
     * Obtém o valor da propriedade maxSaleQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSaleQty() {
        return maxSaleQty;
    }

    /**
     * Define o valor da propriedade maxSaleQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSaleQty(Integer value) {
        this.maxSaleQty = value;
    }

    /**
     * Obtém o valor da propriedade useConfigMaxSaleQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseConfigMaxSaleQty() {
        return useConfigMaxSaleQty;
    }

    /**
     * Define o valor da propriedade useConfigMaxSaleQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseConfigMaxSaleQty(Integer value) {
        this.useConfigMaxSaleQty = value;
    }

    /**
     * Obtém o valor da propriedade isQtyDecimal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsQtyDecimal() {
        return isQtyDecimal;
    }

    /**
     * Define o valor da propriedade isQtyDecimal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsQtyDecimal(Integer value) {
        this.isQtyDecimal = value;
    }

    /**
     * Obtém o valor da propriedade backorders.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackorders() {
        return backorders;
    }

    /**
     * Define o valor da propriedade backorders.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackorders(Integer value) {
        this.backorders = value;
    }

    /**
     * Obtém o valor da propriedade useConfigBackorders.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseConfigBackorders() {
        return useConfigBackorders;
    }

    /**
     * Define o valor da propriedade useConfigBackorders.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseConfigBackorders(Integer value) {
        this.useConfigBackorders = value;
    }

    /**
     * Obtém o valor da propriedade notifyStockQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotifyStockQty() {
        return notifyStockQty;
    }

    /**
     * Define o valor da propriedade notifyStockQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotifyStockQty(Integer value) {
        this.notifyStockQty = value;
    }

    /**
     * Obtém o valor da propriedade useConfigNotifyStockQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseConfigNotifyStockQty() {
        return useConfigNotifyStockQty;
    }

    /**
     * Define o valor da propriedade useConfigNotifyStockQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseConfigNotifyStockQty(Integer value) {
        this.useConfigNotifyStockQty = value;
    }

}
