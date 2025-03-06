public class TryCatch{
    public static void main(String[]args){
        try{

        }catch(Exception e1){

        }catch(ArithmeticException e2){

        }catch(ArrayIndexOutOfBoundsException e3){

        }catch(NullPointerException e4){

        }
    }
}
/*Output : TryCatch.java:7: error: exception ArithmeticException has already been caught
        }catch(ArithmeticException e2){
         ^
TryCatch.java:9: error: exception ArrayIndexOutOfBoundsException has already been caught
        }catch(ArrayIndexOutOfBoundsException e3){
         ^
TryCatch.java:11: error: exception NullPointerException has already been caught
        }catch(NullPointerException e4){
         ^
3 errors*/