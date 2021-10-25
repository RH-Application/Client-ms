package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;
@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository clientRepository ;
	private static final Logger l = LogManager.getLogger(ClientServiceImpl.class);
	
	@Override
	public List<Client> retrieveAllUsers() {
		List<Client> clients=(List<Client>) clientRepository.findAll();
		for(Client client: clients){
			l.info("client list : "+ client);
		}
		return clients;
	}

	@Override
	public Client addUser(Client u) {
		// TODO Auto-generated method stub
		return clientRepository.save(u);
	}

	@Override
	public void deleteUser(String id_user) {
		clientRepository.deleteById(Long.parseLong(id_user));
		
	}

	@Override
	public Client updateUser(Client u) {
		return clientRepository.save(u);
	}

	@Override
	public Client retrieveUser(String id_user) {
		return null;

	}

	public ClientServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

}
