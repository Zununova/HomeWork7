package com.example.myapplication.repositoryes

import com.example.myapplication.dataCalases.CatDataClass

class CatRepository {
    private val catList = mutableListOf<CatDataClass>()

    fun getCatList(): MutableList<CatDataClass> {
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/abisinskaya-1.jpg",
                "Абиссинская кошка",
                "Эта порода, выведенная в Великобритании," +
                        " — одна из самых древних в мире." +
                        " Её прародители были родом из Африки" +
                        " и Юго-Восточной Азии. За интересную экзотическую внешность," +
                        " напоминающую животных с древнеегипетских фресок," +
                        " и сияющий окрас их иногда называют «солнечными»."
            )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/amer-korotkoserst-1.jpg",
                "Американская короткошерстная кошка",
                "Это активные кошечки, которым очень" +
                        " интересен внешний мир. Несмотря на то" +
                        " что им важно находиться в обществе людей," +
                        " они известны своей независимостью. Хорошо " +
                        "уживаются с другими питомцами, отличаются" +
                        " крепким здоровьем и долголетием."
            )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/kerl1_1_0.jpg",
                "Американский кёрл",
                "Вывернутые на кончиках ушки" +
                        " с кисточками внутри ушной раковины," +
                        " слегка удивлённый взгляд из-за" +
                        " ореховидной формы глаз, вытянутая " +
                        "мордочка, стройное тело и мягкая, " +
                        "пушистая шерсть — характерные особенности" +
                        " породы американский кёрл. " +
                        "Все эти интересные особенности вы " +
                        "можете видеть на фото. Внешняя" +
                        " привлекательность очень гармонично " +
                        "сочетается с покладистым, ласковым," +
                        " общительным характером. Коты сохраняют" +
                        " бодрость и жизнерадостность котёнка до" +
                        " самой старости."

            )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/angora-3.jpg",
                "Ангорская кошка",
                "Белоснежные длинношёрстные" +
                        " коты были завезены из Турции," +
                        " поэтому их называют турецкой ангорой." +
                        " Сейчас животные со снежно-белым окрасом " +
                        "(как на фото) — большая редкость," +
                        " чаще всего встречаются особи с" +
                        " бело-серой или бело-рыжей шерстью." +
                        " Характерные особенности:"
            )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/bengal-1.jpg",
                "Бенгальская кошка",
                "Умный, красивый, " +
                        "послушный и игривый домашний " +
                        "мини-леопард — это портрет " +
                        "бенгальского кота. На фото можно " +
                        "увидеть, как сильно они похожи на " +
                        "своих диких предков. Благодаря" +
                        " характерному окрасу бенгала не " +
                        "спутаешь ни с одним другим " +
                        "представителем вида. От дикого " +
                        "животного он унаследовал гибкое " +
                        "мускулистое тело и проворность," +
                        " а интересные узоры на шерсти — " +
                        "результат многолетних трудов" +
                        " селекционеров. Среди представителей " +
                        "породы встречаются коты и кошечки с " +
                        "классическим и мраморным окрасами."

            )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/birman-3.jpg",
                "Бурманская кошка",
                "Красивый пушистый кот с сапфировыми глазами, густой шерстью и белыми лапками — это описание бирманца. История его происхождения овеяна красивыми легендами. До сих пор неизвестно, какие животные были родоначальниками. На фото видно, что по окрасу бирманец похож на сиама, но по характеру — его полная противоположность. Спокойные, любознательные животные не стесняются выражать свою любовь к хозяевам и в то же время, как истинные аристократы, не будут навязывать своё общество, если люди заняты и не могут уделить им внимания."
            )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/bombay-3.jpg",
                "Бомбейская кошка",
                "Если вам захочется продемонстрировать своего красивого питомца чужим людям, учитывайте, что эти животные могут быть очень щепетильны в своих чувствах. Нет никакой гарантии, что с незнакомцами они станут вести себя так же приветливо и дружелюбно, как с членами вашей семьи."
            )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/britanskaya-3.jpg",
                "Британская короткошерстная",
                "Британцы — чистокровные аристократы. Эти коты появились в XIX веке и к настоящему времени породные стандарты ни разу не менялись. «Плюшевая» кошечка с массивной головой и красивыми толстыми щёчками — одна из самых любимых и распространённых в мире. Практически любой узнает такого котика по фото. Фаворитом среди собратьев её делают прекрасные манеры и выразительная внешность."
            )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/cornish-reks-1.jpg",
                "Корниш-рекс",
                "На фото видно, насколько это интересные коты. Их внешность так далека от классических стандартов, что их можно принять за неземных существ. По телосложению корниш-рекс похож на борзую собаку — гибкое, мускулистое длинное тело, высокие лапы, длинный хлыстоподобный хвост. Тем не менее в изяществе ему не отказать. Чего стоит одна только густая, короткая, слегка кучерявая шерсть. На фоне худощавого тела и маленькой головы уши корниш-рекса выглядят огромными."
        )
        )
        catList.add(
            CatDataClass(
                "https://www.purina.ru/sites/default/files/2021-10/manchkin-1.jpg",
                "Манчкин",
                "В 1991 году эти красивые коротконогие котики с бархатистой плотной шубкой, представленные на выставке в Мэдисон Сквер Гарден, потерпели полное фиаско. Карликовый рост посчитали дефектом, но после того как учёными было доказано, что короткие ноги — это естественный генетический признак, порода манчкин была признана официально. Сегодня она очень популярна и легко узнаётся по фото."


        )
        )
       
        return catList
    }


}