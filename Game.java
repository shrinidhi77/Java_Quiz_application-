package com.quizapplication;

public class Game {
    Question[] questions = new Question[3];
    Player player = new Player();

    String[] questionsdata = {"Q1: Who is the strongest Avenger","Q2: What is the closest planet to the sun?","Q3: What is the capital of australia?"};
    String[] option1 = {"Ironman","Earth","Sydney"};
    String[] option2 = {"Thor","Venus","Melbourne"};
    String[] option3 = {"Hulk","Mercury","Perth"};
    String[] option4 = {"Dr Strange","Jupiter","Canberra"};
    int [] answers = {2,3,4};
    public void initGame()
    {
//        created 5 objects
        for (int i=0; i<3; i++)
        {
            questions[i] = new Question();
        }
//        applying value to the variable of the object
//        questions[0].question = "Q1: Who is the strongest Avenger";
//        questions[0].option1 = "Ironman";
//        questions[0].option2 = "Thor";
//        questions[0].option3 = "Hulk";
//        questions[0].option4 = "Dr Strange";
//        questions[0].correctAns = 2;
//
//        questions[1].question = "Q2: What is the closest planet to the sun?";
//        questions[1].option1 = "Earth";
//        questions[1].option2 = "Venus";
//        questions[1].option3 = "Mercury";
//        questions[1].option4 = "Jupiter";
//        questions[1].correctAns = 3;
//
//        questions[2].question = "Q3: What is the capital of australia?";
//        questions[2].option1 = "Sydney";
//        questions[2].option2 = "Melbourne";
//        questions[2].option3 = "Perth";
//        questions[2].option4 = "Canberra";
//        questions[2].correctAns = 4;

        for (int i=0;i<3;i++)
        {
            questions[i].question = questionsdata[i];
            questions[i].option1 = option1[i];
            questions[i].option2 = option2[i];
            questions[i].option3 = option3[i];
            questions[i].option4 = option4[i];
            questions[i].correctAns = answers[i];
        }
    }
    public void play()
    {
        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status = questions[i].askQuestion();
            if(status == true){
                player.score++;
                System.out.println("you played well for the above question..... your score is " + player.score);
                System.out.println(" ");
            }
            else{
                player.score--;
                System.out.println("Please go through the question one's again..... your score is " + player.score);
                System.out.println(" ");
            }
        }
        System.out.println(player.name+" your score is "+player.score);
    }
}
