package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // Add two cards to the ArrayDeque
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(secondQueue.poll());

            // Take the top card from ArrayDeque and add it to the end of the player's Queue
            firstQueue.offer(arrayDeque.poll());

            // Put two cards from the beginning of the player's Queue into the ArrayDeque
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(firstQueue.poll());

            // Repeat the process for the second player
            secondQueue.offer(arrayDeque.poll());
            arrayDeque.add(secondQueue.poll());
            arrayDeque.add(secondQueue.poll());
        }

        return arrayDeque;
    }

    public static void main(String[] args) {
        Queue<Integer> firstQueue = new LinkedList<>(Arrays.asList(1, 5, 7, 6));
        Queue<Integer> secondQueue = new LinkedList<>(Arrays.asList(2, 5, 8, 3));

        ArrayDequeCreator creator = new ArrayDequeCreator();
        ArrayDeque<Integer> result = creator.createArrayDeque(firstQueue, secondQueue);

        System.out.println(result);
    }
}



