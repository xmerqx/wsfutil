/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2.cs.webservices.metrofax.shared.exception;

import java.io.Serializable;

/**
 *
 * @author andres.gama
 */
public class ElectricMailException extends RuntimeException implements Serializable{

    public ElectricMailException() {
    }

    public ElectricMailException(String message) {
        super(message);
    }

    public ElectricMailException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElectricMailException(Throwable cause) {
        super(cause);
    }
}
