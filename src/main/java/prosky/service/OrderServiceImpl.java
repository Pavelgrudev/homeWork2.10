package prosky.service;

import org.springframework.stereotype.Service;
import prosky.Controller.model.Cart;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    private Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return cart.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
