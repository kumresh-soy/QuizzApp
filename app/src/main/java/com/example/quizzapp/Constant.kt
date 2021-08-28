package com.example.quizzapp

object Constant {
    fun getQuestions(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "Choose out the odd one.",
            "Curd",
            "Butter",
            "Cheese",
            "Oil",
            4
        )
        val que2 = Questions(
            2,
            "Choose out the odd one.",
            "Sword",
            "Gun",
            "Rifle",
            "Canon",
            1
        )

        val que3 = Questions(
            3,
            "Choose out the odd one.",
            "Rose",
            "Lotus",
            "Lily",
            "Marigold",
            2
        )
        val que4 = Questions(
            4,
            "Choose out the odd one.",
            "Book",
            "Paper",
            "Pencil",
            "Pen",
            1
        )
        val que5 = Questions(
            5,
            "Choose out the odd one.",
            "Geometry",
            "Algebra",
            "Trigonometry",
            "Mathematics",
            4
        )
        val que6 = Questions(
            6,
            "Choose out the odd one.",
            "Carrot",
            "Potato",
            "Tomato",
            "Ginger",
            3
        )
        val que7 = Questions(
            7,
            "Choose out the odd one.",
            "Eagle",
            "Kiwi",
            "Penguin",
            "Ostrich",
            1
        )
        val que8 = Questions(
            8,
            "Choose out the odd one.",
            "Lake",
            "Sea",
            "Pond",
            "River",
            4
        )
        val que9 = Questions(
            9,
            "Choose out the odd one.",
            "Sword",
            "Gun",
            "Rifle",
            "Canon",
            1
        )
        val que10 = Questions(
            10,
            "Choose out the odd one.",
            "Axe",
            "Knife",
            "Sword",
            "Arrow",
            4
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }
}