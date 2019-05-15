import java.util.ArrayList;
import ex1.*;
import ex2.*;
import ex3.*;

public class Main {

    public static void main(String[] args) {
//        ex1();
//        ex2();
        ex3();
    }

    public static void ex1(){
        ArrayList<Person> ex1Array = new ArrayList<>();
        ex1Array.add(new Friend());
        ex1Array.add(new Teacher());
        ex1Array.add(new Doctor());

        System.out.println(ex1Array.get(0));
        System.out.println(ex1Array.get(1));
        System.out.println(ex1Array.get(2));
    }

    public static void ex2(){
        ArrayList<Building> agent1 = new ArrayList<>();
        agent1.add(new Restaurant());
        agent1.add(new Commercial());
        agent1.add(new Resident());
        agent1.add(new Restaurant());
        agent1.add(new Resident());

        System.out.println("The agent has " + agent1.size() + " buildings.");
        System.out.println("\nHere are the agent's buildings:");
        int buildingCounter = 1;
        for(Building eachBuilding: agent1){
            System.out.println(buildingCounter+ ": " + eachBuilding);
            buildingCounter++;
        }
    }

    public static void ex3(){
        Microwave microwave1 = new Microwave();
        Fridge fridge1 = new Fridge();
        Toaster toaster1 = new Toaster();
        microwave1.turnOn();
        fridge1.insertItem("bread");
        toaster1.seeItems();
        fridge1.seeItems();
        System.out.println(microwave1.removeItem("Test"));
    }
}
