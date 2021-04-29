public class Bike2 extends Vehicle{



    //defining the same method as in the parent class
    public void run(){


        System.out.println("Bike is running safely");
        super.run();       //calling parent class method with super keyword in child class method.
    }


    public static void main(String args[]){
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method so it will return both child and parent class methods.
    }





}
