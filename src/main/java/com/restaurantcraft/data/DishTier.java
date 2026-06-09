package com.restaurantcraft.data;
public enum DishTier { BASE(10,500,90), NORMAL(20,1500,120), ADVANCED(30,5000,150); public final int popularity,income,seconds; DishTier(int p,int i,int s){popularity=p;income=i;seconds=s;} }
