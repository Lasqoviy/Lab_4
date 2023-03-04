package Persons;

import Enums.*;
import Interfaces.*;

public class FatBoy extends Person implements Take, Watering, ThinkUp {
    public Items items;
    public Actions action;

    public FatBoy() {
        this.name = "Толстый мальчишка";
    }
    //static inner class
    public static class BoyDescription{
        public void describe(){
            System.out.println("Толстый мальчишка - школьный товарищ Малыша");
        }
    }

    @Override
    public void takeItem() {
        this.items = Items.BAILER;
        System.out.print(" взял лейку, ");
    }

    @Override
    public void watering(){
        //anonymous class
        Uncle u = new Uncle(){
          @Override
            public String toString(){
              return "дядю Юлиуса";
          }
        };
        this.action = Actions.WATERING;
        System.out.println("и стал поливать " + u);
    }

    @Override
    public void thinkUp(){
        this.action = Actions.THINK;
        System.out.println(this + " придумывает дикие Шалости");
    }

}
