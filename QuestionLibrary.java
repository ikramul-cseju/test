package com.example.androidlab_1;

public class QuestionLibrary {

        private String[] mQuestion = {
                "Which part of the plant holds it in the soil?",
                "This part of soil absorbe energy from the sun",
                "This part of soil attracts bees,butterfles & hummingbirds.",
                "The _________ holds the plant upright."

        };
        private String mChoices[] []={
                {"Roots","Stem"," Flower"},
                {"Fruit","Leaves","Seeds"},
                { " Bark","Flower","Roots"},
                {"Flower","Leaves","Stem"}
        };
        private String mCorrectAnswer[]={"Roots","Leaves","Flower","Stem"};

        public String getQuestion(int a){
            String question = mQuestion[a];
            return question;
        }

        public String getChoice1(int a){
            String choice0=mChoices[a][0];
            return choice0;

        }

    public String getChoice2(int a){
        String choice1=mChoices[a][1];
        return choice1;

    }
    public String getChoice3(int a){
        String choice2=mChoices[a][2];
        return choice2;

    }

    public String getmCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}

