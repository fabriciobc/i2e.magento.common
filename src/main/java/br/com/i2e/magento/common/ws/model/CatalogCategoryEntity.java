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
 * <p>Classe Java de catalogCategoryEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="catalogCategoryEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="parent_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="children" type="{urn:Magento}ArrayOfCatalogCategoryEntities"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogCategoryEntity", propOrder = {
    "categoryId",
    "parentId",
    "name",
    "isActive",
    "position",
    "level",
    "children"
})
public class CatalogCategoryEntity {

    @XmlElement(name = "category_id")
    protected int categoryId;
    @XmlElement(name = "parent_id")
    protected int parentId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "is_active")
    protected int isActive;
    protected int position;
    protected int level;
    @XmlElement(required = true)
    protected ArrayOfCatalogCategoryEntities children;

    /**
     * Obtém o valor da propriedade categoryId.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Define o valor da propriedade categoryId.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
    }

    /**
     * Obtém o valor da propriedade parentId.
     * 
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * Define o valor da propriedade parentId.
     * 
     */
    public void setParentId(int value) {
        this.parentId = value;
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
     * Obtém o valor da propriedade isActive.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade position.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Define o valor da propriedade position.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Obtém o valor da propriedade level.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Define o valor da propriedade level.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Obtém o valor da propriedade children.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCatalogCategoryEntities }
     *     
     */
    public ArrayOfCatalogCategoryEntities getChildren() {
        return children;
    }

    /**
     * Define o valor da propriedade children.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCatalogCategoryEntities }
     *     
     */
    public void setChildren(ArrayOfCatalogCategoryEntities value) {
        this.children = value;
    }

}
