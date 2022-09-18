package dev.arunava.mccourse.item;

import dev.arunava.mccourse.MCCourseMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;
import org.lwjgl.system.CallbackI;

// Template that a lot of classes are going to follow
public class ModItems {

    /*
        Simple: DeferredRegister is the list of all the items that are going to
        be added from this mod. That's why MOD_ID is needed.

        Here, ITEMS needs to be in uppercase as its a final field [Convention]
    */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    /*
        Adding a new item.

        NOTE: No need to write a ModItems class for each item in the mod. Only the
        RegistryObject needs to be set.
     */
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    /*
        This list needs to be registered in minecraft. Its going to be called
        from the main class.
     */
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
