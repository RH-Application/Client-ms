package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.service.*;
import tn.esprit.spring.entity.Client;
@Repository("userRepository")
public interface ClientRepository extends CrudRepository<Client, Long>
{
	List<Client> findByFirstName(String firstName);
	List<Client> findByLastName(String lastName);

}
