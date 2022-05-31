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
 * <p>Classe Java de directoryCountryEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="directoryCountryEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iso2_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iso3_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "directoryCountryEntity", propOrder = {
    "countryId",
    "iso2Code",
    "iso3Code",
    "name"
})
public class DirectoryCountryEntity {

    @XmlElement(name = "country_id", required = true)
    protected String countryId;
    @XmlElement(name = "iso2_code", required = true)
    protected String iso2Code;
    @XmlElement(name = "iso3_code", required = true)
    protected String iso3Code;
    @XmlElement(required = true)
    protected String name;

    /**
     * Obtém o valor da propriedade countryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * Define o valor da propriedade countryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryId(String value) {
        this.countryId = value;
    }

    /**
     * Obtém o valor da propriedade iso2Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso2Code() {
        return iso2Code;
    }

    /**
     * Define o valor da propriedade iso2Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso2Code(String value) {
        this.iso2Code = value;
    }

    /**
     * Obtém o valor da propriedade iso3Code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso3Code() {
        return iso3Code;
    }

    /**
     * Define o valor da propriedade iso3Code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso3Code(String value) {
        this.iso3Code = value;
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

}
