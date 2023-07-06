
class Car {
    public void start() {
        System.out.println("Car started...");
    }
}


class SubCar extends Car {
     String carName;
     int modelYear;
      SubCar( String carName,int modelYear)
        {
          this.carName=carName;
          this.modelYear=modelYear;
        }
   
    public void start() {

        System.out.println("SubCar is starting...");
        super.start(); 
    }
}


class CarAssessmentProgram {
    public static void main(String[] args) {
        
        SubCar sportsCar = new SubCar("Ford Mustang" , 2007);
        sportsCar.start(); 
        
    }
}