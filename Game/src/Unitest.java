import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Unitest {


public class TestAccount {
    @Test
    public void testAccount(){
        Account account = new Account("123abc", "ola@gmail.se");
        account.selectCharacter();
        account.deleteCharacter();
        account.changePassword();
    }
}

public class TestAdmin{
    @Test
    public void testAdmin(){
        Admin admin = new Admin("ola@gmail.se");
        admin.getAccount();
    }
}

public class TestArmour{
    @Test
    public void testArmour(){
        Armour armour = new Armour("Hjälm", 5, 2, 1, 400, "leather", "head", 5);
        assertEquals(armour.getName(),"Hjälm");
        assertEquals(armour.getID(),5);
        assertEquals(armour.getLevelRequirement(),2);
        assertEquals(armour.getRarity(),1);
        assertEquals(armour.getPrice(),400);
        assertEquals(armour.getType(),"leather");
        assertEquals(armour.getSlot(),"head");
        assertEquals(armour.getArmourValue(),5);
    }
}

public class TestAuction{
    @Test
    public void testAuction(){

    }
}

public Class TestBank{
    @Test
}

public Class TestCharacter{
    @Test
}

public class TestConsumable{
    @Test
    public void testConsumable(){
        Consumable consumable = new Consumable("rustning", 5, 5, 3, 600, "iron", 5);
        assertEquals(consumable.getType(), "iron" );
        assertEquals(consumable.getRefill(), 5);
    }
}

public class TestHunter{
    @Test
}

public class TestMage{
    @Test
}

public class TestMap{
    @Test
}

public class TestMarket{
    @Test
}

public class TestMovableObject{
    @Test
}

public class TestNpc{
    @Test
}

public class TestPlayerCharacter{
    @Test
}

public class TestSkill{
    @Test
}

public class TestStone{
    @Test
}

public class TestStorage{
    @Test
}

public class TestTrade{
    @Test
}
public class TestTree{
    @Test
}

public class TestWarrior{
    @Test
}

public class TestWeapon{
    @Test
    public void testWeapon(){
        Weapon weapon = new Weapon("Morakniv", 1,5,2,200, 10, 15, true, 10, "gold", "Hand");
        assertEquals(weapon.getDamageMax(),15 );
        assertEquals(weapon.getDamageMin(),10 );
        assertEquals(weapon.isTwoHand(),true );
        assertEquals(weapon.getRange(),10 );
        assertEquals(weapon.getType(), "gold");
        assertEquals(weapon.getSlot(),"Hand" );
    }
}






