package service;

import model.Employe;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IEmploye extends Remote {
    public void add(Employe employe) throws RemoteException;
    public List<Employe> findAll() throws RemoteException;
    public List<Employe> findAllByService(int serviceId) throws RemoteException;
}
