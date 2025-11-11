package org.example;

import java.util.Comparator;

public class JobComparator implements Comparator<Job>  {

    @Override
    public int compare(Job j1, Job j2) {
        return j1.profit - j2.profit;
    }
}
