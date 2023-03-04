package Persons;

import Enums.*;
import Exceptions.NotAsleepException;
import Interfaces.*;

public class Uncle extends Person implements OpenEyes, Help, SetName{

    public Actions action;

    public Uncle(){
        this.name = "дядя Юлиус";
        this.action = Actions.SLEEP;
    }

    @Override
    public void setAnotherName(NameTypes nameType){
        switch(nameType){
            case FIRST:
                this.name = "дядю Юлиуса";
                break;
            case SECOND:
                this.name = "дядей Юлиусом";
                break;
            case THIRD:
                this.name = "дяде Юлиусу";
                break;
            case DEFAULT:
                this.name = "дядя Юлиус";
        }
    }

    @Override
    public void help(){
        System.out.print("Это действительно помогло, ");
    }

    @Override
    public void openEyes() throws NotAsleepException {
        if (this.action == Actions.SLEEP) {
            this.action = Actions.OPENEYES;
            System.out.println(this.name + " медленно открыл глаза");
        }else {
            throw new NotAsleepException("(" + this.name + " должен спать чтобы проснуться)");
        }

    }
}
