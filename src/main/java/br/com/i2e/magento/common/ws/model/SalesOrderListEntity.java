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
 * <p>Classe Java de salesOrderListEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salesOrderListEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grand_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_paid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_qty_ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_online_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_offline_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_grand_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_paid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_qty_ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_online_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_offline_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_address_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_address_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_to_base_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_to_order_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_to_global_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_to_order_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remote_ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applied_rule_ids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="global_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="store_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quote_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="is_virtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_group_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_note_notify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_is_guest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email_sent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_message_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coupon_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="protect_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_discount_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_tax_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_tax_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_invoiced_cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_tax_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtotal_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtotal_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtotal_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_canceled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="can_ship_partially" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="can_ship_partially_item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edit_increment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forced_do_shipment_with_invoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payment_authorization_expiration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paypal_ipn_customer_notified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quote_address_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustment_negative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustment_positive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_adjustment_negative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_adjustment_positive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_subtotal_incl_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_total_due" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payment_authorization_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_discount_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subtotal_incl_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_due" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_taxvat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discount_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ext_customer_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ext_order_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hold_before_state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hold_before_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="original_increment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relation_child_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relation_child_real_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relation_parent_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relation_parent_real_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="x_forwarded_for" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total_item_count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hidden_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_hidden_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_hidden_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_hidden_tax_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hidden_tax_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_hidden_tax_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hidden_tax_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_hidden_tax_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipping_incl_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_shipping_incl_tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_customer_balance_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_balance_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_customer_balance_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_balance_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_customer_balance_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_balance_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_customer_balance_total_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer_balance_total_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_cards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_gift_cards_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_cards_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_gift_cards_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_cards_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_gift_cards_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gift_cards_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_points_balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_reward_currency_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_currency_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_reward_currency_amount_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_currency_amount_invoiced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="base_reward_currency_amount_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_currency_amount_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_points_balance_refunded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_points_balance_to_refund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reward_salesrule_points" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderListEntity", propOrder = {
    "incrementId",
    "storeId",
    "createdAt",
    "updatedAt",
    "customerId",
    "taxAmount",
    "shippingAmount",
    "discountAmount",
    "subtotal",
    "grandTotal",
    "totalPaid",
    "totalRefunded",
    "totalQtyOrdered",
    "totalCanceled",
    "totalInvoiced",
    "totalOnlineRefunded",
    "totalOfflineRefunded",
    "baseTaxAmount",
    "baseShippingAmount",
    "baseDiscountAmount",
    "baseSubtotal",
    "baseGrandTotal",
    "baseTotalPaid",
    "baseTotalRefunded",
    "baseTotalQtyOrdered",
    "baseTotalCanceled",
    "baseTotalInvoiced",
    "baseTotalOnlineRefunded",
    "baseTotalOfflineRefunded",
    "billingAddressId",
    "billingFirstname",
    "billingLastname",
    "shippingAddressId",
    "shippingFirstname",
    "shippingLastname",
    "billingName",
    "shippingName",
    "storeToBaseRate",
    "storeToOrderRate",
    "baseToGlobalRate",
    "baseToOrderRate",
    "weight",
    "storeName",
    "remoteIp",
    "status",
    "state",
    "appliedRuleIds",
    "globalCurrencyCode",
    "baseCurrencyCode",
    "storeCurrencyCode",
    "orderCurrencyCode",
    "shippingMethod",
    "shippingDescription",
    "customerEmail",
    "customerFirstname",
    "customerLastname",
    "quoteId",
    "isVirtual",
    "customerGroupId",
    "customerNoteNotify",
    "customerIsGuest",
    "emailSent",
    "orderId",
    "giftMessageId",
    "couponCode",
    "protectCode",
    "baseDiscountCanceled",
    "baseDiscountInvoiced",
    "baseDiscountRefunded",
    "baseShippingCanceled",
    "baseShippingInvoiced",
    "baseShippingRefunded",
    "baseShippingTaxAmount",
    "baseShippingTaxRefunded",
    "baseSubtotalCanceled",
    "baseSubtotalInvoiced",
    "baseSubtotalRefunded",
    "baseTaxCanceled",
    "baseTaxInvoiced",
    "baseTaxRefunded",
    "baseTotalInvoicedCost",
    "discountCanceled",
    "discountInvoiced",
    "discountRefunded",
    "shippingCanceled",
    "shippingInvoiced",
    "shippingRefunded",
    "shippingTaxAmount",
    "shippingTaxRefunded",
    "subtotalCanceled",
    "subtotalInvoiced",
    "subtotalRefunded",
    "taxCanceled",
    "taxInvoiced",
    "taxRefunded",
    "canShipPartially",
    "canShipPartiallyItem",
    "editIncrement",
    "forcedDoShipmentWithInvoice",
    "paymentAuthorizationExpiration",
    "paypalIpnCustomerNotified",
    "quoteAddressId",
    "adjustmentNegative",
    "adjustmentPositive",
    "baseAdjustmentNegative",
    "baseAdjustmentPositive",
    "baseShippingDiscountAmount",
    "baseSubtotalInclTax",
    "baseTotalDue",
    "paymentAuthorizationAmount",
    "shippingDiscountAmount",
    "subtotalInclTax",
    "totalDue",
    "customerDob",
    "customerMiddlename",
    "customerPrefix",
    "customerSuffix",
    "customerTaxvat",
    "discountDescription",
    "extCustomerId",
    "extOrderId",
    "holdBeforeState",
    "holdBeforeStatus",
    "originalIncrementId",
    "relationChildId",
    "relationChildRealId",
    "relationParentId",
    "relationParentRealId",
    "xForwardedFor",
    "customerNote",
    "totalItemCount",
    "customerGender",
    "hiddenTaxAmount",
    "baseHiddenTaxAmount",
    "shippingHiddenTaxAmount",
    "baseShippingHiddenTaxAmount",
    "hiddenTaxInvoiced",
    "baseHiddenTaxInvoiced",
    "hiddenTaxRefunded",
    "baseHiddenTaxRefunded",
    "shippingInclTax",
    "baseShippingInclTax",
    "baseCustomerBalanceAmount",
    "customerBalanceAmount",
    "baseCustomerBalanceInvoiced",
    "customerBalanceInvoiced",
    "baseCustomerBalanceRefunded",
    "customerBalanceRefunded",
    "baseCustomerBalanceTotalRefunded",
    "customerBalanceTotalRefunded",
    "giftCards",
    "baseGiftCardsAmount",
    "giftCardsAmount",
    "baseGiftCardsInvoiced",
    "giftCardsInvoiced",
    "baseGiftCardsRefunded",
    "giftCardsRefunded",
    "rewardPointsBalance",
    "baseRewardCurrencyAmount",
    "rewardCurrencyAmount",
    "baseRewardCurrencyAmountInvoiced",
    "rewardCurrencyAmountInvoiced",
    "baseRewardCurrencyAmountRefunded",
    "rewardCurrencyAmountRefunded",
    "rewardPointsBalanceRefunded",
    "rewardPointsBalanceToRefund",
    "rewardSalesrulePoints",
    "firstname",
    "lastname",
    "telephone",
    "postcode"
})
public class SalesOrderListEntity {

    @XmlElement(name = "increment_id")
    protected String incrementId;
    @XmlElement(name = "store_id")
    protected String storeId;
    @XmlElement(name = "created_at")
    protected String createdAt;
    @XmlElement(name = "updated_at")
    protected String updatedAt;
    @XmlElement(name = "customer_id")
    protected String customerId;
    @XmlElement(name = "tax_amount")
    protected String taxAmount;
    @XmlElement(name = "shipping_amount")
    protected String shippingAmount;
    @XmlElement(name = "discount_amount")
    protected String discountAmount;
    protected String subtotal;
    @XmlElement(name = "grand_total")
    protected String grandTotal;
    @XmlElement(name = "total_paid")
    protected String totalPaid;
    @XmlElement(name = "total_refunded")
    protected String totalRefunded;
    @XmlElement(name = "total_qty_ordered")
    protected String totalQtyOrdered;
    @XmlElement(name = "total_canceled")
    protected String totalCanceled;
    @XmlElement(name = "total_invoiced")
    protected String totalInvoiced;
    @XmlElement(name = "total_online_refunded")
    protected String totalOnlineRefunded;
    @XmlElement(name = "total_offline_refunded")
    protected String totalOfflineRefunded;
    @XmlElement(name = "base_tax_amount")
    protected String baseTaxAmount;
    @XmlElement(name = "base_shipping_amount")
    protected String baseShippingAmount;
    @XmlElement(name = "base_discount_amount")
    protected String baseDiscountAmount;
    @XmlElement(name = "base_subtotal")
    protected String baseSubtotal;
    @XmlElement(name = "base_grand_total")
    protected String baseGrandTotal;
    @XmlElement(name = "base_total_paid")
    protected String baseTotalPaid;
    @XmlElement(name = "base_total_refunded")
    protected String baseTotalRefunded;
    @XmlElement(name = "base_total_qty_ordered")
    protected String baseTotalQtyOrdered;
    @XmlElement(name = "base_total_canceled")
    protected String baseTotalCanceled;
    @XmlElement(name = "base_total_invoiced")
    protected String baseTotalInvoiced;
    @XmlElement(name = "base_total_online_refunded")
    protected String baseTotalOnlineRefunded;
    @XmlElement(name = "base_total_offline_refunded")
    protected String baseTotalOfflineRefunded;
    @XmlElement(name = "billing_address_id")
    protected String billingAddressId;
    @XmlElement(name = "billing_firstname")
    protected String billingFirstname;
    @XmlElement(name = "billing_lastname")
    protected String billingLastname;
    @XmlElement(name = "shipping_address_id")
    protected String shippingAddressId;
    @XmlElement(name = "shipping_firstname")
    protected String shippingFirstname;
    @XmlElement(name = "shipping_lastname")
    protected String shippingLastname;
    @XmlElement(name = "billing_name")
    protected String billingName;
    @XmlElement(name = "shipping_name")
    protected String shippingName;
    @XmlElement(name = "store_to_base_rate")
    protected String storeToBaseRate;
    @XmlElement(name = "store_to_order_rate")
    protected String storeToOrderRate;
    @XmlElement(name = "base_to_global_rate")
    protected String baseToGlobalRate;
    @XmlElement(name = "base_to_order_rate")
    protected String baseToOrderRate;
    protected String weight;
    @XmlElement(name = "store_name")
    protected String storeName;
    @XmlElement(name = "remote_ip")
    protected String remoteIp;
    protected String status;
    protected String state;
    @XmlElement(name = "applied_rule_ids")
    protected String appliedRuleIds;
    @XmlElement(name = "global_currency_code")
    protected String globalCurrencyCode;
    @XmlElement(name = "base_currency_code")
    protected String baseCurrencyCode;
    @XmlElement(name = "store_currency_code")
    protected String storeCurrencyCode;
    @XmlElement(name = "order_currency_code")
    protected String orderCurrencyCode;
    @XmlElement(name = "shipping_method")
    protected String shippingMethod;
    @XmlElement(name = "shipping_description")
    protected String shippingDescription;
    @XmlElement(name = "customer_email")
    protected String customerEmail;
    @XmlElement(name = "customer_firstname")
    protected String customerFirstname;
    @XmlElement(name = "customer_lastname")
    protected String customerLastname;
    @XmlElement(name = "quote_id")
    protected String quoteId;
    @XmlElement(name = "is_virtual")
    protected String isVirtual;
    @XmlElement(name = "customer_group_id")
    protected String customerGroupId;
    @XmlElement(name = "customer_note_notify")
    protected String customerNoteNotify;
    @XmlElement(name = "customer_is_guest")
    protected String customerIsGuest;
    @XmlElement(name = "email_sent")
    protected String emailSent;
    @XmlElement(name = "order_id")
    protected String orderId;
    @XmlElement(name = "gift_message_id")
    protected String giftMessageId;
    @XmlElement(name = "coupon_code")
    protected String couponCode;
    @XmlElement(name = "protect_code")
    protected String protectCode;
    @XmlElement(name = "base_discount_canceled")
    protected String baseDiscountCanceled;
    @XmlElement(name = "base_discount_invoiced")
    protected String baseDiscountInvoiced;
    @XmlElement(name = "base_discount_refunded")
    protected String baseDiscountRefunded;
    @XmlElement(name = "base_shipping_canceled")
    protected String baseShippingCanceled;
    @XmlElement(name = "base_shipping_invoiced")
    protected String baseShippingInvoiced;
    @XmlElement(name = "base_shipping_refunded")
    protected String baseShippingRefunded;
    @XmlElement(name = "base_shipping_tax_amount")
    protected String baseShippingTaxAmount;
    @XmlElement(name = "base_shipping_tax_refunded")
    protected String baseShippingTaxRefunded;
    @XmlElement(name = "base_subtotal_canceled")
    protected String baseSubtotalCanceled;
    @XmlElement(name = "base_subtotal_invoiced")
    protected String baseSubtotalInvoiced;
    @XmlElement(name = "base_subtotal_refunded")
    protected String baseSubtotalRefunded;
    @XmlElement(name = "base_tax_canceled")
    protected String baseTaxCanceled;
    @XmlElement(name = "base_tax_invoiced")
    protected String baseTaxInvoiced;
    @XmlElement(name = "base_tax_refunded")
    protected String baseTaxRefunded;
    @XmlElement(name = "base_total_invoiced_cost")
    protected String baseTotalInvoicedCost;
    @XmlElement(name = "discount_canceled")
    protected String discountCanceled;
    @XmlElement(name = "discount_invoiced")
    protected String discountInvoiced;
    @XmlElement(name = "discount_refunded")
    protected String discountRefunded;
    @XmlElement(name = "shipping_canceled")
    protected String shippingCanceled;
    @XmlElement(name = "shipping_invoiced")
    protected String shippingInvoiced;
    @XmlElement(name = "shipping_refunded")
    protected String shippingRefunded;
    @XmlElement(name = "shipping_tax_amount")
    protected String shippingTaxAmount;
    @XmlElement(name = "shipping_tax_refunded")
    protected String shippingTaxRefunded;
    @XmlElement(name = "subtotal_canceled")
    protected String subtotalCanceled;
    @XmlElement(name = "subtotal_invoiced")
    protected String subtotalInvoiced;
    @XmlElement(name = "subtotal_refunded")
    protected String subtotalRefunded;
    @XmlElement(name = "tax_canceled")
    protected String taxCanceled;
    @XmlElement(name = "tax_invoiced")
    protected String taxInvoiced;
    @XmlElement(name = "tax_refunded")
    protected String taxRefunded;
    @XmlElement(name = "can_ship_partially")
    protected String canShipPartially;
    @XmlElement(name = "can_ship_partially_item")
    protected String canShipPartiallyItem;
    @XmlElement(name = "edit_increment")
    protected String editIncrement;
    @XmlElement(name = "forced_do_shipment_with_invoice")
    protected String forcedDoShipmentWithInvoice;
    @XmlElement(name = "payment_authorization_expiration")
    protected String paymentAuthorizationExpiration;
    @XmlElement(name = "paypal_ipn_customer_notified")
    protected String paypalIpnCustomerNotified;
    @XmlElement(name = "quote_address_id")
    protected String quoteAddressId;
    @XmlElement(name = "adjustment_negative")
    protected String adjustmentNegative;
    @XmlElement(name = "adjustment_positive")
    protected String adjustmentPositive;
    @XmlElement(name = "base_adjustment_negative")
    protected String baseAdjustmentNegative;
    @XmlElement(name = "base_adjustment_positive")
    protected String baseAdjustmentPositive;
    @XmlElement(name = "base_shipping_discount_amount")
    protected String baseShippingDiscountAmount;
    @XmlElement(name = "base_subtotal_incl_tax")
    protected String baseSubtotalInclTax;
    @XmlElement(name = "base_total_due")
    protected String baseTotalDue;
    @XmlElement(name = "payment_authorization_amount")
    protected String paymentAuthorizationAmount;
    @XmlElement(name = "shipping_discount_amount")
    protected String shippingDiscountAmount;
    @XmlElement(name = "subtotal_incl_tax")
    protected String subtotalInclTax;
    @XmlElement(name = "total_due")
    protected String totalDue;
    @XmlElement(name = "customer_dob")
    protected String customerDob;
    @XmlElement(name = "customer_middlename")
    protected String customerMiddlename;
    @XmlElement(name = "customer_prefix")
    protected String customerPrefix;
    @XmlElement(name = "customer_suffix")
    protected String customerSuffix;
    @XmlElement(name = "customer_taxvat")
    protected String customerTaxvat;
    @XmlElement(name = "discount_description")
    protected String discountDescription;
    @XmlElement(name = "ext_customer_id")
    protected String extCustomerId;
    @XmlElement(name = "ext_order_id")
    protected String extOrderId;
    @XmlElement(name = "hold_before_state")
    protected String holdBeforeState;
    @XmlElement(name = "hold_before_status")
    protected String holdBeforeStatus;
    @XmlElement(name = "original_increment_id")
    protected String originalIncrementId;
    @XmlElement(name = "relation_child_id")
    protected String relationChildId;
    @XmlElement(name = "relation_child_real_id")
    protected String relationChildRealId;
    @XmlElement(name = "relation_parent_id")
    protected String relationParentId;
    @XmlElement(name = "relation_parent_real_id")
    protected String relationParentRealId;
    @XmlElement(name = "x_forwarded_for")
    protected String xForwardedFor;
    @XmlElement(name = "customer_note")
    protected String customerNote;
    @XmlElement(name = "total_item_count")
    protected String totalItemCount;
    @XmlElement(name = "customer_gender")
    protected String customerGender;
    @XmlElement(name = "hidden_tax_amount")
    protected String hiddenTaxAmount;
    @XmlElement(name = "base_hidden_tax_amount")
    protected String baseHiddenTaxAmount;
    @XmlElement(name = "shipping_hidden_tax_amount")
    protected String shippingHiddenTaxAmount;
    @XmlElement(name = "base_shipping_hidden_tax_amount")
    protected String baseShippingHiddenTaxAmount;
    @XmlElement(name = "hidden_tax_invoiced")
    protected String hiddenTaxInvoiced;
    @XmlElement(name = "base_hidden_tax_invoiced")
    protected String baseHiddenTaxInvoiced;
    @XmlElement(name = "hidden_tax_refunded")
    protected String hiddenTaxRefunded;
    @XmlElement(name = "base_hidden_tax_refunded")
    protected String baseHiddenTaxRefunded;
    @XmlElement(name = "shipping_incl_tax")
    protected String shippingInclTax;
    @XmlElement(name = "base_shipping_incl_tax")
    protected String baseShippingInclTax;
    @XmlElement(name = "base_customer_balance_amount")
    protected String baseCustomerBalanceAmount;
    @XmlElement(name = "customer_balance_amount")
    protected String customerBalanceAmount;
    @XmlElement(name = "base_customer_balance_invoiced")
    protected String baseCustomerBalanceInvoiced;
    @XmlElement(name = "customer_balance_invoiced")
    protected String customerBalanceInvoiced;
    @XmlElement(name = "base_customer_balance_refunded")
    protected String baseCustomerBalanceRefunded;
    @XmlElement(name = "customer_balance_refunded")
    protected String customerBalanceRefunded;
    @XmlElement(name = "base_customer_balance_total_refunded")
    protected String baseCustomerBalanceTotalRefunded;
    @XmlElement(name = "customer_balance_total_refunded")
    protected String customerBalanceTotalRefunded;
    @XmlElement(name = "gift_cards")
    protected String giftCards;
    @XmlElement(name = "base_gift_cards_amount")
    protected String baseGiftCardsAmount;
    @XmlElement(name = "gift_cards_amount")
    protected String giftCardsAmount;
    @XmlElement(name = "base_gift_cards_invoiced")
    protected String baseGiftCardsInvoiced;
    @XmlElement(name = "gift_cards_invoiced")
    protected String giftCardsInvoiced;
    @XmlElement(name = "base_gift_cards_refunded")
    protected String baseGiftCardsRefunded;
    @XmlElement(name = "gift_cards_refunded")
    protected String giftCardsRefunded;
    @XmlElement(name = "reward_points_balance")
    protected String rewardPointsBalance;
    @XmlElement(name = "base_reward_currency_amount")
    protected String baseRewardCurrencyAmount;
    @XmlElement(name = "reward_currency_amount")
    protected String rewardCurrencyAmount;
    @XmlElement(name = "base_reward_currency_amount_invoiced")
    protected String baseRewardCurrencyAmountInvoiced;
    @XmlElement(name = "reward_currency_amount_invoiced")
    protected String rewardCurrencyAmountInvoiced;
    @XmlElement(name = "base_reward_currency_amount_refunded")
    protected String baseRewardCurrencyAmountRefunded;
    @XmlElement(name = "reward_currency_amount_refunded")
    protected String rewardCurrencyAmountRefunded;
    @XmlElement(name = "reward_points_balance_refunded")
    protected String rewardPointsBalanceRefunded;
    @XmlElement(name = "reward_points_balance_to_refund")
    protected String rewardPointsBalanceToRefund;
    @XmlElement(name = "reward_salesrule_points")
    protected String rewardSalesrulePoints;
    protected String firstname;
    protected String lastname;
    protected String telephone;
    protected String postcode;

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
     * Obtém o valor da propriedade storeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Define o valor da propriedade storeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreId(String value) {
        this.storeId = value;
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
     * Obtém o valor da propriedade customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define o valor da propriedade customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Obtém o valor da propriedade taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define o valor da propriedade taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
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
     * Obtém o valor da propriedade discountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define o valor da propriedade discountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Obtém o valor da propriedade subtotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * Define o valor da propriedade subtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal(String value) {
        this.subtotal = value;
    }

    /**
     * Obtém o valor da propriedade grandTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandTotal() {
        return grandTotal;
    }

    /**
     * Define o valor da propriedade grandTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandTotal(String value) {
        this.grandTotal = value;
    }

    /**
     * Obtém o valor da propriedade totalPaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPaid() {
        return totalPaid;
    }

    /**
     * Define o valor da propriedade totalPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPaid(String value) {
        this.totalPaid = value;
    }

    /**
     * Obtém o valor da propriedade totalRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRefunded() {
        return totalRefunded;
    }

    /**
     * Define o valor da propriedade totalRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRefunded(String value) {
        this.totalRefunded = value;
    }

    /**
     * Obtém o valor da propriedade totalQtyOrdered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalQtyOrdered() {
        return totalQtyOrdered;
    }

    /**
     * Define o valor da propriedade totalQtyOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalQtyOrdered(String value) {
        this.totalQtyOrdered = value;
    }

    /**
     * Obtém o valor da propriedade totalCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCanceled() {
        return totalCanceled;
    }

    /**
     * Define o valor da propriedade totalCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCanceled(String value) {
        this.totalCanceled = value;
    }

    /**
     * Obtém o valor da propriedade totalInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalInvoiced() {
        return totalInvoiced;
    }

    /**
     * Define o valor da propriedade totalInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalInvoiced(String value) {
        this.totalInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade totalOnlineRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOnlineRefunded() {
        return totalOnlineRefunded;
    }

    /**
     * Define o valor da propriedade totalOnlineRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOnlineRefunded(String value) {
        this.totalOnlineRefunded = value;
    }

    /**
     * Obtém o valor da propriedade totalOfflineRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOfflineRefunded() {
        return totalOfflineRefunded;
    }

    /**
     * Define o valor da propriedade totalOfflineRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOfflineRefunded(String value) {
        this.totalOfflineRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTaxAmount() {
        return baseTaxAmount;
    }

    /**
     * Define o valor da propriedade baseTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTaxAmount(String value) {
        this.baseTaxAmount = value;
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
     * Obtém o valor da propriedade baseDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    /**
     * Define o valor da propriedade baseDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDiscountAmount(String value) {
        this.baseDiscountAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseSubtotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSubtotal() {
        return baseSubtotal;
    }

    /**
     * Define o valor da propriedade baseSubtotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSubtotal(String value) {
        this.baseSubtotal = value;
    }

    /**
     * Obtém o valor da propriedade baseGrandTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseGrandTotal() {
        return baseGrandTotal;
    }

    /**
     * Define o valor da propriedade baseGrandTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseGrandTotal(String value) {
        this.baseGrandTotal = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalPaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalPaid() {
        return baseTotalPaid;
    }

    /**
     * Define o valor da propriedade baseTotalPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalPaid(String value) {
        this.baseTotalPaid = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalRefunded() {
        return baseTotalRefunded;
    }

    /**
     * Define o valor da propriedade baseTotalRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalRefunded(String value) {
        this.baseTotalRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalQtyOrdered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalQtyOrdered() {
        return baseTotalQtyOrdered;
    }

    /**
     * Define o valor da propriedade baseTotalQtyOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalQtyOrdered(String value) {
        this.baseTotalQtyOrdered = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalCanceled() {
        return baseTotalCanceled;
    }

    /**
     * Define o valor da propriedade baseTotalCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalCanceled(String value) {
        this.baseTotalCanceled = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalInvoiced() {
        return baseTotalInvoiced;
    }

    /**
     * Define o valor da propriedade baseTotalInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalInvoiced(String value) {
        this.baseTotalInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalOnlineRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalOnlineRefunded() {
        return baseTotalOnlineRefunded;
    }

    /**
     * Define o valor da propriedade baseTotalOnlineRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalOnlineRefunded(String value) {
        this.baseTotalOnlineRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalOfflineRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalOfflineRefunded() {
        return baseTotalOfflineRefunded;
    }

    /**
     * Define o valor da propriedade baseTotalOfflineRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalOfflineRefunded(String value) {
        this.baseTotalOfflineRefunded = value;
    }

    /**
     * Obtém o valor da propriedade billingAddressId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressId() {
        return billingAddressId;
    }

    /**
     * Define o valor da propriedade billingAddressId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressId(String value) {
        this.billingAddressId = value;
    }

    /**
     * Obtém o valor da propriedade billingFirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingFirstname() {
        return billingFirstname;
    }

    /**
     * Define o valor da propriedade billingFirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingFirstname(String value) {
        this.billingFirstname = value;
    }

    /**
     * Obtém o valor da propriedade billingLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingLastname() {
        return billingLastname;
    }

    /**
     * Define o valor da propriedade billingLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingLastname(String value) {
        this.billingLastname = value;
    }

    /**
     * Obtém o valor da propriedade shippingAddressId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressId() {
        return shippingAddressId;
    }

    /**
     * Define o valor da propriedade shippingAddressId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressId(String value) {
        this.shippingAddressId = value;
    }

    /**
     * Obtém o valor da propriedade shippingFirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingFirstname() {
        return shippingFirstname;
    }

    /**
     * Define o valor da propriedade shippingFirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingFirstname(String value) {
        this.shippingFirstname = value;
    }

    /**
     * Obtém o valor da propriedade shippingLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingLastname() {
        return shippingLastname;
    }

    /**
     * Define o valor da propriedade shippingLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingLastname(String value) {
        this.shippingLastname = value;
    }

    /**
     * Obtém o valor da propriedade billingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingName() {
        return billingName;
    }

    /**
     * Define o valor da propriedade billingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingName(String value) {
        this.billingName = value;
    }

    /**
     * Obtém o valor da propriedade shippingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * Define o valor da propriedade shippingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingName(String value) {
        this.shippingName = value;
    }

    /**
     * Obtém o valor da propriedade storeToBaseRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreToBaseRate() {
        return storeToBaseRate;
    }

    /**
     * Define o valor da propriedade storeToBaseRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreToBaseRate(String value) {
        this.storeToBaseRate = value;
    }

    /**
     * Obtém o valor da propriedade storeToOrderRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreToOrderRate() {
        return storeToOrderRate;
    }

    /**
     * Define o valor da propriedade storeToOrderRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreToOrderRate(String value) {
        this.storeToOrderRate = value;
    }

    /**
     * Obtém o valor da propriedade baseToGlobalRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    /**
     * Define o valor da propriedade baseToGlobalRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseToGlobalRate(String value) {
        this.baseToGlobalRate = value;
    }

    /**
     * Obtém o valor da propriedade baseToOrderRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseToOrderRate() {
        return baseToOrderRate;
    }

    /**
     * Define o valor da propriedade baseToOrderRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseToOrderRate(String value) {
        this.baseToOrderRate = value;
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
     * Obtém o valor da propriedade storeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Define o valor da propriedade storeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Obtém o valor da propriedade remoteIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIp() {
        return remoteIp;
    }

    /**
     * Define o valor da propriedade remoteIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIp(String value) {
        this.remoteIp = value;
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
     * Obtém o valor da propriedade state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define o valor da propriedade state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtém o valor da propriedade appliedRuleIds.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedRuleIds() {
        return appliedRuleIds;
    }

    /**
     * Define o valor da propriedade appliedRuleIds.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedRuleIds(String value) {
        this.appliedRuleIds = value;
    }

    /**
     * Obtém o valor da propriedade globalCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCurrencyCode() {
        return globalCurrencyCode;
    }

    /**
     * Define o valor da propriedade globalCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCurrencyCode(String value) {
        this.globalCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade baseCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    /**
     * Define o valor da propriedade baseCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrencyCode(String value) {
        this.baseCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade storeCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    /**
     * Define o valor da propriedade storeCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCurrencyCode(String value) {
        this.storeCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade orderCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCurrencyCode() {
        return orderCurrencyCode;
    }

    /**
     * Define o valor da propriedade orderCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCurrencyCode(String value) {
        this.orderCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade shippingMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Define o valor da propriedade shippingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Obtém o valor da propriedade shippingDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDescription() {
        return shippingDescription;
    }

    /**
     * Define o valor da propriedade shippingDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDescription(String value) {
        this.shippingDescription = value;
    }

    /**
     * Obtém o valor da propriedade customerEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Define o valor da propriedade customerEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Obtém o valor da propriedade customerFirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstname() {
        return customerFirstname;
    }

    /**
     * Define o valor da propriedade customerFirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstname(String value) {
        this.customerFirstname = value;
    }

    /**
     * Obtém o valor da propriedade customerLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastname() {
        return customerLastname;
    }

    /**
     * Define o valor da propriedade customerLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastname(String value) {
        this.customerLastname = value;
    }

    /**
     * Obtém o valor da propriedade quoteId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId() {
        return quoteId;
    }

    /**
     * Define o valor da propriedade quoteId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId(String value) {
        this.quoteId = value;
    }

    /**
     * Obtém o valor da propriedade isVirtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVirtual() {
        return isVirtual;
    }

    /**
     * Define o valor da propriedade isVirtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVirtual(String value) {
        this.isVirtual = value;
    }

    /**
     * Obtém o valor da propriedade customerGroupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGroupId() {
        return customerGroupId;
    }

    /**
     * Define o valor da propriedade customerGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGroupId(String value) {
        this.customerGroupId = value;
    }

    /**
     * Obtém o valor da propriedade customerNoteNotify.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNoteNotify() {
        return customerNoteNotify;
    }

    /**
     * Define o valor da propriedade customerNoteNotify.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNoteNotify(String value) {
        this.customerNoteNotify = value;
    }

    /**
     * Obtém o valor da propriedade customerIsGuest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIsGuest() {
        return customerIsGuest;
    }

    /**
     * Define o valor da propriedade customerIsGuest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIsGuest(String value) {
        this.customerIsGuest = value;
    }

    /**
     * Obtém o valor da propriedade emailSent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSent() {
        return emailSent;
    }

    /**
     * Define o valor da propriedade emailSent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSent(String value) {
        this.emailSent = value;
    }

    /**
     * Obtém o valor da propriedade orderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Define o valor da propriedade orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Obtém o valor da propriedade giftMessageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessageId() {
        return giftMessageId;
    }

    /**
     * Define o valor da propriedade giftMessageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftMessageId(String value) {
        this.giftMessageId = value;
    }

    /**
     * Obtém o valor da propriedade couponCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Define o valor da propriedade couponCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
    }

    /**
     * Obtém o valor da propriedade protectCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectCode() {
        return protectCode;
    }

    /**
     * Define o valor da propriedade protectCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectCode(String value) {
        this.protectCode = value;
    }

    /**
     * Obtém o valor da propriedade baseDiscountCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDiscountCanceled() {
        return baseDiscountCanceled;
    }

    /**
     * Define o valor da propriedade baseDiscountCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDiscountCanceled(String value) {
        this.baseDiscountCanceled = value;
    }

    /**
     * Obtém o valor da propriedade baseDiscountInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDiscountInvoiced() {
        return baseDiscountInvoiced;
    }

    /**
     * Define o valor da propriedade baseDiscountInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDiscountInvoiced(String value) {
        this.baseDiscountInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseDiscountRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDiscountRefunded() {
        return baseDiscountRefunded;
    }

    /**
     * Define o valor da propriedade baseDiscountRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDiscountRefunded(String value) {
        this.baseDiscountRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingCanceled() {
        return baseShippingCanceled;
    }

    /**
     * Define o valor da propriedade baseShippingCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingCanceled(String value) {
        this.baseShippingCanceled = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingInvoiced() {
        return baseShippingInvoiced;
    }

    /**
     * Define o valor da propriedade baseShippingInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingInvoiced(String value) {
        this.baseShippingInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingRefunded() {
        return baseShippingRefunded;
    }

    /**
     * Define o valor da propriedade baseShippingRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingRefunded(String value) {
        this.baseShippingRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingTaxAmount() {
        return baseShippingTaxAmount;
    }

    /**
     * Define o valor da propriedade baseShippingTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingTaxAmount(String value) {
        this.baseShippingTaxAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingTaxRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingTaxRefunded() {
        return baseShippingTaxRefunded;
    }

    /**
     * Define o valor da propriedade baseShippingTaxRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingTaxRefunded(String value) {
        this.baseShippingTaxRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseSubtotalCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSubtotalCanceled() {
        return baseSubtotalCanceled;
    }

    /**
     * Define o valor da propriedade baseSubtotalCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSubtotalCanceled(String value) {
        this.baseSubtotalCanceled = value;
    }

    /**
     * Obtém o valor da propriedade baseSubtotalInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSubtotalInvoiced() {
        return baseSubtotalInvoiced;
    }

    /**
     * Define o valor da propriedade baseSubtotalInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSubtotalInvoiced(String value) {
        this.baseSubtotalInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseSubtotalRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSubtotalRefunded() {
        return baseSubtotalRefunded;
    }

    /**
     * Define o valor da propriedade baseSubtotalRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSubtotalRefunded(String value) {
        this.baseSubtotalRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseTaxCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTaxCanceled() {
        return baseTaxCanceled;
    }

    /**
     * Define o valor da propriedade baseTaxCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTaxCanceled(String value) {
        this.baseTaxCanceled = value;
    }

    /**
     * Obtém o valor da propriedade baseTaxInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTaxInvoiced() {
        return baseTaxInvoiced;
    }

    /**
     * Define o valor da propriedade baseTaxInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTaxInvoiced(String value) {
        this.baseTaxInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseTaxRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTaxRefunded() {
        return baseTaxRefunded;
    }

    /**
     * Define o valor da propriedade baseTaxRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTaxRefunded(String value) {
        this.baseTaxRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalInvoicedCost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalInvoicedCost() {
        return baseTotalInvoicedCost;
    }

    /**
     * Define o valor da propriedade baseTotalInvoicedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalInvoicedCost(String value) {
        this.baseTotalInvoicedCost = value;
    }

    /**
     * Obtém o valor da propriedade discountCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCanceled() {
        return discountCanceled;
    }

    /**
     * Define o valor da propriedade discountCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCanceled(String value) {
        this.discountCanceled = value;
    }

    /**
     * Obtém o valor da propriedade discountInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountInvoiced() {
        return discountInvoiced;
    }

    /**
     * Define o valor da propriedade discountInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountInvoiced(String value) {
        this.discountInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade discountRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountRefunded() {
        return discountRefunded;
    }

    /**
     * Define o valor da propriedade discountRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountRefunded(String value) {
        this.discountRefunded = value;
    }

    /**
     * Obtém o valor da propriedade shippingCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCanceled() {
        return shippingCanceled;
    }

    /**
     * Define o valor da propriedade shippingCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCanceled(String value) {
        this.shippingCanceled = value;
    }

    /**
     * Obtém o valor da propriedade shippingInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingInvoiced() {
        return shippingInvoiced;
    }

    /**
     * Define o valor da propriedade shippingInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingInvoiced(String value) {
        this.shippingInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade shippingRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingRefunded() {
        return shippingRefunded;
    }

    /**
     * Define o valor da propriedade shippingRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingRefunded(String value) {
        this.shippingRefunded = value;
    }

    /**
     * Obtém o valor da propriedade shippingTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTaxAmount() {
        return shippingTaxAmount;
    }

    /**
     * Define o valor da propriedade shippingTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTaxAmount(String value) {
        this.shippingTaxAmount = value;
    }

    /**
     * Obtém o valor da propriedade shippingTaxRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTaxRefunded() {
        return shippingTaxRefunded;
    }

    /**
     * Define o valor da propriedade shippingTaxRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTaxRefunded(String value) {
        this.shippingTaxRefunded = value;
    }

    /**
     * Obtém o valor da propriedade subtotalCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalCanceled() {
        return subtotalCanceled;
    }

    /**
     * Define o valor da propriedade subtotalCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalCanceled(String value) {
        this.subtotalCanceled = value;
    }

    /**
     * Obtém o valor da propriedade subtotalInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalInvoiced() {
        return subtotalInvoiced;
    }

    /**
     * Define o valor da propriedade subtotalInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalInvoiced(String value) {
        this.subtotalInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade subtotalRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalRefunded() {
        return subtotalRefunded;
    }

    /**
     * Define o valor da propriedade subtotalRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalRefunded(String value) {
        this.subtotalRefunded = value;
    }

    /**
     * Obtém o valor da propriedade taxCanceled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCanceled() {
        return taxCanceled;
    }

    /**
     * Define o valor da propriedade taxCanceled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCanceled(String value) {
        this.taxCanceled = value;
    }

    /**
     * Obtém o valor da propriedade taxInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInvoiced() {
        return taxInvoiced;
    }

    /**
     * Define o valor da propriedade taxInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInvoiced(String value) {
        this.taxInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade taxRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRefunded() {
        return taxRefunded;
    }

    /**
     * Define o valor da propriedade taxRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRefunded(String value) {
        this.taxRefunded = value;
    }

    /**
     * Obtém o valor da propriedade canShipPartially.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanShipPartially() {
        return canShipPartially;
    }

    /**
     * Define o valor da propriedade canShipPartially.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanShipPartially(String value) {
        this.canShipPartially = value;
    }

    /**
     * Obtém o valor da propriedade canShipPartiallyItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanShipPartiallyItem() {
        return canShipPartiallyItem;
    }

    /**
     * Define o valor da propriedade canShipPartiallyItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanShipPartiallyItem(String value) {
        this.canShipPartiallyItem = value;
    }

    /**
     * Obtém o valor da propriedade editIncrement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditIncrement() {
        return editIncrement;
    }

    /**
     * Define o valor da propriedade editIncrement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditIncrement(String value) {
        this.editIncrement = value;
    }

    /**
     * Obtém o valor da propriedade forcedDoShipmentWithInvoice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcedDoShipmentWithInvoice() {
        return forcedDoShipmentWithInvoice;
    }

    /**
     * Define o valor da propriedade forcedDoShipmentWithInvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcedDoShipmentWithInvoice(String value) {
        this.forcedDoShipmentWithInvoice = value;
    }

    /**
     * Obtém o valor da propriedade paymentAuthorizationExpiration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAuthorizationExpiration() {
        return paymentAuthorizationExpiration;
    }

    /**
     * Define o valor da propriedade paymentAuthorizationExpiration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAuthorizationExpiration(String value) {
        this.paymentAuthorizationExpiration = value;
    }

    /**
     * Obtém o valor da propriedade paypalIpnCustomerNotified.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalIpnCustomerNotified() {
        return paypalIpnCustomerNotified;
    }

    /**
     * Define o valor da propriedade paypalIpnCustomerNotified.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalIpnCustomerNotified(String value) {
        this.paypalIpnCustomerNotified = value;
    }

    /**
     * Obtém o valor da propriedade quoteAddressId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteAddressId() {
        return quoteAddressId;
    }

    /**
     * Define o valor da propriedade quoteAddressId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteAddressId(String value) {
        this.quoteAddressId = value;
    }

    /**
     * Obtém o valor da propriedade adjustmentNegative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentNegative() {
        return adjustmentNegative;
    }

    /**
     * Define o valor da propriedade adjustmentNegative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentNegative(String value) {
        this.adjustmentNegative = value;
    }

    /**
     * Obtém o valor da propriedade adjustmentPositive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentPositive() {
        return adjustmentPositive;
    }

    /**
     * Define o valor da propriedade adjustmentPositive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentPositive(String value) {
        this.adjustmentPositive = value;
    }

    /**
     * Obtém o valor da propriedade baseAdjustmentNegative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAdjustmentNegative() {
        return baseAdjustmentNegative;
    }

    /**
     * Define o valor da propriedade baseAdjustmentNegative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAdjustmentNegative(String value) {
        this.baseAdjustmentNegative = value;
    }

    /**
     * Obtém o valor da propriedade baseAdjustmentPositive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAdjustmentPositive() {
        return baseAdjustmentPositive;
    }

    /**
     * Define o valor da propriedade baseAdjustmentPositive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAdjustmentPositive(String value) {
        this.baseAdjustmentPositive = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingDiscountAmount() {
        return baseShippingDiscountAmount;
    }

    /**
     * Define o valor da propriedade baseShippingDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingDiscountAmount(String value) {
        this.baseShippingDiscountAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseSubtotalInclTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseSubtotalInclTax() {
        return baseSubtotalInclTax;
    }

    /**
     * Define o valor da propriedade baseSubtotalInclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseSubtotalInclTax(String value) {
        this.baseSubtotalInclTax = value;
    }

    /**
     * Obtém o valor da propriedade baseTotalDue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTotalDue() {
        return baseTotalDue;
    }

    /**
     * Define o valor da propriedade baseTotalDue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTotalDue(String value) {
        this.baseTotalDue = value;
    }

    /**
     * Obtém o valor da propriedade paymentAuthorizationAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAuthorizationAmount() {
        return paymentAuthorizationAmount;
    }

    /**
     * Define o valor da propriedade paymentAuthorizationAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAuthorizationAmount(String value) {
        this.paymentAuthorizationAmount = value;
    }

    /**
     * Obtém o valor da propriedade shippingDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    /**
     * Define o valor da propriedade shippingDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDiscountAmount(String value) {
        this.shippingDiscountAmount = value;
    }

    /**
     * Obtém o valor da propriedade subtotalInclTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotalInclTax() {
        return subtotalInclTax;
    }

    /**
     * Define o valor da propriedade subtotalInclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotalInclTax(String value) {
        this.subtotalInclTax = value;
    }

    /**
     * Obtém o valor da propriedade totalDue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDue() {
        return totalDue;
    }

    /**
     * Define o valor da propriedade totalDue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDue(String value) {
        this.totalDue = value;
    }

    /**
     * Obtém o valor da propriedade customerDob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDob() {
        return customerDob;
    }

    /**
     * Define o valor da propriedade customerDob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDob(String value) {
        this.customerDob = value;
    }

    /**
     * Obtém o valor da propriedade customerMiddlename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMiddlename() {
        return customerMiddlename;
    }

    /**
     * Define o valor da propriedade customerMiddlename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMiddlename(String value) {
        this.customerMiddlename = value;
    }

    /**
     * Obtém o valor da propriedade customerPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPrefix() {
        return customerPrefix;
    }

    /**
     * Define o valor da propriedade customerPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPrefix(String value) {
        this.customerPrefix = value;
    }

    /**
     * Obtém o valor da propriedade customerSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSuffix() {
        return customerSuffix;
    }

    /**
     * Define o valor da propriedade customerSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSuffix(String value) {
        this.customerSuffix = value;
    }

    /**
     * Obtém o valor da propriedade customerTaxvat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxvat() {
        return customerTaxvat;
    }

    /**
     * Define o valor da propriedade customerTaxvat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxvat(String value) {
        this.customerTaxvat = value;
    }

    /**
     * Obtém o valor da propriedade discountDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountDescription() {
        return discountDescription;
    }

    /**
     * Define o valor da propriedade discountDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountDescription(String value) {
        this.discountDescription = value;
    }

    /**
     * Obtém o valor da propriedade extCustomerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCustomerId() {
        return extCustomerId;
    }

    /**
     * Define o valor da propriedade extCustomerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCustomerId(String value) {
        this.extCustomerId = value;
    }

    /**
     * Obtém o valor da propriedade extOrderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtOrderId() {
        return extOrderId;
    }

    /**
     * Define o valor da propriedade extOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtOrderId(String value) {
        this.extOrderId = value;
    }

    /**
     * Obtém o valor da propriedade holdBeforeState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldBeforeState() {
        return holdBeforeState;
    }

    /**
     * Define o valor da propriedade holdBeforeState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldBeforeState(String value) {
        this.holdBeforeState = value;
    }

    /**
     * Obtém o valor da propriedade holdBeforeStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldBeforeStatus() {
        return holdBeforeStatus;
    }

    /**
     * Define o valor da propriedade holdBeforeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldBeforeStatus(String value) {
        this.holdBeforeStatus = value;
    }

    /**
     * Obtém o valor da propriedade originalIncrementId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalIncrementId() {
        return originalIncrementId;
    }

    /**
     * Define o valor da propriedade originalIncrementId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalIncrementId(String value) {
        this.originalIncrementId = value;
    }

    /**
     * Obtém o valor da propriedade relationChildId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationChildId() {
        return relationChildId;
    }

    /**
     * Define o valor da propriedade relationChildId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationChildId(String value) {
        this.relationChildId = value;
    }

    /**
     * Obtém o valor da propriedade relationChildRealId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationChildRealId() {
        return relationChildRealId;
    }

    /**
     * Define o valor da propriedade relationChildRealId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationChildRealId(String value) {
        this.relationChildRealId = value;
    }

    /**
     * Obtém o valor da propriedade relationParentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationParentId() {
        return relationParentId;
    }

    /**
     * Define o valor da propriedade relationParentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationParentId(String value) {
        this.relationParentId = value;
    }

    /**
     * Obtém o valor da propriedade relationParentRealId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationParentRealId() {
        return relationParentRealId;
    }

    /**
     * Define o valor da propriedade relationParentRealId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationParentRealId(String value) {
        this.relationParentRealId = value;
    }

    /**
     * Obtém o valor da propriedade xForwardedFor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXForwardedFor() {
        return xForwardedFor;
    }

    /**
     * Define o valor da propriedade xForwardedFor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXForwardedFor(String value) {
        this.xForwardedFor = value;
    }

    /**
     * Obtém o valor da propriedade customerNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNote() {
        return customerNote;
    }

    /**
     * Define o valor da propriedade customerNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNote(String value) {
        this.customerNote = value;
    }

    /**
     * Obtém o valor da propriedade totalItemCount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalItemCount() {
        return totalItemCount;
    }

    /**
     * Define o valor da propriedade totalItemCount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalItemCount(String value) {
        this.totalItemCount = value;
    }

    /**
     * Obtém o valor da propriedade customerGender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGender() {
        return customerGender;
    }

    /**
     * Define o valor da propriedade customerGender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGender(String value) {
        this.customerGender = value;
    }

    /**
     * Obtém o valor da propriedade hiddenTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenTaxAmount() {
        return hiddenTaxAmount;
    }

    /**
     * Define o valor da propriedade hiddenTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenTaxAmount(String value) {
        this.hiddenTaxAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseHiddenTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseHiddenTaxAmount() {
        return baseHiddenTaxAmount;
    }

    /**
     * Define o valor da propriedade baseHiddenTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseHiddenTaxAmount(String value) {
        this.baseHiddenTaxAmount = value;
    }

    /**
     * Obtém o valor da propriedade shippingHiddenTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingHiddenTaxAmount() {
        return shippingHiddenTaxAmount;
    }

    /**
     * Define o valor da propriedade shippingHiddenTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingHiddenTaxAmount(String value) {
        this.shippingHiddenTaxAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingHiddenTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingHiddenTaxAmount() {
        return baseShippingHiddenTaxAmount;
    }

    /**
     * Define o valor da propriedade baseShippingHiddenTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingHiddenTaxAmount(String value) {
        this.baseShippingHiddenTaxAmount = value;
    }

    /**
     * Obtém o valor da propriedade hiddenTaxInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenTaxInvoiced() {
        return hiddenTaxInvoiced;
    }

    /**
     * Define o valor da propriedade hiddenTaxInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenTaxInvoiced(String value) {
        this.hiddenTaxInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseHiddenTaxInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseHiddenTaxInvoiced() {
        return baseHiddenTaxInvoiced;
    }

    /**
     * Define o valor da propriedade baseHiddenTaxInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseHiddenTaxInvoiced(String value) {
        this.baseHiddenTaxInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade hiddenTaxRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenTaxRefunded() {
        return hiddenTaxRefunded;
    }

    /**
     * Define o valor da propriedade hiddenTaxRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenTaxRefunded(String value) {
        this.hiddenTaxRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseHiddenTaxRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseHiddenTaxRefunded() {
        return baseHiddenTaxRefunded;
    }

    /**
     * Define o valor da propriedade baseHiddenTaxRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseHiddenTaxRefunded(String value) {
        this.baseHiddenTaxRefunded = value;
    }

    /**
     * Obtém o valor da propriedade shippingInclTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingInclTax() {
        return shippingInclTax;
    }

    /**
     * Define o valor da propriedade shippingInclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingInclTax(String value) {
        this.shippingInclTax = value;
    }

    /**
     * Obtém o valor da propriedade baseShippingInclTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseShippingInclTax() {
        return baseShippingInclTax;
    }

    /**
     * Define o valor da propriedade baseShippingInclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseShippingInclTax(String value) {
        this.baseShippingInclTax = value;
    }

    /**
     * Obtém o valor da propriedade baseCustomerBalanceAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCustomerBalanceAmount() {
        return baseCustomerBalanceAmount;
    }

    /**
     * Define o valor da propriedade baseCustomerBalanceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCustomerBalanceAmount(String value) {
        this.baseCustomerBalanceAmount = value;
    }

    /**
     * Obtém o valor da propriedade customerBalanceAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBalanceAmount() {
        return customerBalanceAmount;
    }

    /**
     * Define o valor da propriedade customerBalanceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBalanceAmount(String value) {
        this.customerBalanceAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseCustomerBalanceInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCustomerBalanceInvoiced() {
        return baseCustomerBalanceInvoiced;
    }

    /**
     * Define o valor da propriedade baseCustomerBalanceInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCustomerBalanceInvoiced(String value) {
        this.baseCustomerBalanceInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade customerBalanceInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBalanceInvoiced() {
        return customerBalanceInvoiced;
    }

    /**
     * Define o valor da propriedade customerBalanceInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBalanceInvoiced(String value) {
        this.customerBalanceInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseCustomerBalanceRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCustomerBalanceRefunded() {
        return baseCustomerBalanceRefunded;
    }

    /**
     * Define o valor da propriedade baseCustomerBalanceRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCustomerBalanceRefunded(String value) {
        this.baseCustomerBalanceRefunded = value;
    }

    /**
     * Obtém o valor da propriedade customerBalanceRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBalanceRefunded() {
        return customerBalanceRefunded;
    }

    /**
     * Define o valor da propriedade customerBalanceRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBalanceRefunded(String value) {
        this.customerBalanceRefunded = value;
    }

    /**
     * Obtém o valor da propriedade baseCustomerBalanceTotalRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCustomerBalanceTotalRefunded() {
        return baseCustomerBalanceTotalRefunded;
    }

    /**
     * Define o valor da propriedade baseCustomerBalanceTotalRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCustomerBalanceTotalRefunded(String value) {
        this.baseCustomerBalanceTotalRefunded = value;
    }

    /**
     * Obtém o valor da propriedade customerBalanceTotalRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBalanceTotalRefunded() {
        return customerBalanceTotalRefunded;
    }

    /**
     * Define o valor da propriedade customerBalanceTotalRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBalanceTotalRefunded(String value) {
        this.customerBalanceTotalRefunded = value;
    }

    /**
     * Obtém o valor da propriedade giftCards.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCards() {
        return giftCards;
    }

    /**
     * Define o valor da propriedade giftCards.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCards(String value) {
        this.giftCards = value;
    }

    /**
     * Obtém o valor da propriedade baseGiftCardsAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseGiftCardsAmount() {
        return baseGiftCardsAmount;
    }

    /**
     * Define o valor da propriedade baseGiftCardsAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseGiftCardsAmount(String value) {
        this.baseGiftCardsAmount = value;
    }

    /**
     * Obtém o valor da propriedade giftCardsAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardsAmount() {
        return giftCardsAmount;
    }

    /**
     * Define o valor da propriedade giftCardsAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardsAmount(String value) {
        this.giftCardsAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseGiftCardsInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseGiftCardsInvoiced() {
        return baseGiftCardsInvoiced;
    }

    /**
     * Define o valor da propriedade baseGiftCardsInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseGiftCardsInvoiced(String value) {
        this.baseGiftCardsInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade giftCardsInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardsInvoiced() {
        return giftCardsInvoiced;
    }

    /**
     * Define o valor da propriedade giftCardsInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardsInvoiced(String value) {
        this.giftCardsInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseGiftCardsRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseGiftCardsRefunded() {
        return baseGiftCardsRefunded;
    }

    /**
     * Define o valor da propriedade baseGiftCardsRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseGiftCardsRefunded(String value) {
        this.baseGiftCardsRefunded = value;
    }

    /**
     * Obtém o valor da propriedade giftCardsRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardsRefunded() {
        return giftCardsRefunded;
    }

    /**
     * Define o valor da propriedade giftCardsRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardsRefunded(String value) {
        this.giftCardsRefunded = value;
    }

    /**
     * Obtém o valor da propriedade rewardPointsBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardPointsBalance() {
        return rewardPointsBalance;
    }

    /**
     * Define o valor da propriedade rewardPointsBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardPointsBalance(String value) {
        this.rewardPointsBalance = value;
    }

    /**
     * Obtém o valor da propriedade baseRewardCurrencyAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRewardCurrencyAmount() {
        return baseRewardCurrencyAmount;
    }

    /**
     * Define o valor da propriedade baseRewardCurrencyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRewardCurrencyAmount(String value) {
        this.baseRewardCurrencyAmount = value;
    }

    /**
     * Obtém o valor da propriedade rewardCurrencyAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCurrencyAmount() {
        return rewardCurrencyAmount;
    }

    /**
     * Define o valor da propriedade rewardCurrencyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCurrencyAmount(String value) {
        this.rewardCurrencyAmount = value;
    }

    /**
     * Obtém o valor da propriedade baseRewardCurrencyAmountInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRewardCurrencyAmountInvoiced() {
        return baseRewardCurrencyAmountInvoiced;
    }

    /**
     * Define o valor da propriedade baseRewardCurrencyAmountInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRewardCurrencyAmountInvoiced(String value) {
        this.baseRewardCurrencyAmountInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade rewardCurrencyAmountInvoiced.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCurrencyAmountInvoiced() {
        return rewardCurrencyAmountInvoiced;
    }

    /**
     * Define o valor da propriedade rewardCurrencyAmountInvoiced.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCurrencyAmountInvoiced(String value) {
        this.rewardCurrencyAmountInvoiced = value;
    }

    /**
     * Obtém o valor da propriedade baseRewardCurrencyAmountRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRewardCurrencyAmountRefunded() {
        return baseRewardCurrencyAmountRefunded;
    }

    /**
     * Define o valor da propriedade baseRewardCurrencyAmountRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRewardCurrencyAmountRefunded(String value) {
        this.baseRewardCurrencyAmountRefunded = value;
    }

    /**
     * Obtém o valor da propriedade rewardCurrencyAmountRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardCurrencyAmountRefunded() {
        return rewardCurrencyAmountRefunded;
    }

    /**
     * Define o valor da propriedade rewardCurrencyAmountRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardCurrencyAmountRefunded(String value) {
        this.rewardCurrencyAmountRefunded = value;
    }

    /**
     * Obtém o valor da propriedade rewardPointsBalanceRefunded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardPointsBalanceRefunded() {
        return rewardPointsBalanceRefunded;
    }

    /**
     * Define o valor da propriedade rewardPointsBalanceRefunded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardPointsBalanceRefunded(String value) {
        this.rewardPointsBalanceRefunded = value;
    }

    /**
     * Obtém o valor da propriedade rewardPointsBalanceToRefund.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardPointsBalanceToRefund() {
        return rewardPointsBalanceToRefund;
    }

    /**
     * Define o valor da propriedade rewardPointsBalanceToRefund.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardPointsBalanceToRefund(String value) {
        this.rewardPointsBalanceToRefund = value;
    }

    /**
     * Obtém o valor da propriedade rewardSalesrulePoints.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardSalesrulePoints() {
        return rewardSalesrulePoints;
    }

    /**
     * Define o valor da propriedade rewardSalesrulePoints.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardSalesrulePoints(String value) {
        this.rewardSalesrulePoints = value;
    }

    /**
     * Obtém o valor da propriedade firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Define o valor da propriedade firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Obtém o valor da propriedade lastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Define o valor da propriedade lastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Obtém o valor da propriedade telephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Define o valor da propriedade telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Obtém o valor da propriedade postcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Define o valor da propriedade postcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

}
