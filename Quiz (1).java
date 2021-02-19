
public class Quiz {

	public static void main(String[] args) {
        
        Question question = new MultipleChoiceQuestion("What is your favorite laptop Model?",
                "Samsung",
                "HP",
                "Lenovo",
                "Sony",
                "Dell",
                "D");


        question.check();


// Question 2 - Just reuse variable question1
        question = new MultipleChoiceQuestion("What is your favorite TV model?",
                "Samsung",
                "LG",
                "Panasonic",
                "Sony",
                "Hisense",
                "A");


        question.check();


        question = new MultipleChoiceQuestion("What is your favorite sport?",
                "Football",
                "Boxing",
                "Wrestling",
                "Baseball",
                "Neither",
                "A");
        question.check();


        question = new MultipleChoiceQuestion("Which country has the highest population on earth?",
                "Russia",
                "China",
                "USA",
                "Zambia",
                "Sudan",
                "B");
        question.check();


        question = new MultipleChoiceQuestion("Which country has good global market in fishing?",
                "China",
                "USA",
                "Japan",
                "Ethopia",
                "Congo",
                "C");
        question.check();


        //true or false questions here
        question = new TrueFalseQuestion("The longest human hair was measured at over 5 meters long.", "true");
        question.check();


        question = new TrueFalseQuestion("You would weigh more on Mars than on Earth.", "false");
        question.check();


        question = new TrueFalseQuestion("White Rhinos are white.", "FALSE");
        question.check();
        //we show the results of the quiz
        question.showResults();
    }
}

