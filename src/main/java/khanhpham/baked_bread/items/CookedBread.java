package khanhpham.baked_bread.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CookedBread extends Item {
    public CookedBread() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                    .hunger(8)
                    .saturation(3.5f)
                    .build())
        );
    }
}
