package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class ArrayDequeCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> combinedDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // Player 1's turn
            combinedDeque.add(firstQueue.poll()); // Take the top card from combinedDeque and add to firstQueue
            combinedDeque.add(secondQueue.poll()); // Take two cards from secondQueue and add to combinedDeque

            // Player 2's turn
            combinedDeque.add(secondQueue.poll()); // Take the top card from combinedDeque and add to secondQueue
            combinedDeque.add(firstQueue.poll()); // Take two cards from firstQueue and add to combinedDeque
        }

        return combinedDeque;
    }

    public static void main(String[] args) {
        ArrayDequeCreator creator = new ArrayDequeCreator();
        Queue<Integer> firstQueue = new ArrayDeque<>(List.of(1, 5, 7, 6));
        Queue<Integer> secondQueue = new ArrayDeque<>(List.of(2, 5, 8, 3));

        ArrayDeque<Integer> result = creator.createArrayDeque(firstQueue, secondQueue);
        System.out.println(result);
    }
}


