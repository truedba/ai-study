package com.aistudent;

import com.aistudent.semantic_similarity.vectors;

/**
 * AI Study Application
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to AI Study Project!");
        double[] vec1 = {1.0, 2.0, 3.0};
        double[] vec2 = {4.0, 5.0, 6.0};
        System.out.println("Dot product: " +  vectors.dotProduct(vec1, vec2));
    }
}
