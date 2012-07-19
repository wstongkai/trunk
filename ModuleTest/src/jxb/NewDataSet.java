//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.29 at 10:00:18 上午 CST 
//


package jxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Table1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VenCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PartsAmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "table1"
})
@XmlRootElement(name = "NewDataSet")
public class NewDataSet {

    @XmlElement(name = "Table1")
    protected List<NewDataSet.Table1> table1;

    /**
     * Gets the value of the table1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the table1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTable1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewDataSet.Table1 }
     * 
     * 
     */
    public List<NewDataSet.Table1> getTable1() {
        if (table1 == null) {
            table1 = new ArrayList<NewDataSet.Table1>();
        }
        return this.table1;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VenCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PartsAmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "venCode",
        "sap",
        "partsAmt"
    })
    public static class Table1 {

        @XmlElement(name = "VenCode")
        protected String venCode;
        @XmlElement(name = "SAP")
        protected String sap;
        @XmlElement(name = "PartsAmt")
        protected Integer partsAmt;

        /**
         * Gets the value of the venCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVenCode() {
            return venCode;
        }

        /**
         * Sets the value of the venCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVenCode(String value) {
            this.venCode = value;
        }

        /**
         * Gets the value of the sap property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSAP() {
            return sap;
        }

        /**
         * Sets the value of the sap property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSAP(String value) {
            this.sap = value;
        }

        /**
         * Gets the value of the partsAmt property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPartsAmt() {
            return partsAmt;
        }

        /**
         * Sets the value of the partsAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPartsAmt(Integer value) {
            this.partsAmt = value;
        }

    }

}