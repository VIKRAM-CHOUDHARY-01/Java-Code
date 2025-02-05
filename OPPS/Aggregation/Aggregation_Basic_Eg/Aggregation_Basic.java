public class Aggregation_Basic{
    public static void main(String [] args){
      Other_Ag objectOfOtherFile = new Other_Ag();
      new Other_Ag();
      Other_Ag2 objectOfOtherFile2 = new Other_Ag2();
      new Other_Ag2();
      objectOfOtherFile2.show1(3);
      System.out.println(objectOfOtherFile2.show2("Return and argument"));
      objectOfOtherFile2.show3();
      System.out.println(objectOfOtherFile2.show4());
       
    }
}