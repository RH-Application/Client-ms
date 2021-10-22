package tn.esprit.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.entity.Client;

import tn.esprit.spring.service.ClientService;

@RestController
public class ClientController {
@Autowired 
ClientService clientService;


@GetMapping("/retrieve-all-clients")
@ResponseBody
public List<Client> getUsers(){
	List<Client> client = clientService.retrieveAllUsers();
	return client;
}

@GetMapping("/retrieve-client/{id}")
@ResponseBody
public Client getUserById(@PathVariable("id") String id_user){
	return clientService.retrieveUser(id_user);
}
@PostMapping("/add-client")
@ResponseBody
public String addUser(@RequestBody Client u){
	
	Client client= clientService.addUser(u);
	return "this is client:"+client;
}

@DeleteMapping("/delete-client/{id}")
@ResponseBody
public void deleteUser(@PathVariable("id") String id_user){
	clientService.deleteUser(id_user);
}

@PutMapping("/update-client")
@ResponseBody
public Client UpdateUser(@RequestBody Client client){
	return clientService.updateUser(client);
}




}
