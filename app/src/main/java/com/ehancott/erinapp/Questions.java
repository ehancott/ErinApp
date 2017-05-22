package com.ehancott.erinapp;


public class Questions {

    public String questions[] = {
            "<b> tag makes the enclosed text bold. What is the other tag to make text bold?",
            "Which tag allows you to add a row in a table?",
            "What is the correct HTML for making a hyperlink?",
            "Choose the correct HTML tag for the smallest size heading.",
            "What is the correct HTML tag for inserting a line break?",
            "What does vlink attribute mean?",
            "Which attribute is used to name an element uniquely?",
            "Which of the following is not a pair tag?",
            "The _____ character tells browsers to stop tagging the text",
            "Which of the following is not a style tag?",
            "Which of the following HTML code is valid?",
            "HTML supports:",
            "When should you use path along with file name of picture in IMG tag?",
            "What does the acronym WWW stand for?",
            "What does HTML stand for?",
            "What does a cascading style sheet do?",
            "b",
            "b",
            "b",
            "b",
            "b",
            "b",
            "b",
    };

    private String choices[][] = {
            {"<strong>", "<dark>", "<bold>", "<emp>"},
            {"<td> and </td>", "<cr> and </cr>", "c. <th> and </th>", "<tr> and </tr>"},
            {"<a href='http://google.com'>Google</a>", "a name='http://google.com'>Google</a>", "<http://google.com</a>", "url='http://google.com'>Google"},
            {"<heading>", "<h6>", "<h1>", "<head>"},
            {"<br>", "<lb>", "<linebreak>", "<newline>"},
            {"Visited link", "Virtual link", "Very good link", "Active link"},
            {"class", "id", "element_name", "All of the above"},
            {"<p>", "<u>", "<i>", "<img>"},
            {"?", "/", ">", "%"},
            {"<b>", "<tt>", "<i>", "All of the above"},
            {"<font colour='red'>", "<red><font>", "<font color='red'>", "All of the above"},
            {"Ordered lists", "Unordered Lists", "Both ordered and unordered lists", "Neither ordered or unordered lists"},
            {"Path is optional and not necessary", "when image file and html file both are on same location","when the location of image file and html file are different", "path is always necessary when inserting image"},
            {"Web Wide Wave", "World Wide Web","Web Warriors Win", "Windows World Web"},
            {"Hypertext Markup Language", "b", "c", "d"},
            {"Makes your browser window bigger","It makes your page cascade", "Controls the way your content looks (or is presented)", "Controls the scripts in your web page."},
            {"b", "b", "b", "b"},
            {"b", "b", "b", "b"},
            {"b", "b", "b", "b"},
            {"b", "b", "b", "b"},
            {"b", "b", "b", "b"},
            {"b", "b", "b", "b"},
            {"b", "b", "b", "b"}



    };

    int qlength = questions.length;

    private String correctAnswers[] = {"<strong>", "<tr> and </tr>", "<a href='http://google.com'>Google</a>", "<h6>", "<br>", "Visited link", "id", "<img>", "/", "All of the above", "<font color='red'>", "Both ordered and unordered lists", "when the location of image file and html file are different", "World Wide Web", "Hypertext Markup Language", "Controls the way your content looks (or is presented)", "b", "b", "b", "b", "b", "b", "b"};

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = correctAnswers[a];
        return answer;
    }
}

