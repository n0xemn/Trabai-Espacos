public class EspacoIndisponivelException extends RuntimeException {
    private String message;

    public EspacoIndisponivelException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
