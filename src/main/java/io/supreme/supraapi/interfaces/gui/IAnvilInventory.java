package io.supreme.supraapi.interfaces.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;

public interface IAnvilInventory {

    String name();

    void item(Player player, AnvilInventory inventory);

    void click(Player player, AnvilInventory inventory, ItemStack currentItem, int slot, InventoryClickEvent event);

    int size();

}
