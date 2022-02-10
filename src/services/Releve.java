/**
 * Releve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

import java.util.Arrays;

public class Releve  implements java.io.Serializable {
    private java.lang.String dateReleve;

    private double solde;

    private services.Operation[] operations;

    private java.lang.String rib;  // attribute

    public Releve() {
    }

    public Releve(
           java.lang.String dateReleve,
           double solde,
           services.Operation[] operations,
           java.lang.String rib) {
           this.dateReleve = dateReleve;
           this.solde = solde;
           this.operations = operations;
           this.rib = rib;
    }


    @Override
	public String toString() {
		return "Releve [dateReleve=" + dateReleve + ", solde=" + solde + ", operations=" + Arrays.toString(operations)
				+ ", rib=" + rib + "]";
	}

	/**
     * Gets the dateReleve value for this Releve.
     * 
     * @return dateReleve
     */
    public java.lang.String getDateReleve() {
        return dateReleve;
    }


    /**
     * Sets the dateReleve value for this Releve.
     * 
     * @param dateReleve
     */
    public void setDateReleve(java.lang.String dateReleve) {
        this.dateReleve = dateReleve;
    }


    /**
     * Gets the solde value for this Releve.
     * 
     * @return solde
     */
    public double getSolde() {
        return solde;
    }


    /**
     * Sets the solde value for this Releve.
     * 
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }


    /**
     * Gets the operations value for this Releve.
     * 
     * @return operations
     */
    public services.Operation[] getOperations() {
        return operations;
    }


    /**
     * Sets the operations value for this Releve.
     * 
     * @param operations
     */
    public void setOperations(services.Operation[] operations) {
        this.operations = operations;
    }


    /**
     * Gets the rib value for this Releve.
     * 
     * @return rib
     */
    public java.lang.String getRib() {
        return rib;
    }


    /**
     * Sets the rib value for this Releve.
     * 
     * @param rib
     */
    public void setRib(java.lang.String rib) {
        this.rib = rib;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Releve)) return false;
        Releve other = (Releve) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateReleve==null && other.getDateReleve()==null) || 
             (this.dateReleve!=null &&
              this.dateReleve.equals(other.getDateReleve()))) &&
            this.solde == other.getSolde() &&
            ((this.operations==null && other.getOperations()==null) || 
             (this.operations!=null &&
              java.util.Arrays.equals(this.operations, other.getOperations()))) &&
            ((this.rib==null && other.getRib()==null) || 
             (this.rib!=null &&
              this.rib.equals(other.getRib())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDateReleve() != null) {
            _hashCode += getDateReleve().hashCode();
        }
        _hashCode += new Double(getSolde()).hashCode();
        if (getOperations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRib() != null) {
            _hashCode += getRib().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Releve.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services/", "releve"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rib");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rib"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateReleve");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateReleve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services/", "operation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "operation"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
