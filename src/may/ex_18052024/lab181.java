package may.ex_18052024;

import may.ex_11052024.car;

public class lab181 {
    public static void main(String[] args) {
        // what is super keywords in JAVA
        //parent -> child

        //super keyword reference to parent class
        // variable of the parent
        //method of the parent
        // constructor of the parent
        Car c =new Car()
                ;
        c.display();


         }
    }

        class Car extends Vehicle{
            int maxSpeed =180;
            void display(){
                System.out.println("Max speed of Vehicle can be " + super.maxSpeed);
                System.out.println("Max speed of car can be" +  this.maxSpeed )  ;
            }  //here "this means my variable
            //and super for vehicle variable
        }


        class  Vehicle{
             int maxSpeed =100; //Instance variable

            void message (){
                System.out.println("This is Vehicle class");
            }

        }