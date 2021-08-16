package com.keyword;

class Bird
{
    public void fly()
    {
        System.out.println("Birds Fly");
    }
}

class Duck extends Bird
{
    public void fly()
    {
        System.out.println("Duck Flies");
    }
}

class Ostrich extends Bird  // class Ostrich does not replace base class completely.
{
    public void fly()
    {
        System.out.println("Ostrich wont fly");
    }
}

public class LiskovSubstitutionPrincipleNotUsing
{
    public static void main(String[] args)
    {
        Duck duck = new Duck();
        Ostrich ostrich = new Ostrich();
        duck.fly();
        ostrich.fly();
    }
}
