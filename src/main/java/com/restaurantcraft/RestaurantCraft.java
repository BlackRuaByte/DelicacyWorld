package com.restaurantcraft;

import com.mojang.logging.LogUtils;
import com.restaurantcraft.command.RestaurantCommand;
import com.restaurantcraft.config.RestaurantCraftConfig;
import com.restaurantcraft.registry.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RestaurantCraft.MODID)
public class RestaurantCraft {
    public static final String MODID = "restaurant_craft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RestaurantCraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(bus); ModItems.register(bus); ModBlockEntities.register(bus); ModMenuTypes.register(bus); ModEntityTypes.register(bus); ModCreativeTabs.register(bus); ModRecipes.register(bus);
        bus.addListener(this::commonSetup);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, RestaurantCraftConfig.SPEC);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(FMLCommonSetupEvent event) { event.enqueueWork(ModPackets::register); }
    @SubscribeEvent public void onCommands(RegisterCommandsEvent event) { RestaurantCommand.register(event.getDispatcher()); }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientOnly {
        @SubscribeEvent public static void clientSetup(FMLClientSetupEvent e) { e.enqueueWork(() -> { MenuScreens.register(ModMenuTypes.RESTAURANT_MANAGEMENT.get(), com.restaurantcraft.screen.RestaurantManagementScreen::new); MenuScreens.register(ModMenuTypes.COOKING_DEVICE.get(), com.restaurantcraft.screen.CookingDeviceScreen::new); MenuScreens.register(ModMenuTypes.CUSTOMER_ORDER.get(), com.restaurantcraft.screen.CustomerOrderScreen::new); }); }
        @SubscribeEvent public static void renderers(EntityRenderersEvent.RegisterRenderers e) { ModEntityTypes.registerRenderers(e); }
        @SubscribeEvent public static void attributes(EntityAttributeCreationEvent e) { e.put(ModEntityTypes.CUSTOMER.get(), com.restaurantcraft.entity.CustomerEntity.createAttributes().build()); }
    }
}
