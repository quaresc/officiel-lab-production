package ca.ulaval.glo4002.cart.infrastructure.persistence.memory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ca.ulaval.glo4002.cart.domain.shop.ShopItem;
import ca.ulaval.glo4002.cart.domain.shop.ShopRepository;

public class InMemoryShopRepository implements ShopRepository {
    private static final List<ShopItem> ITEMS = new ArrayList<>();

    @Override
    public List<ShopItem> listShopItems() {
        return new ArrayList<>(ITEMS);
    }

    @Override
    public synchronized void persistShop(List<ShopItem> newItems) {
        ITEMS.clear();
        ITEMS.addAll(newItems);
    }
}
