//Jemma Tiongson
//App: Driver.java (Vehicle Polymorphism)
//Purpose: Exam - testing knowledge of Polymorphism and abstract

public abstract class Vehicle{
   String model = "";
   int basePrice = 0;
   
   public int getBasePrice(){
      return basePrice;
   }
   public String getModel(){
      return model;
   }
   public void init(String model, int basePrice){
      this.model = model;
      this.basePrice = basePrice;
   }
   public abstract int getTotalPrice();
}