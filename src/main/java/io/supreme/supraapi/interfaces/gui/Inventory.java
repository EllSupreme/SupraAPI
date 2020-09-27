package io.supreme.supraapi.interfaces.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public interface Inventory {

    public abstract String name();

    public abstract void item(Player player, Inventory inventory);

    public abstract void click(Player player, Inventory inventory, ItemStack currentItem, int slot, InventoryClickEvent event);

    public abstract int size();


}
