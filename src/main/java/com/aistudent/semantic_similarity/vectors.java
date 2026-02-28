package com.aistudent.semantic_similarity;


public class vectors {
    public static double dotProduct(double[] vec1, double[] vec2) {
       double result = 0.0;
       if (vec1.length != vec2.length) {
           throw new IllegalArgumentException("Vectors must be of the same length");
       }
         for (int i = 0; i < vec1.length; i++) {
              result += vec1[i] * vec2[i];
    }
    return result; 
}

}
