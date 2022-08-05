package HomeWork4;

public interface smellInteface {
     default void smell(Three three){
         System.out.println(three.getSmell());
     }

}
