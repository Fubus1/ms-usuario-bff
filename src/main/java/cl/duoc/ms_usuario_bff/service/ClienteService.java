package cl.duoc.ms_usuario_bff.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_usuario_bff.clients.ClienteBsFeignCliente;
import cl.duoc.ms_usuario_bff.model.dto.ClienteDTO;

@Service
public class ClienteService {

    @Autowired
    private ClienteBsFeignCliente clienteBsFeignCliente;

  
    public ClienteDTO getClienteById(Long id){
        return clienteBsFeignCliente.getClienteById(id);
    }

    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        return clienteBsFeignCliente.createCliente(clienteDTO);

    }


 





}
