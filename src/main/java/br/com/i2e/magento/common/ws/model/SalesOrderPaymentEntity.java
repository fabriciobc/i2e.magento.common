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
 * <p>Classe Java de salesOrderPaymentEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salesOrderPaymentEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parent_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount_ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_amount_ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="po_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_number_enc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_last4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_exp_month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_exp_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_ss_start_month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cc_ss_start_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderPaymentEntity", propOrder = {
    "incrementId",
    "parentId",
    "createdAt",
    "updatedAt",
    "isActive",
    "amountOrdered",
    "shippingAmount",
    "baseAmountOrdered",
    "baseShippingAmount",
    "method",
    "poNumber",
    "ccType",
    "ccNumberEnc",
    "ccLast4",
    "ccOwner",
    "ccExpMonth",
    "ccExpYear",
    "ccSsStartMonth",
    "ccSsStartYear",
    "paymentId"
})
public class SalesOrderPaymentEntity {

    @XmlElement(name = "increment_id")
    protected String incrementId;
    @XmlElement(name = "parent_id")
    protected String parentId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    @XmlElement(name = "is_active")
    protected String isActive;
    @XmlElement(name = "amount_ordered")
    protected String amountOrdered;
    @XmlElement(name = "shipping_amount")
    protected String shippingAmount;
    @XmlElement(name = "base_amount_ordered")
    protected String baseAmountOrdered;
    @XmlElement(name = "base_shipping_amount")
    protected String baseShippingAmount;
    protected String method;
    @XmlElement(name = "po_number")
    protected String poNumber;
    @XmlElement(name = "cc_type")
    protected String ccType;
    @XmlElement(name = "cc_number_enc")
    protected String ccNumberEnc;
    @XmlElement(name = "cc_last4")
    protected String ccLast4;
    @XmlElement(name = "cc_owner")
    protected String ccOwner;
    @XmlElement(name = "cc_exp_month")
    protected String ccExpMonth;
    @XmlElement(name = "cc_exp_year")
    protected String ccExpYear;
    @XmlElement(name = "cc_ss_start_month")
    protected String ccSsStartMonth;
    @XmlElement(name = "cc_ss_start_year")
    protected String ccSsStartYear;
    @XmlElement(name = "payment_id")
    protected String paymentId;

    /**
     * Obtém o valor da propriedade incrementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementId() {
        return incrementId;
    }

    /**
     * Define o valor da propriedade incrementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementId(String value) {
        this.incrementId = value;
    }

    /**
     * Obtém o valor da propriedade parentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Define o valor da propriedade parentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
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
     * Obtém o valor da propriedade isActive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Define o valor da propriedade isActive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Obtém o valor da propriedade amountOrdered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountOrdered() {
        return amountOrdered;
    }

    /**
     * Define o valor da propriedade amountOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountOrdered(String value) {
        this.amountOrdered = value;
    }

    /**
     * Obtém o valor da propriedade shippingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Define o valor da propriedade shippingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAmount(String value) {
        this.shippingAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseAmountOrdered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAmountOrdered() {
        return baseAmountOrdered;
    }

    /**
     * Define o valor da propriedade baseAmountOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAmountOrdered(String value) {
        this.baseAmountOrdered = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingAmount() {
        return baseShippingAmount;
    }

    /**
     * Define o valor da propriedade baseShippingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingAmount(String value) {
        this.baseShippingAmount = value;
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

}
