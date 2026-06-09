package com.restaurantcraft.data;
import net.minecraft.core.BlockPos; import java.util.UUID;
public class RestaurantData { public UUID ownerUuid; public String ownerName=""; public String restaurantName="Restaurant Craft"; public int level=1,popularity=10,money=0; public boolean isOpen=false; public int currentCustomerTotal,spawnedCustomerCount,finishedCustomerCount,failedCustomerCount,successfulOrders,failedOrders; public long businessStartDay,businessStartTime; public BlockPos entrancePos,exitPos,areaMinPos,areaMaxPos; public int decorPopularityCache,dishPopularityCache; }
