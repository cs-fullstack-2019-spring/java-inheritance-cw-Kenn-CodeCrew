package ex3;
import java.util.ArrayList;

public class Toaster extends Appliance {
    private ArrayList<String> array = new ArrayList<>();;

    public void turnOn(){
        System.out.println("The toaster is now on");
    }

    public void insertItem(String newItem){
        array.add(newItem + " is toasted");
    }

    public void seeItems(){
        for (String eachItem : array)
        {
            System.out.println(eachItem);
        }
    }

    public String removeItem(String deleteItem){
        if(array.contains(deleteItem))
        {
            array.remove(deleteItem);
            return "DELETE!";
        }
        else{
            return "ERROR. Item not there";
        }
    }
}
