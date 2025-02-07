interface Q3_file_3{
    private void address(){
        System.out.println("You are from Jaipur");
    }
    default void accessAddress(){
        address();
    }
}