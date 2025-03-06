public class InsufficientFundsException extends Exception{
    InsufficientFundsException(String errorMsg){
        super(errorMsg);
    }
}