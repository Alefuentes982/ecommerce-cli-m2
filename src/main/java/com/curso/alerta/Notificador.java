package com.curso.alerta;

/**
 * Interfaz que define el contrato para enviar notificaciones.
 * En produccion podria ser un email, SMS, etc.
 */
public interface Notificador {

    void enviar(String destino, String msg);
}
