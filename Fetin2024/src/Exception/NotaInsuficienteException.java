package Exception;

//tipo unchecked
public class NotaInsuficienteException extends RuntimeException{

    public NotaInsuficienteException(String message){
        super(message);
    }
}
