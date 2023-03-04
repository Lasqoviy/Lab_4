package Persons;

import Enums.*;
import Exceptions.NoDestinationException;
import Interfaces.*;

public class FrekenBok extends Person implements Clean, Explain, Help, Speak, Lead {
    public Items item;
    public Actions action;

    public FrekenBok(){
        this.name = "Фрекен Бок";
        this.item = Items.TOWEL;
    }
    // non-static inner class
    private class Voice{
        public String speakLoudly(){
            return "Доносился голос ";
        }
    }

    @Override
    public void speak(){
        this.action = Actions.SPEAK;
        Voice voice = new Voice();
        System.out.println(voice.speakLoudly() + this);
    }

    @Override
    public void help(){
        this.action = Actions.HELP;
        System.out.print(this.name + " занялась тем временем ");
    }

    @Override
    public void clean(){
        this.action = Actions.CLEAN;
        System.out.print(this.name + " насухо вытерла полотенцем ");
    }

    @Override
    public void explain(Object object){
        this.action = Actions.EXPLAIN;
        System.out.print(this.name + " объясняла " + object + ", что ");
    }

    @Override
    public void lead(Object object, String place) throws NoDestinationException {
        if (place == null) {
            throw new NoDestinationException("(укажите место назначения)");
        } else {
            this.action = Actions.LEAD;
            //local class
            class Location {
                String name = place;
            }
            Location location = new Location();
            System.out.println(this + " повела " + object + " в " + location.name);
        }
    }
}
