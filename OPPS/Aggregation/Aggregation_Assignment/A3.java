class A3{
    void m1(){
        System.out.println("No Return and No Arugment Method in other file 'A3'");
    }
    void m2(int a){
        System.out.println("No Return and Argument Method in other file 'A3'" + a);
        
    }
    String m3(){
        return "Return and No Arugment Method in other file 'A3'";
    }
    String m4(String a){
        return a;
    }

    A3 m5(){
        return this;
    }

}