package khanhpham.baked_bread.util;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class Register {
    private static final String MODID = "baked_bread";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> COOKED_BREAD = ITEMS.register("cooked_bread", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(0.7f).build())));
    public static final RegistryObject<Item> BREAD_WITH_BEEF = ITEMS.register("baked_bread_with_meat", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(10).saturation(0.8f).build())));
    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
}
