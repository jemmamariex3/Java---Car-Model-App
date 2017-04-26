//Jemma Tiongson
//App: Driver.java (Vehicle Polymorphism)
//Purpose: Exam - testing knowledge of Polymorphism and abstract

class Driver{
   public static void main (String [] args){
      
      BMW beamer = new BMW();
      Vehicle newBeamer = beamer;
      newBeamer.init("M4", 80000);
      
      System.out.println("Model: " +newBeamer.getModel());
      System.out.println("Base Price: " +newBeamer.getBasePrice());
      System.out.println("Total Price: " +newBeamer.getTotalPrice());
      
      Toyota toyota = new Toyota();
      Vehicle newToyota = toyota;
      newToyota.init("Camry", 30000);
      
      System.out.println("\nModel: " +newToyota.getModel());
      System.out.println("Base Price: " +newToyota.getBasePrice());
      System.out.println("Total Price: " +newToyota.getTotalPrice());
      
      
   }
}
   