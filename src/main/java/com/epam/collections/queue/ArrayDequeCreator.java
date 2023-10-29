package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            int firstElement = firstQueue.poll();
            int secondElement = secondQueue.poll();
            arrayDeque.add(firstElement);
            arrayDeque.add(secondElement);
            firstQueue.add(firstElement);
            firstQueue.add(secondElement);
        }

        while (!firstQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll());
        }

        while (!secondQueue.isEmpty()) {
            arrayDeque.add(secondQueue.poll());
        }

        return arrayDeque;
    }
}

