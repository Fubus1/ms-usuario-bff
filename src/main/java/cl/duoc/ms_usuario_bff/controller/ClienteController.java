package cl.duoc.ms_usuario_bff.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_usuario_bff.model.dto.ClienteDTO;
import cl.duoc.ms_usuario_bff.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/{id}")
    public ClienteDTO getClienteById(@PathVariable("id") Long id){
        return clienteService.getClienteById(id);
    }
    
    @PostMapping
    public ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO){
        return clienteService.createCliente(clienteDTO);

    }
        
    
    

}
