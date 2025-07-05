package cl.duoc.ms_usuario_bff.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "DTO que representa a un cliente")
public class ClienteDTO {

    @Schema(description = "ID único del cliente", example = "1")
    private Long id_cliente;

    @Schema(description = "Nombre del cliente", example = "Juan Pérez")
    private String nombre;

    @Schema(description = "Contraseña del cliente", example = "1234Segura.")
    private String contrasena;

    @Schema(description = "Dirección del cliente", example = "Av. Siempre Viva 123")
    private String direccion;

    @Schema(description = "Correo electrónico del cliente", example = "juan.perez@email.com")
    private String email;

    @Schema(description = "Número de teléfono del cliente", example = "+56912345678")
    private String telefono;
}
