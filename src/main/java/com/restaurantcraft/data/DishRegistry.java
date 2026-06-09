package com.restaurantcraft.data;
import java.util.*;
public class DishRegistry { public static final List<DishDefinition> DISHES=List.of(
 new DishDefinition("mantou","馒头",DishTier.BASE,"steamer",400),new DishDefinition("luotiao","裸条",DishTier.BASE,"boiling_pot",400),new DishDefinition("egg_fried_rice","蛋炒饭",DishTier.BASE,"wok",400),new DishDefinition("flower_tea","花茶",DishTier.BASE,"drink_mixer",400),
 new DishDefinition("xiaolongbao","小笼包",DishTier.NORMAL,"steamer",600),new DishDefinition("guilin_rice_noodles","桂林米粉",DishTier.NORMAL,"boiling_pot",600),new DishDefinition("fried_rice_noodles","炒河粉",DishTier.NORMAL,"wok",600),new DishDefinition("watermelon_honey_juice","西瓜蜂蜜汁",DishTier.NORMAL,"drink_mixer",600),
 new DishDefinition("rice_roll","肠粉",DishTier.ADVANCED,"steamer",1200),new DishDefinition("fuding_pork_slices","福鼎肉片",DishTier.ADVANCED,"boiling_pot",1200),new DishDefinition("linyi_fried_chicken","临沂炒鸡",DishTier.ADVANCED,"wok",1200),new DishDefinition("cappuccino","卡布奇诺",DishTier.ADVANCED,"drink_mixer",1200),
 new DishDefinition("black_pepper_t_bone","黑椒 T 仔骨",DishTier.ADVANCED,"steamer",2400),new DishDefinition("chaoshan_beef","潮汕烫牛肉",DishTier.ADVANCED,"boiling_pot",2400),new DishDefinition("boiled_pork_slices","水煮肉片",DishTier.ADVANCED,"wok",2400),new DishDefinition("sparkling_watermelon_ice_cream","亮闪闪西瓜冰淇淋",DishTier.ADVANCED,"drink_mixer",2400));
 public static Optional<DishDefinition> byId(String id){return DISHES.stream().filter(d->d.id().equals(id)).findFirst();}
}
