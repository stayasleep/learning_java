package ch05;

public class Car {
    public static void main(String[] args){
        Cars hotRod = new Cars("mustang");
        System.out.println("Hot rod is of type "+ hotRod.model );
        System.out.println("Standard with "+ hotRod.doors+" doors");

        Cars sportsCar = new Cars("corvette", 2);
        System.out.println("My "+sportsCar.model +" has only "+sportsCar.doors + " doors!");
    }
}

class Cars {
    String model;
    int doors;

    Cars(String model, int doors){
        this.model = model;
        this.doors = doors;
        //powerful code
    }

    Cars(String model){
        this(model,4);
    }
}
