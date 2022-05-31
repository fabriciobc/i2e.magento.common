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
 * <p>Classe Java de catalogProductCreateEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="catalogProductCreateEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categories" type="{urn:Magento}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="websites" type="{urn:Magento}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="short_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="category_ids" type="{urn:Magento}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="website_ids" type="{urn:Magento}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="has_options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message_available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="special_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="special_from_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="special_to_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_class_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tier_price" type="{urn:Magento}catalogProductTierPriceEntityArray" minOccurs="0"/&gt;
 *         &lt;element name="meta_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meta_keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meta_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custom_design" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custom_layout_update" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="options_container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additional_attributes" type="{urn:Magento}associativeArray" minOccurs="0"/&gt;
 *         &lt;element name="stock_data" type="{urn:Magento}catalogInventoryStockItemUpdateEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogProductCreateEntity", propOrder = {
    "categories",
    "websites",
    "name",
    "description",
    "shortDescription",
    "weight",
    "status",
    "urlKey",
    "urlPath",
    "visibility",
    "categoryIds",
    "websiteIds",
    "hasOptions",
    "giftMessageAvailable",
    "price",
    "specialPrice",
    "specialFromDate",
    "specialToDate",
    "taxClassId",
    "tierPrice",
    "metaTitle",
    "metaKeyword",
    "metaDescription",
    "customDesign",
    "customLayoutUpdate",
    "optionsContainer",
    "additionalAttributes",
    "stockData"
})
public class CatalogProductCreateEntity {

    protected ArrayOfString categories;
    protected ArrayOfString websites;
    protected String name;
    protected String description;
    @XmlElement(name = "short_description")
    protected String shortDescription;
    protected String weight;
    protected String status;
    @XmlElement(name = "url_key")
    protected String urlKey;
    @XmlElement(name = "url_path")
    protected String urlPath;
    protected String visibility;
    @XmlElement(name = "category_ids")
    protected ArrayOfString categoryIds;
    @XmlElement(name = "website_ids")
    protected ArrayOfString websiteIds;
    @XmlElement(name = "has_options")
    protected String hasOptions;
    @XmlElement(name = "gift_message_available")
    protected String giftMessageAvailable;
    protected String price;
    @XmlElement(name = "special_price")
    protected String specialPrice;
    @XmlElement(name = "special_from_date")
    protected String specialFromDate;
    @XmlElement(name = "special_to_date")
    protected String specialToDate;
    @XmlElement(name = "tax_class_id")
    protected String taxClassId;
    @XmlElement(name = "tier_price")
    protected CatalogProductTierPriceEntityArray tierPrice;
    @XmlElement(name = "meta_title")
    protected String metaTitle;
    @XmlElement(name = "meta_keyword")
    protected String metaKeyword;
    @XmlElement(name = "meta_description")
    protected String metaDescription;
    @XmlElement(name = "custom_design")
    protected String customDesign;
    @XmlElement(name = "custom_layout_update")
    protected String customLayoutUpdate;
    @XmlElement(name = "options_container")
    protected String optionsContainer;
    @XmlElement(name = "additional_attributes")
    protected AssociativeArray additionalAttributes;
    @XmlElement(name = "stock_data")
    protected CatalogInventoryStockItemUpdateEntity stockData;

    /**
     * Obtém o valor da propriedade categories.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCategories() {
        return categories;
    }

    /**
     * Define o valor da propriedade categories.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCategories(ArrayOfString value) {
        this.categories = value;
    }

    /**
     * Obtém o valor da propriedade websites.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getWebsites() {
        return websites;
    }

    /**
     * Define o valor da propriedade websites.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setWebsites(ArrayOfString value) {
        this.websites = value;
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
     * Obtém o valor da propriedade shortDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Define o valor da propriedade shortDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
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
     * Obtém o valor da propriedade urlKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlKey() {
        return urlKey;
    }

    /**
     * Define o valor da propriedade urlKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlKey(String value) {
        this.urlKey = value;
    }

    /**
     * Obtém o valor da propriedade urlPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * Define o valor da propriedade urlPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPath(String value) {
        this.urlPath = value;
    }

    /**
     * Obtém o valor da propriedade visibility.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Define o valor da propriedade visibility.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Obtém o valor da propriedade categoryIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCategoryIds() {
        return categoryIds;
    }

    /**
     * Define o valor da propriedade categoryIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCategoryIds(ArrayOfString value) {
        this.categoryIds = value;
    }

    /**
     * Obtém o valor da propriedade websiteIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getWebsiteIds() {
        return websiteIds;
    }

    /**
     * Define o valor da propriedade websiteIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setWebsiteIds(ArrayOfString value) {
        this.websiteIds = value;
    }

    /**
     * Obtém o valor da propriedade hasOptions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasOptions() {
        return hasOptions;
    }

    /**
     * Define o valor da propriedade hasOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasOptions(String value) {
        this.hasOptions = value;
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
     * Obtém o valor da propriedade specialPrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPrice() {
        return specialPrice;
    }

    /**
     * Define o valor da propriedade specialPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPrice(String value) {
        this.specialPrice = value;
    }

    /**
     * Obtém o valor da propriedade specialFromDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFromDate() {
        return specialFromDate;
    }

    /**
     * Define o valor da propriedade specialFromDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFromDate(String value) {
        this.specialFromDate = value;
    }

    /**
     * Obtém o valor da propriedade specialToDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialToDate() {
        return specialToDate;
    }

    /**
     * Define o valor da propriedade specialToDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialToDate(String value) {
        this.specialToDate = value;
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

    /**
     * Obtém o valor da propriedade tierPrice.
     * 
     * @return
     *     possible object is
     *     {@link CatalogProductTierPriceEntityArray }
     *     
     */
    public CatalogProductTierPriceEntityArray getTierPrice() {
        return tierPrice;
    }

    /**
     * Define o valor da propriedade tierPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogProductTierPriceEntityArray }
     *     
     */
    public void setTierPrice(CatalogProductTierPriceEntityArray value) {
        this.tierPrice = value;
    }

    /**
     * Obtém o valor da propriedade metaTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaTitle() {
        return metaTitle;
    }

    /**
     * Define o valor da propriedade metaTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaTitle(String value) {
        this.metaTitle = value;
    }

    /**
     * Obtém o valor da propriedade metaKeyword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaKeyword() {
        return metaKeyword;
    }

    /**
     * Define o valor da propriedade metaKeyword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaKeyword(String value) {
        this.metaKeyword = value;
    }

    /**
     * Obtém o valor da propriedade metaDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * Define o valor da propriedade metaDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaDescription(String value) {
        this.metaDescription = value;
    }

    /**
     * Obtém o valor da propriedade customDesign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDesign() {
        return customDesign;
    }

    /**
     * Define o valor da propriedade customDesign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDesign(String value) {
        this.customDesign = value;
    }

    /**
     * Obtém o valor da propriedade customLayoutUpdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomLayoutUpdate() {
        return customLayoutUpdate;
    }

    /**
     * Define o valor da propriedade customLayoutUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomLayoutUpdate(String value) {
        this.customLayoutUpdate = value;
    }

    /**
     * Obtém o valor da propriedade optionsContainer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionsContainer() {
        return optionsContainer;
    }

    /**
     * Define o valor da propriedade optionsContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionsContainer(String value) {
        this.optionsContainer = value;
    }

    /**
     * Obtém o valor da propriedade additionalAttributes.
     * 
     * @return
     *     possible object is
     *     {@link AssociativeArray }
     *     
     */
    public AssociativeArray getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Define o valor da propriedade additionalAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociativeArray }
     *     
     */
    public void setAdditionalAttributes(AssociativeArray value) {
        this.additionalAttributes = value;
    }

    /**
     * Obtém o valor da propriedade stockData.
     * 
     * @return
     *     possible object is
     *     {@link CatalogInventoryStockItemUpdateEntity }
     *     
     */
    public CatalogInventoryStockItemUpdateEntity getStockData() {
        return stockData;
    }

    /**
     * Define o valor da propriedade stockData.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogInventoryStockItemUpdateEntity }
     *     
     */
    public void setStockData(CatalogInventoryStockItemUpdateEntity value) {
        this.stockData = value;
    }

}
