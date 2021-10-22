package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Client;

public interface ClientService {
	List<Client> retrieveAllUsers();
	 Client addUser(Client u);
	void deleteUser(String id);
	Client updateUser(Client u);
	Client retrieveUser(String id);
}
