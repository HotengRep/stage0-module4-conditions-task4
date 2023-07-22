package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int gretest = first;
       gretest  = first < second ?
               second:
               first;

       gretest = gretest < third ?
               third:
               gretest;

       System.out.println(gretest);
    }
}
