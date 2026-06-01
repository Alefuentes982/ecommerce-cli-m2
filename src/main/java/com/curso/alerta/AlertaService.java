package com.curso.alerta;

/**
 * Servicio de alertas que usa un Notificador como dependencia.
 * Valida que destino y msg no esten vacios antes de enviar.
 */
public class AlertaService {

    private final Notificador notificador;

    public AlertaService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarAlerta(String destino, String msg) {
        if (destino == null || destino.trim().isEmpty()) {
            // Destino invalido: no se envia nada
            return;
        }
        if (msg == null || msg.trim().isEmpty()) {
            // Mensaje invalido: no se envia nada
            return;
        }
        notificador.enviar(destino, msg);
    }
}
