package WolfShotz.Wyrmroost.event;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class SetupKeyBinds
{
    private static final String category = "wyrmroost.keyCategory";
    
    public static KeyBinding genericAttack;
    public static KeyBinding specialAttack;
    public static KeyBinding callDragon;
    
    public static void registerKeys() {
        genericAttack = registerKey("key.genericAttack", 86, category);
//        specialAttack = new KeyBinding("key.specialAttack", 82, category);
        callDragon = registerKey("key.callDragon", 70, category);
    
    }
    
    public static KeyBinding registerKey(String description, int keyCode, String category) {
        KeyBinding key = new KeyBinding(description, keyCode, category);
        ClientRegistry.registerKeyBinding(key);
        
        return key;
    }
}
