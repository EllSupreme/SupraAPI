package io.supreme.supraapi.interfaces.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public interface IChestInventory {

    String name();

    void item(Player player, Inventory inventory);

    void click(Player player, Inventory inventory, ItemStack currentItem, int slot, InventoryClickEvent event);

    int size();


}
