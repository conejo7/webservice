package com.ws.fact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class S_usuarController {

	
	@Autowired
    private S_usuarRepositoryDao s_usuarRepositoryDao;
     
    @GetMapping("/customers")
    public String listAll(Model model) {
        List<S_usuar> listCustomers = s_usuarRepositoryDao.findAll();
        model.addAttribute("listCustomers", listCustomers);  
        for (S_usuar elem : listCustomers) {
			listCustomers.toString();
			System.out.println("elemento"+elem.toString());
			System.out.println("usuario"+elem.getUsuario()+"descripcion"+elem.getDescrip());
		}
        
        return listCustomers.toString();
        //return "customers";
    }    
    
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
    public String postBody(@RequestBody S_usuar user ) {
    	//System.out.println(user.toString());
    	//System.out.println(pass.toString());
        //return new ResponseEntity(userCreated, HttpStatus.CREATED);
    	//return user.toString();
    	return "ok";
    }
    
    
    
}
