package paqExceptions;

public class Validaciones {

    public void validarPassword(String password) throws PasswordInvalidException {
        ///Validar que contenga al menos 8 caracteres
        if( password.length() < 8 )
            throw new PasswordInvalidException("La contraseña debe tener al menos 8 caracteres.");
        ///Validar que contenga al menos una mayuscula
        if( !password.matches(".*[a-z].*") )
            throw new PasswordInvalidException("La contraseña debe contener al menos una minuscula.");
        ///Validar que contenga al menos una minuscula
        if( !password.matches(".*[A-Z].*") )
            throw new PasswordInvalidException("La contraseña debe contener al menos una mayuscula.");
        ///Validar que contenga al menos un numero
        if( !password.matches(".*\\d.*") )
            throw new PasswordInvalidException("La contraseña debe contener al menos un numero.");
        ///Validar que contenga al menos un caracter especial
        if( !password.matches(".*[^a-zA-Z0-9].*") )
            throw new PasswordInvalidException("La contraseña debe contener al menos un caracter especial.");
    }


}