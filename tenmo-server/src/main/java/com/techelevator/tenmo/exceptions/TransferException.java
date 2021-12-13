package com.techelevator.tenmo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Transfer not found")
public class TransferException extends Exception{
    private static final long serialVersionUID = 1L;

    TransferException(){super("Transfer not found");}
}


