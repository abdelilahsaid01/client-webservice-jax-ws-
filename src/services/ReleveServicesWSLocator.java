/**
 * ReleveServicesWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class ReleveServicesWSLocator extends org.apache.axis.client.Service implements services.ReleveServicesWS {

    public ReleveServicesWSLocator() {
    }


    public ReleveServicesWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReleveServicesWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReleveServicesPort
    private java.lang.String ReleveServicesPort_address = "http://localhost:8888/";

    public java.lang.String getReleveServicesPortAddress() {
        return ReleveServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReleveServicesPortWSDDServiceName = "ReleveServicesPort";

    public java.lang.String getReleveServicesPortWSDDServiceName() {
        return ReleveServicesPortWSDDServiceName;
    }

    public void setReleveServicesPortWSDDServiceName(java.lang.String name) {
        ReleveServicesPortWSDDServiceName = name;
    }

    public services.ReleveServices getReleveServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReleveServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReleveServicesPort(endpoint);
    }

    public services.ReleveServices getReleveServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            services.ReleveServicesPortBindingStub _stub = new services.ReleveServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getReleveServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReleveServicesPortEndpointAddress(java.lang.String address) {
        ReleveServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (services.ReleveServices.class.isAssignableFrom(serviceEndpointInterface)) {
                services.ReleveServicesPortBindingStub _stub = new services.ReleveServicesPortBindingStub(new java.net.URL(ReleveServicesPort_address), this);
                _stub.setPortName(getReleveServicesPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ReleveServicesPort".equals(inputPortName)) {
            return getReleveServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services/", "ReleveServicesWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services/", "ReleveServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReleveServicesPort".equals(portName)) {
            setReleveServicesPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
