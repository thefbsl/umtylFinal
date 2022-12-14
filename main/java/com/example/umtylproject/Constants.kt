package com.example.umtylproject

object Constants{
    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        //1
        val que1 = Question(
            1, "Вставьте в предложение пропущенное слово: Мен … барамын.",
            "Дала", "Мектепке",
            "Үлкен", "Үйде",
            2
        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2, "Найдите мягкое слово",
            "Адам", "Іні",
            "Бала", "Қала",
            2
        )
        questionList.add(que2)

        //3
        val que3 = Question(
            3, "Дополните ряд местоимении. Менің, ..., сіздің, олардың",
            "Сенің", "Біздің",
            "Сен", "Сіз",
            1
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4, "Найдите правильный перевод предложения “Мои родители на работе”",
            "Оның ата-анасы жұмыста", "Біздің ата-анамыз жұмыста",
            "Менің ата-анам жұмыста", "Олардың ата-анасы жұмыста",
            3
        )
        questionList.add(que4)

        //5
        val que5 = Question(
            5, "Найдите правильный порядок дней недели.",
            "Сейсенбі, сәрсенбі, жұма ...", "Сенбі, жексенбі, сәрсенбі ..",
            "Дүйсенбі, сейсенбі, сәрсенбі ...", "Сәрсенбі, бейсенбі, жұма ...",
            3
        )
        questionList.add(que5)

        //6
        val que6 = Question(
            6, "Сколько мягких звуков в слове “Көйлек”?",
            "4", "3",
            "2", "1",
            3
        )
        questionList.add(que6)

        //7
        val que7 = Question(2, "Найдите правильно прописанную дату 15.01.2012г.",
            "Он бесінші ақпан екі мың он екінші жыл", "Он бесінші қаңтар екі мың он екінші жыл",
            "Он бесінші қараша екі мың он бірінші жыл", "Он бесінші қаңтар екі мың оныншы жыл",
            2
        )
        questionList.add(que7)

        //8
        val que8 = Question(
            2, "Найдите вопрос Шығыс септік (Исходного падежа)",
            "Кімнен? Неден?", "Кіммен ? Немен?",
            "Кімге? Неге?", "Кім? Не?",
            1
        )
        questionList.add(que8)

        //9
        val que9 = Question(
            2, "Найдите противоположенные слова.",
            "Қып- қызыл", "Айдын-айқын",
            "Қап-қара", "Ұзын-биік",
            4
        )
        questionList.add(que9)

        //10
        val que10 = Question(
            2, "Найдите слова синонимы.",
            "Әдемі, сұлу, көрікті", "Қуанышты, ренішті, ызалы",
            "Бұрынғы, қазіргі, ертеңгі", "Кеше, бүгін, ертең",
            1
        )
        questionList.add(que10)

        return questionList
    }
}