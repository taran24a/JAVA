public class Car {
    // String brand_Name = "Toyota";
    // String model_Name = "Fortuner";
    // int price = 5000000;

    String brand_Name;
    String model_Name;
    int price;

    Car(String  b , String m, int p){
        brand_Name = b;
        model_Name = m;
        price = p;
    }

    

    void show(){
        System.out.println(brand_Name);
        System.out.println(model_Name);
        System.out.println(price);

    }

    public static void main(String args[]) {
        Car c1 = new Car("Toyota", "Fortuner", 5000000);
        c1.show();

    }
    
}
