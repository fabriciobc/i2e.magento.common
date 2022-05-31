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
 * <p>Classe Java de catalogCategoryEntityCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="catalogCategoryEntityCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="available_sort_by" type="{urn:Magento}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="custom_design" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custom_design_apply" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="custom_design_from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custom_design_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custom_layout_update" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="default_sort_by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="display_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_anchor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="landing_page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="meta_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meta_keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meta_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="page_layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url_key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="include_in_menu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogCategoryEntityCreate", propOrder = {
    "name",
    "isActive",
    "position",
    "availableSortBy",
    "customDesign",
    "customDesignApply",
    "customDesignFrom",
    "customDesignTo",
    "customLayoutUpdate",
    "defaultSortBy",
    "description",
    "displayMode",
    "isAnchor",
    "landingPage",
    "metaDescription",
    "metaKeywords",
    "metaTitle",
    "pageLayout",
    "urlKey",
    "includeInMenu"
})
public class CatalogCategoryEntityCreate {

    protected String name;
    @XmlElement(name = "is_active")
    protected Integer isActive;
    protected Integer position;
    @XmlElement(name = "available_sort_by")
    protected ArrayOfString availableSortBy;
    @XmlElement(name = "custom_design")
    protected String customDesign;
    @XmlElement(name = "custom_design_apply")
    protected Integer customDesignApply;
    @XmlElement(name = "custom_design_from")
    protected String customDesignFrom;
    @XmlElement(name = "custom_design_to")
    protected String customDesignTo;
    @XmlElement(name = "custom_layout_update")
    protected String customLayoutUpdate;
    @XmlElement(name = "default_sort_by")
    protected String defaultSortBy;
    protected String description;
    @XmlElement(name = "display_mode")
    protected String displayMode;
    @XmlElement(name = "is_anchor")
    protected Integer isAnchor;
    @XmlElement(name = "landing_page")
    protected Integer landingPage;
    @XmlElement(name = "meta_description")
    protected String metaDescription;
    @XmlElement(name = "meta_keywords")
    protected String metaKeywords;
    @XmlElement(name = "meta_title")
    protected String metaTitle;
    @XmlElement(name = "page_layout")
    protected String pageLayout;
    @XmlElement(name = "url_key")
    protected String urlKey;
    @XmlElement(name = "include_in_menu")
    protected Integer includeInMenu;

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
     * Obtém o valor da propriedade position.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Define o valor da propriedade position.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Obtém o valor da propriedade availableSortBy.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAvailableSortBy() {
        return availableSortBy;
    }

    /**
     * Define o valor da propriedade availableSortBy.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAvailableSortBy(ArrayOfString value) {
        this.availableSortBy = value;
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
     * Obtém o valor da propriedade customDesignApply.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomDesignApply() {
        return customDesignApply;
    }

    /**
     * Define o valor da propriedade customDesignApply.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomDesignApply(Integer value) {
        this.customDesignApply = value;
    }

    /**
     * Obtém o valor da propriedade customDesignFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDesignFrom() {
        return customDesignFrom;
    }

    /**
     * Define o valor da propriedade customDesignFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDesignFrom(String value) {
        this.customDesignFrom = value;
    }

    /**
     * Obtém o valor da propriedade customDesignTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDesignTo() {
        return customDesignTo;
    }

    /**
     * Define o valor da propriedade customDesignTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDesignTo(String value) {
        this.customDesignTo = value;
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
     * Obtém o valor da propriedade defaultSortBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSortBy() {
        return defaultSortBy;
    }

    /**
     * Define o valor da propriedade defaultSortBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSortBy(String value) {
        this.defaultSortBy = value;
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
     * Obtém o valor da propriedade displayMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayMode() {
        return displayMode;
    }

    /**
     * Define o valor da propriedade displayMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayMode(String value) {
        this.displayMode = value;
    }

    /**
     * Obtém o valor da propriedade isAnchor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsAnchor() {
        return isAnchor;
    }

    /**
     * Define o valor da propriedade isAnchor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsAnchor(Integer value) {
        this.isAnchor = value;
    }

    /**
     * Obtém o valor da propriedade landingPage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLandingPage() {
        return landingPage;
    }

    /**
     * Define o valor da propriedade landingPage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLandingPage(Integer value) {
        this.landingPage = value;
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
     * Obtém o valor da propriedade metaKeywords.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaKeywords() {
        return metaKeywords;
    }

    /**
     * Define o valor da propriedade metaKeywords.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaKeywords(String value) {
        this.metaKeywords = value;
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
     * Obtém o valor da propriedade pageLayout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageLayout() {
        return pageLayout;
    }

    /**
     * Define o valor da propriedade pageLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLayout(String value) {
        this.pageLayout = value;
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
     * Obtém o valor da propriedade includeInMenu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncludeInMenu() {
        return includeInMenu;
    }

    /**
     * Define o valor da propriedade includeInMenu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncludeInMenu(Integer value) {
        this.includeInMenu = value;
    }

}
