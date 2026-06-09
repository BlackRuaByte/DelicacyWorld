package com.restaurantcraft.util; import net.minecraft.world.level.Level; public class RestaurantTimeUtil { public static boolean isTooLate(Level l,int close){return (l.getDayTime()%24000)>close;} }
