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
 * <p>Classe Java de apiEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="apiEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aliases" type="{urn:Magento}ArrayOfString"/&gt;
 *         &lt;element name="methods" type="{urn:Magento}ArrayOfApiMethods"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiEntity", propOrder = {
    "title",
    "name",
    "aliases",
    "methods"
})
public class ApiEntity {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ArrayOfString aliases;
    @XmlElement(required = true)
    protected ArrayOfApiMethods methods;

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Obtém o valor da propriedade aliases.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAliases() {
        return aliases;
    }

    /**
     * Define o valor da propriedade aliases.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAliases(ArrayOfString value) {
        this.aliases = value;
    }

    /**
     * Obtém o valor da propriedade methods.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfApiMethods }
     *     
     */
    public ArrayOfApiMethods getMethods() {
        return methods;
    }

    /**
     * Define o valor da propriedade methods.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfApiMethods }
     *     
     */
    public void setMethods(ArrayOfApiMethods value) {
        this.methods = value;
    }

}
