package com.jelly;

public class Main {

    public static void main(String[] args) {
        // Question 1
        StringBuilder output = new StringBuilder().append("Q1) 5!\n");
        for (int result = 5, i = 1; i < 5 ; i++) {
            result *= i;
            if (i == 4) output.append(result).append('\n');
        }

        // Question 2
        output.append("\nQ2) 10^4\n");
        for (int result = 10, i = 0; i < 3; i++) {
            result *= 10;
            if (i == 2) output.append(result).append('\n');
        }

        // Question 3
        output.append("\nQ3) Find the slope between 12,24 and 13,48\n");
        double slope;
        double[] a = {12, 24},
                b = {13, 48};
        output.append(slope = (b[1] - a[1]) / (b[0] - a[0])).append('\n');

        // Question 4
        output.append("\nQ4) Find the Y intercept of the above line\n");
        double yIntercept;
        output.append(yIntercept = (slope * (0 - a[0])) + a[1]).append('\n');

        // Question 5
        output.append("\nQ5) Write the linear equation\n");
        output.append("y = ").append("(").append(slope).append(" * x").append(") + ").append(yIntercept).append('\n');

        // Output
        System.out.print(output.toString());
    }
}
