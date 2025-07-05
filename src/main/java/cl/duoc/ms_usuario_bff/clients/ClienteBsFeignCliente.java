package cl.duoc.ms_usuario_bff.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ms_usuario_bff.model.dto.ClienteDTO;

@FeignClient(name = "ms-usuario-bs", url = "http://localhost:8081/")
public interface ClienteBsFeignCliente {

   

    @GetMapping("/cliente/{id}")
    public ClienteDTO getClienteById(@PathVariable("id") Long id);

    @PostMapping("/cliente")
    ClienteDTO createCliente(@RequestBody ClienteDTO ClienteDTO);
 
}
