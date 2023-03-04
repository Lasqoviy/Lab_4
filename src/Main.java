import Enums.NameTypes;
import Exceptions.NoDestinationException;
import Exceptions.NotAsleepException;
import Persons.*;

public class Main {
   public static void main(String args[]) {
       FatBoy fatBoy = new FatBoy();
       FrekenBok frekenBok = new FrekenBok();
       Uncle uncle = new Uncle();
       Mother mother = new Mother();
       FatBoy.BoyDescription description = new FatBoy.BoyDescription();

       System.out.print(fatBoy);
       fatBoy.takeItem();
       mother.watering();
       fatBoy.watering();
       uncle.help();

       try {
            uncle.openEyes();
       } catch (NotAsleepException e) {
            System.out.println(e.getMessage());
       }

       frekenBok.help();
       uncle.setAnotherName(NameTypes.SECOND);
       System.out.println(uncle);
       frekenBok.clean();
       uncle.setAnotherName(NameTypes.FIRST);
       System.out.println(uncle);

       try {
           frekenBok.lead(uncle, "его комнату");
       } catch (NoDestinationException e) {
           System.out.println(e.getMessage());
       }
       //frekenBok.lead(uncle, "его комнату");
       frekenBok.speak();
       uncle.setAnotherName(NameTypes.THIRD);
       frekenBok.explain(uncle);
       description.describe();
       frekenBok.explain(uncle);
       fatBoy.thinkUp();
   }
}
