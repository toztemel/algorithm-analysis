package my.algorithm.app.chapter.one;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by tayfuno on 28/11/14.
 */
public class SelectionProblem {

    Double[] N;

    SelectionProblem() {
        build(100);
    }

    SelectionProblem(int size) {
        build(size);
    }

    void build(int size) {
        N = new Double[size];
        for (int i =0; i < size; i++) {
            N[i] = new Double(Math.random());
        }
    }

    double findLargest(int k) throws IllegalArgumentException {
        if (k >= N.length) {
            throw new IllegalArgumentException(k + " must be less than " + N.length);
        }

        List l = Arrays.asList(N);

        Collections.sort(l);

        return (Double) l.get(k);
    }
}
