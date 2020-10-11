package khanhpham.baked_bread.util.register;

import khanhpham.baked_bread.BakedBread;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterHandle {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BakedBread.MODID);

    public static void init() {
            ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }
    public static final RegistryObject<Item> COOKED_BREAD = ITEMS.register("cooked_bread", ()-> new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(8).saturation(3.5f).build())));
}
