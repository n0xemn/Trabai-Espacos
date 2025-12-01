public class HorarioInvalidoException extends RuntimeException{
    private String message;

    public HorarioInvalidoException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
