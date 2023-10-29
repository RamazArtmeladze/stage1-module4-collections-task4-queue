package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> mergedList = new ArrayList<>(firstList);
        mergedList.addAll(secondList);

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.addAll(mergedList);

        return priorityQueue;
    }
}

