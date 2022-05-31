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
 * <p>Classe Java de shoppingCartPaymentEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="shoppingCartPaymentEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_number_enc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_last4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_cid_enc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_exp_month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_exp_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_ss_owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_ss_start_month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_ss_start_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_ss_issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="po_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additional_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additional_information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shoppingCartPaymentEntity", propOrder = {
    "paymentId",
    "createdAt",
    "updatedAt",
    "method",
    "ccType",
    "ccNumberEnc",
    "ccLast4",
    "ccCidEnc",
    "ccOwner",
    "ccExpMonth",
    "ccExpYear",
    "ccSsOwner",
    "ccSsStartMonth",
    "ccSsStartYear",
    "ccSsIssue",
    "poNumber",
    "additionalData",
    "additionalInformation"
})
public class ShoppingCartPaymentEntity {

    @XmlElement(name = "payment_id")
    protected String paymentId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    protected String method;
    @XmlElement(name = "cc_type")
    protected String ccType;
    @XmlElement(name = "cc_number_enc")
    protected String ccNumberEnc;
    @XmlElement(name = "cc_last4")
    protected String ccLast4;
    @XmlElement(name = "cc_cid_enc")
    protected String ccCidEnc;
    @XmlElement(name = "cc_owner")
    protected String ccOwner;
    @XmlElement(name = "cc_exp_month")
    protected String ccExpMonth;
    @XmlElement(name = "cc_exp_year")
    protected String ccExpYear;
    @XmlElement(name = "cc_ss_owner")
    protected String ccSsOwner;
    @XmlElement(name = "cc_ss_start_month")
    protected String ccSsStartMonth;
    @XmlElement(name = "cc_ss_start_year")
    protected String ccSsStartYear;
    @XmlElement(name = "cc_ss_issue")
    protected String ccSsIssue;
    @XmlElement(name = "po_number")
    protected String poNumber;
    @XmlElement(name = "additional_data")
    protected String additionalData;
    @XmlElement(name = "additional_information")
    protected String additionalInformation;

    /**
     * Obtém o valor da propriedade paymentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Define o valor da propriedade paymentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
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
     * Obtém o valor da propriedade ccNumberEnc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcNumberEnc() {
        return ccNumberEnc;
    }

    /**
     * Define o valor da propriedade ccNumberEnc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcNumberEnc(String value) {
        this.ccNumberEnc = value;
    }

    /**
     * Obtém o valor da propriedade ccLast4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcLast4() {
        return ccLast4;
    }

    /**
     * Define o valor da propriedade ccLast4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcLast4(String value) {
        this.ccLast4 = value;
    }

    /**
     * Obtém o valor da propriedade ccCidEnc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcCidEnc() {
        return ccCidEnc;
    }

    /**
     * Define o valor da propriedade ccCidEnc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcCidEnc(String value) {
        this.ccCidEnc = value;
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
     * Obtém o valor da propriedade ccSsOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcSsOwner() {
        return ccSsOwner;
    }

    /**
     * Define o valor da propriedade ccSsOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcSsOwner(String value) {
        this.ccSsOwner = value;
    }

    /**
     * Obtém o valor da propriedade ccSsStartMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcSsStartMonth() {
        return ccSsStartMonth;
    }

    /**
     * Define o valor da propriedade ccSsStartMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcSsStartMonth(String value) {
        this.ccSsStartMonth = value;
    }

    /**
     * Obtém o valor da propriedade ccSsStartYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcSsStartYear() {
        return ccSsStartYear;
    }

    /**
     * Define o valor da propriedade ccSsStartYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcSsStartYear(String value) {
        this.ccSsStartYear = value;
    }

    /**
     * Obtém o valor da propriedade ccSsIssue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcSsIssue() {
        return ccSsIssue;
    }

    /**
     * Define o valor da propriedade ccSsIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcSsIssue(String value) {
        this.ccSsIssue = value;
    }

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
     * Obtém o valor da propriedade additionalData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Define o valor da propriedade additionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

    /**
     * Obtém o valor da propriedade additionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Define o valor da propriedade additionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

}
