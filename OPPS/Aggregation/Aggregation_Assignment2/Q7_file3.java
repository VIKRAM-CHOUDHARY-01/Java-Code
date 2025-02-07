interface Q7_file3{
    private void m3(){
        System.out.println("Hello Bois");
    }
    default void accessM3(){
        m3();
    }
}