package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // Take the top card from ArrayDeque and add it to the end of the player's Queue
            arrayDeque.add(firstQueue.poll());

            // Add two cards to the ArrayDeque from both players
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(secondQueue.poll());
        }

        // Handle any remaining cards
        while (!firstQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll());
        }

        while (!secondQueue.isEmpty()) {
            arrayDeque.add(secondQueue.poll());
        }

        return arrayDeque;
    }
}