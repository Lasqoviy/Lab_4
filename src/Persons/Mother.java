package Persons;

import Enums.Actions;
import Interfaces.Watering;
import Enums.Items;

public class Mother extends Person implements Watering {

    public Items item;

    public Actions action;
    public Mother() {
        this.name = "мама Малыша";
        this.item = Items.BAILER;
    }

    @Override
    public void watering(){
        this.action = Actions.WATERING;
        System.out.print("из которой " + this + " поливала цветы, ");
    }
}
