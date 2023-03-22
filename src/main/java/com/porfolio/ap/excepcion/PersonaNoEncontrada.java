package com.porfolio.ap.excepcion;

public class PersonaNoEncontrada extends RuntimeException {
    public PersonaNoEncontrada(String message){
        super(message);
    }
}
