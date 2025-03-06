public class Exception_Handling2{
    public static void main(String []args){
        //try with catch
        int a = 10;
        System.out.println("Hello One");
        int b = 0;
        System.out.println("Hello Two");
        try{
                int c = a/b; //Exception -> abnormal condition
                System.out.println(c);

        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Now will this would be printed");
     
    
    }
}