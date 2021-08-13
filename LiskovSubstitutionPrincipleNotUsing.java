package com.keyword;

class Engine
{
    public void engine()
    {
        System.out.println("Engine is present");
    }
}

class Bike extends Engine
{
    public void bikeEngine()
    {
        System.out.println("Bike has Engine");
    }
}

class Car extends Engine
{
    public void carEngine()
    {
        System.out.println("Car has Engine");
    }
}

class Truck extends Engine
{
    public void truckEngine()
    {
        System.out.println("Truck has Engine");
    }
}

class Ship extends Engine
{
    public void shipEngine()
    {
        System.out.println("Ship has Engine");
    }
}

class Cycle extends Engine     // Class Cycle extending Class Engine does not substitute the parent class correctly.
                              // This violates the Liskov Substitution Principle.
{
    public void cycle()
    {
        System.out.println("Cycle has no Engine");
    }
}

public class LiskovSubstitutionPrincipleNotUsing
{
    public static void main(String[] args)
    {
        Bike bike = new Bike();
        Car car = new Car();
        Truck truck = new Truck();
        Ship ship = new Ship();
        Cycle bicycle = new Cycle();
        bike.bikeEngine();
        car.carEngine();
        truck.truckEngine();
        ship.shipEngine();
        bicycle.cycle();

    }
}
