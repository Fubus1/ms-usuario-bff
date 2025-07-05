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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/cliente")
@Tag(name = "Cliente", description = "Operaciones relacionadas con clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Operation(summary = "Obtener cliente por ID", description = "Devuelve los datos de un cliente según su ID.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Cliente encontrado",
            content = @Content(mediaType = "application/json",
            schema = @Schema(implementation = ClienteDTO.class))),
        @ApiResponse(responseCode = "404", description = "Cliente no encontrado", content = @Content)
    })
    @GetMapping("/{id}")
    public ClienteDTO getClienteById(@PathVariable("id") Long id){
        return clienteService.getClienteById(id);
    }

    @Operation(summary = "Crear un nuevo cliente", description = "Crea y devuelve un nuevo cliente con los datos proporcionados.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Cliente creado exitosamente",
            content = @Content(mediaType = "application/json",
            schema = @Schema(implementation = ClienteDTO.class))),
        @ApiResponse(responseCode = "400", description = "Datos inválidos", content = @Content)
    })
    @PostMapping
    public ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO){
        return clienteService.createCliente(clienteDTO);
    }
}

