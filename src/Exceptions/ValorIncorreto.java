package Exceptions;

import java.util.InputMismatchException;

public class ValorIncorreto extends InputMismatchException {
    public ValorIncorreto(String mensagem) {
        super(mensagem);
    }
}
