package com.curso.alerta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)  // Activa Mockito en JUnit 5
class AlertaServiceTest {

    @Mock
    private Notificador notificadorMock;   // Mock de la dependencia

    private AlertaService alertaService;

    @BeforeEach
    void setUp() {
        alertaService = new AlertaService(notificadorMock);
    }

    @Test
    void no_llama_enviar_si_destino_es_vacio() {
        // Act: destino vacio -> el servicio debe ignorar la llamada
        alertaService.enviarAlerta("", "Mensaje importante");

        // Assert: verify que enviar() NUNCA fue invocado
        verify(notificadorMock, never()).enviar(anyString(), anyString());
    }

    @Test
    void llama_enviar_con_datos_validos() {
        // Act
        alertaService.enviarAlerta("correo@ejemplo.com", "Servidor caido");

        // Assert: verify que enviar() SI fue invocado exactamente 1 vez con esos argumentos
        verify(notificadorMock, times(1)).enviar("correo@ejemplo.com", "Servidor caido");
    }
}
