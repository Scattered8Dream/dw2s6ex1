package br.edu.ifsp.arq.dw2s6.tigetrequest.resources;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.arq.dw2s6.tigetrequest.domain.model.Gender;
import br.edu.ifsp.arq.dw2s6.tigetrequest.domain.model.User;

@RestController
public class UserResource {

	@GetMapping("/tiusers")
	public List<User> listar(){
		var user1 = new User();
		user1.setId(1L);
		user1.setName("Edson Nascimento");
		user1.setEmail("edson.nascimento@ifsp.edu.br");
		user1.setPassword("edson");
		user1.setDateOfBirth(LocalDate.of(2000, 01, 13));
		user1.setGender(Gender.MASCULINO);
		
		var user2 = new User();
		user2.setId(2L);
		user2.setName("Tia Cotinha");
		user2.setEmail("cotinha@ifsp.edu.br");
		user2.setPassword("12345");
		user2.setDateOfBirth(LocalDate.of(1980, 1, 1));
		user2.setGender(Gender.FEMININO);
		
		return Arrays.asList(user1, user2);	
	}
}
