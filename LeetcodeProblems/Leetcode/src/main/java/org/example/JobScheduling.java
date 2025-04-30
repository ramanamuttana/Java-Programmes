package org.example;

import java.util.Arrays;

public class JobScheduling {

    static int profit =0;
    static int total_job=0;

    static Job[]  arrayData={
            new Job(1,5,10),
            new Job(2,4,20),
            new Job(3,6,30),
            new Job(4,1,20),
            new Job(5,2,60),
    };

    public static void main(String[] args){

       calculateScheduling(arrayData,4);
    }

    private static int[] calculateScheduling(Job[] arrayData, int n) {
        Arrays.sort(arrayData, new JobComparator());

        // Find the maximum deadline
        int maxDeadline = 0;
        for (Job job : arrayData) {
            if (job.day > maxDeadline) {
                maxDeadline = job.day;
            }
        }

        boolean[] status = new boolean[maxDeadline];

        for (int i = 0; i < n; i++) {
            for (int j = arrayData[i].day - 1; j >= 0; j--) {
                if (!status[j]) {
                    profit += arrayData[i].profit;
                    total_job++;
                    status[j] = true;
                    break;
                }
            }
        }

        int ans[] = {profit, total_job};
        System.out.println(ans[0] + " profit");
        return ans;
    }
}