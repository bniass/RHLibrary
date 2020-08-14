package service;

import model.Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IService extends Remote {
    public List<Service> findAll() throws RemoteException;
}
