package io.supreme.supraapi.interfaces.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;

public abstract class AnvilGui {

    public abstract String name();

    public abstract void item(Player player, AnvilInventory inventory);

    public abstract void click(Player player, AnvilInventory inventory, ItemStack currentItem, int slot, InventoryClickEvent event);

    public abstract int size();

}
