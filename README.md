# Stock-Price-Prediction-System
I developed a Stock Price Prediction System in Java to enhance my skills in data structures and algorithms (DSA). This project analyzes historical stock data to predict future profits or losses. It features an intuitive interface for data input, efficient daily profit/loss computation, and future profit prediction based on trends. 

This Java program, StockPricePrediction, allows users to input historical stock prices along with corresponding buy and sell prices for each day. It then predicts the profit for a specified number of future days based on historical data.

How to Run the Code
Compile the Code: Ensure you have Java installed on your machine. Save the code in a file named StockPricePrediction.java.

bash
Copy code
javac StockPricePrediction.java
Run the Code: Execute the compiled Java program.

bash
Copy code
java StockPricePrediction
Code Explanation
The code consists of a main method for user interaction and a predictFutureProfit method for calculating predicted profits.

Main Method
Input Collection:

Prompts the user to enter the number of historical days.
Collects stock prices, buy prices, and sell prices for each day.
Prompts the user to enter the number of days for future profit prediction.
Profit Prediction:

Calls predictFutureProfit method to calculate the predicted profit.
Displays the predicted profit for the specified number of future days.
predictFutureProfit Method
Profit Calculation:
Iterates through historical prices to compute daily profits (difference between sell and buy prices).
Calculates the average profit per day.
Predicts future profit by multiplying the average daily profit by the number of future days.
Example Input and Output
Example Input:
plaintext
Copy code
Enter the number of historical days:
3
Enter the stock price for day 1:
100
Enter the buy price for day 1:
95
Enter the sell price for day 1:
105
Enter the stock price for day 2:
110
Enter the buy price for day 2:
100
Enter the sell price for day 2:
115
Enter the stock price for day 3:
120
Enter the buy price for day 3:
115
Enter the sell price for day 3:
125
Enter the number of days for future prediction:
5
Example Output:
plaintext
Copy code
Predicted profit for the next 5 days: $25.0
In this example, the average daily profit is calculated based on the provided historical data, and then this average is used to predict the profit over the specified future period.
