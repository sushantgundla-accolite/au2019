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

**ML Model COmparison**
![ML Models Comparison](https://user-images.githubusercontent.com/52782749/63433737-6bae1580-c441-11e9-910c-64f9c6036f80.png)

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

**DL Model COmparison**
![DL Models Comparison](https://user-images.githubusercontent.com/52782749/63433680-48836600-c441-11e9-9624-cb92ab49c49e.png)

## Bert and XLNet - Expectations

- Bert(Base) trained on sample data for 5 epochs gave 89.55% accuracy.
- With increase in number of samples and number of epochs, Bert is considered to perform better than most of the models.

- XLNet(Base) trained on sample data for 50 epochs gave 87.66% accuracy.
- XLNet is considered to outperform even BERT with increase in data.

## Conclusions
- The ML models give better accuracy with the given sample data as compared to  Deep Learning model.
- As the data increases, the Deep Learning model is considered to give more accurate results.

## Next Steps
- Bigger data set - 6.5mil+ records.
- Run Top 5 ML and DL models on the data set and filter top 3 models.
- Test on shortlisted models with the additional data and share the results.
- Work on second model for ‘Category’ prediction.
- Automate SpellCheck and replace
- Try some new techniques:
  - BioASQ - PubMed + Word2Vec
  - PubMed + PMC
  - Doc2Vec

##
















