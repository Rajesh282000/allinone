package com.BString;

public class CountWord {

        public static void main(String[] args) {
            String sentence = "This study explores the application of nature-inspired feature selection techniques for predicting customer churn rates in the telecommunications sector. Using the IBM Telco customer churn dataset as the basis, we aim to develop an effective churn prediction model employing machine learning methodologies. The chosen approach involves utilizing Support Vector Machine (SVM) as the primary classifier for churn prediction.\n" +
                    "\n" +
                    "To enhance the predictive performance of the SVM model, we investigate the efficacy of three nature-inspired optimization algorithms: Cuckoo Search Algorithm (CS), Firefly Algorithm (FA), and Grey Wolf Optimizer (GWO). Each algorithm is implemented separately to optimize the parameters of the SVM model, thus refining its predictive capabilities.\n" +
                    "\n" +
                    "Following optimization, the SVM model is trained on the training dataset using the optimized parameters. Subsequently, the performance of the optimized SVM model is evaluated using the testing dataset. Evaluation metrics such as accuracy, precision, recall, F1-score, and ROC AUC are computed to assess the model's predictive accuracy and robustness.\n" +
                    "\n" +
                    "Furthermore, experimentation is conducted by varying parameter settings (e.g., population size, mutation rate) for each optimization algorithm. This allows us to identify the most effective combination of parameters that yield optimal results for enhancing the SVM model's predictive accuracy. Through systematic experimentation and analysis, this study aims to contribute insights into the application of nature-inspired optimization techniques for improving churn prediction in the telecommunications industry.\n";
            int wordCount = countWords(sentence);
            System.out.println("Number of words in the sentence: " + wordCount);
        }

        public static int countWords(String sentence) {
            // Split the sentence into words using whitespace as delimiter
            String[] words = sentence.split("\\s+");
            // Return the number of words
            return words.length;
        }

}
