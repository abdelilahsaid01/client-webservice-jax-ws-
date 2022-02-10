package server;

import java.rmi.RemoteException;

import services.Operation;
import services.ReleveServicesProxy;

public class server {

	public static void main(String[] args) throws RemoteException {
		ReleveServicesProxy proxy = new ReleveServicesProxy();
		System.out.println(proxy.getReleve());
		Operation[] liste = proxy.getReleve().getOperations();
		for(Operation ls :  liste) {
			System.out.println(ls.getDescription());
		}
		
	}

}
