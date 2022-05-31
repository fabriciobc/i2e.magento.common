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
 * <p>Classe Java de shoppingCartPaymentMethodEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="shoppingCartPaymentMethodEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="po_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_cid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_exp_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_exp_month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shoppingCartPaymentMethodEntity", propOrder = {
    "poNumber",
    "method",
    "ccCid",
    "ccOwner",
    "ccNumber",
    "ccType",
    "ccExpYear",
    "ccExpMonth"
})
public class ShoppingCartPaymentMethodEntity {

    @XmlElement(name = "po_number")
    protected String poNumber;
    protected String method;
    @XmlElement(name = "cc_cid")
    protected String ccCid;
    @XmlElement(name = "cc_owner")
    protected String ccOwner;
    @XmlElement(name = "cc_number")
    protected String ccNumber;
    @XmlElement(name = "cc_type")
    protected String ccType;
    @XmlElement(name = "cc_exp_year")
    protected String ccExpYear;
    @XmlElement(name = "cc_exp_month")
    protected String ccExpMonth;

    /**
     * Obtém o valor da propriedade poNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Define o valor da propriedade poNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Obtém o valor da propriedade method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Define o valor da propriedade method.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Obtém o valor da propriedade ccCid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcCid() {
        return ccCid;
    }

    /**
     * Define o valor da propriedade ccCid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcCid(String value) {
        this.ccCid = value;
    }

    /**
     * Obtém o valor da propriedade ccOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcOwner() {
        return ccOwner;
    }

    /**
     * Define o valor da propriedade ccOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcOwner(String value) {
        this.ccOwner = value;
    }

    /**
     * Obtém o valor da propriedade ccNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcNumber() {
        return ccNumber;
    }

    /**
     * Define o valor da propriedade ccNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcNumber(String value) {
        this.ccNumber = value;
    }

    /**
     * Obtém o valor da propriedade ccType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcType() {
        return ccType;
    }

    /**
     * Define o valor da propriedade ccType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcType(String value) {
        this.ccType = value;
    }

    /**
     * Obtém o valor da propriedade ccExpYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcExpYear() {
        return ccExpYear;
    }

    /**
     * Define o valor da propriedade ccExpYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcExpYear(String value) {
        this.ccExpYear = value;
    }

    /**
     * Obtém o valor da propriedade ccExpMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcExpMonth() {
        return ccExpMonth;
    }

    /**
     * Define o valor da propriedade ccExpMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcExpMonth(String value) {
        this.ccExpMonth = value;
    }

}
