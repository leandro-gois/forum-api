package com.leandro.Forum_Hub.exception;

public class UsuarioSemPerimssaoException extends RuntimeException{

    public UsuarioSemPerimssaoException(String mensagem){
        super(mensagem);
    }
}