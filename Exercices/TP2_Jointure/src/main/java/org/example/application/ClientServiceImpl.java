package org.example.application;

import org.example.dao.DAOFactory;
import org.example.dao.IClientDAO;
import org.example.domaine.Client;

public class ClientServiceImpl implements IClientService {
    IClientDAO dao = DAOFactory.getFactory();

    @Override
    public void createClient(Client client) {
        dao.createClient(client);
    }
}
