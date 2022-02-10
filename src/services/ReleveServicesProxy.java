package services;

public class ReleveServicesProxy implements services.ReleveServices {
  private String _endpoint = null;
  private services.ReleveServices releveServices = null;
  
  public ReleveServicesProxy() {
    _initReleveServicesProxy();
  }
  
  public ReleveServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initReleveServicesProxy();
  }
  
  private void _initReleveServicesProxy() {
    try {
      releveServices = (new services.ReleveServicesWSLocator()).getReleveServicesPort();
      if (releveServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)releveServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)releveServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (releveServices != null)
      ((javax.xml.rpc.Stub)releveServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public services.ReleveServices getReleveServices() {
    if (releveServices == null)
      _initReleveServicesProxy();
    return releveServices;
  }
  
  public java.lang.String test() throws java.rmi.RemoteException{
    if (releveServices == null)
      _initReleveServicesProxy();
    return releveServices.test();
  }
  
  public services.Releve getReleve() throws java.rmi.RemoteException{
    if (releveServices == null)
      _initReleveServicesProxy();
    return releveServices.getReleve();
  }
  
  public services.Operation[] getOperations() throws java.rmi.RemoteException{
    if (releveServices == null)
      _initReleveServicesProxy();
    return releveServices.getOperations();
  }
  
  
}