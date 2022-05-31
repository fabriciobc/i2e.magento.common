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
 * <p>Classe Java de shoppingCartProductEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="shoppingCartProductEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{urn:Magento}associativeArray" minOccurs="0"/&gt;
 *         &lt;element name="bundle_option" type="{urn:Magento}associativeArray" minOccurs="0"/&gt;
 *         &lt;element name="bundle_option_qty" type="{urn:Magento}associativeArray" minOccurs="0"/&gt;
 *         &lt;element name="links" type="{urn:Magento}ArrayOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shoppingCartProductEntity", propOrder = {
    "productId",
    "sku",
    "qty",
    "options",
    "bundleOption",
    "bundleOptionQty",
    "links"
})
public class ShoppingCartProductEntity {

    @XmlElement(name = "product_id")
    protected String productId;
    protected String sku;
    protected Double qty;
    protected AssociativeArray options;
    @XmlElement(name = "bundle_option")
    protected AssociativeArray bundleOption;
    @XmlElement(name = "bundle_option_qty")
    protected AssociativeArray bundleOptionQty;
    protected ArrayOfString links;

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
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link AssociativeArray }
     *     
     */
    public AssociativeArray getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociativeArray }
     *     
     */
    public void setOptions(AssociativeArray value) {
        this.options = value;
    }

    /**
     * Obtém o valor da propriedade bundleOption.
     * 
     * @return
     *     possible object is
     *     {@link AssociativeArray }
     *     
     */
    public AssociativeArray getBundleOption() {
        return bundleOption;
    }

    /**
     * Define o valor da propriedade bundleOption.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociativeArray }
     *     
     */
    public void setBundleOption(AssociativeArray value) {
        this.bundleOption = value;
    }

    /**
     * Obtém o valor da propriedade bundleOptionQty.
     * 
     * @return
     *     possible object is
     *     {@link AssociativeArray }
     *     
     */
    public AssociativeArray getBundleOptionQty() {
        return bundleOptionQty;
    }

    /**
     * Define o valor da propriedade bundleOptionQty.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociativeArray }
     *     
     */
    public void setBundleOptionQty(AssociativeArray value) {
        this.bundleOptionQty = value;
    }

    /**
     * Obtém o valor da propriedade links.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getLinks() {
        return links;
    }

    /**
     * Define o valor da propriedade links.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setLinks(ArrayOfString value) {
        this.links = value;
    }

}
