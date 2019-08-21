# Envision - Radiology Critical Finding and Category Finding using NLP

## Problem Statement
- Our aim is to develop a model that will classify the provided radiology reports into Critical v/s Non-Critical.
- Model should be able to find critical findings and their respective categories  with  93% accuracy.

## Solution Proposal
- 13 Machine Learning Techniques and 10 Deep Learning models were developed. 
- These models are trained with 70% of the data and are tested on the rest 30% in order to find its accuracy. 

## Tools
- Google Colab for running code
- Scikit-Learn for ML models
- Keras/PyTorch  for DL models

## Scope of delivery from AU
- Our target is to achieve at-least 93 % accuracy of finding the critical cases.
- Deliver the model and the final results.

## WorkFlow model

1. Data Interpretation
2. Exploratory Data Analysis
3. Data cleaning / Data preprocessing
4. Word Embedding
5. Model Definition
6. Model Fitting & Validation

### Text Pre-Processing
1. Tags Removal
2. Conversion of Corpus to Lower Case
3. Contraction Removal
4. Replacing words not in Word Embeddings
5. Punctuations and Numbers Removal
6. Stopwords Removal
7.Removal of Smaller length words (len<= 2)
8. Tokenization
9. Lemmatization

### Data Preparation
- Removing stop words hampered models performance, so we chose to retain them in text data.
- Converted the problem into binary classification by marking ‘Complete Physician Decline ’ as ‘Complete Critical Finding’.

### Word Embeddings used

1. Bag of Words (BOW)
2. TF-IDF (1-Gram, 2-Gram, 3-Gram)
3. TF-IDF x GloVe
4. TF-IDF x Word2Vec
5. GloVe (Pre-Trained/ Trained) - developed by Stanford University
6. Word2Vec (Pre-Trained/ Trained) - developed by Google
7. FastText (Pre-Trained/ Trained) - developed by Facebook
8. Keras Embeddings

##Models under consideration

### ML Models
1. KNN
2. SVC (linear)
3. SVC (rbf)
4. Decision Tree
5. Random Forest
6. Extra-Trees
7. Gradient Boosting
8. AdaBoost
9. XGB
10. Logistic Regression
11. MultiLayer Perceptron
12. Bagging
13. Ensemble (all above models)

### DL Models
1. Conv1D
2. LSTM
3. Bi-LSTM
4. Conv1D + LSTM
5. Conv1D + Bi-LSTM
6. Pretrained-BERT
7. Pretrained-XLNET
8. BERT
9. XLNET

##











