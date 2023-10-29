package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // Fill the queue with dish numbers
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.offer(i);
        }

        // Eat dishes according to the rule
        while (!queue.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                queue.offer(queue.poll());
            }
            result.add(queue.poll());
        }

        return result;
    }
}
