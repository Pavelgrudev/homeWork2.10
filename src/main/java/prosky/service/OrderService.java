package prosky.service;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> ids);
    List <Integer> getItems();
}