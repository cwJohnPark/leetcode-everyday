package leetcode.may;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KClosest {
    public static void main(String[] args) {
        int[][] a = {{3,3},{5,-1},{-2,4}};
        int[][] r = kClosest(a,2);
        Arrays.stream(r).forEach( (e) -> {
            System.out.println(Arrays.toString(e));
        });
    }

    public static int[][] kClosest(int[][] points, int K) {
        int[][] closests = new int[K][2];

        List<Closest> list = Closest.toClosest(points)
                .stream().sorted().collect(Collectors.toList());
        IntStream.range(0, K)
                .forEach(idx -> {
                    closests[idx] = points[list.get(idx).n];
                });

        return closests;
    }

    static class Closest implements Comparable<Closest> {
        private int n;
        private double sqrt;

        public Closest(int n, double sqrt) {
            this. n = n;
            this.sqrt = sqrt;
        }

        @Override
        public int compareTo(Closest o) {
            return Double.compare(this.sqrt, o.sqrt);
        }

        @Override
        public String toString() {
            return n + " : " + sqrt;
        }

        public static List<Closest> toClosest(int[][] a) {
            AtomicInteger i = new AtomicInteger(0);
            return Arrays.stream(a).map( e -> {
                return new Closest(i.getAndIncrement(), Math.sqrt(e[0]*e[0] + e[1]*e[1]));
            }).collect(Collectors.toList());
        }
    }

}
