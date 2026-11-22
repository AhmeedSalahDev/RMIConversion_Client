package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface distante du service de conversion Euro -> Dinar tunisien (DT).
 * Toute methode d'une interface RMI doit declarer RemoteException.
 */
public interface IConversion extends Remote {
    double convertirMontant(double montantEuro) throws RemoteException;
}
