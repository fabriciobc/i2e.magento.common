//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.08 às 08:24:17 PM BRT 
//


package br.com.i2e.magento.common.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de catalogProductAttributeMediaCreateEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="catalogProductAttributeMediaCreateEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="file" type="{urn:Magento}catalogProductImageFileEntity" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="types" type="{urn:Magento}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="exclude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogProductAttributeMediaCreateEntity", propOrder = {
    "file",
    "label",
    "position",
    "types",
    "exclude",
    "remove"
})
public class CatalogProductAttributeMediaCreateEntity {

    protected CatalogProductImageFileEntity file;
    protected String label;
    protected String position;
    protected ArrayOfString types;
    protected String exclude;
    protected String remove;

    /**
     * Obtém o valor da propriedade file.
     * 
     * @return
     *     possible object is
     *     {@link CatalogProductImageFileEntity }
     *     
     */
    public CatalogProductImageFileEntity getFile() {
        return file;
    }

    /**
     * Define o valor da propriedade file.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogProductImageFileEntity }
     *     
     */
    public void setFile(CatalogProductImageFileEntity value) {
        this.file = value;
    }

    /**
     * Obtém o valor da propriedade label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define o valor da propriedade label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtém o valor da propriedade position.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Define o valor da propriedade position.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Obtém o valor da propriedade types.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTypes() {
        return types;
    }

    /**
     * Define o valor da propriedade types.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTypes(ArrayOfString value) {
        this.types = value;
    }

    /**
     * Obtém o valor da propriedade exclude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclude() {
        return exclude;
    }

    /**
     * Define o valor da propriedade exclude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclude(String value) {
        this.exclude = value;
    }

    /**
     * Obtém o valor da propriedade remove.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemove() {
        return remove;
    }

    /**
     * Define o valor da propriedade remove.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemove(String value) {
        this.remove = value;
    }

}
