package org.example;
//Создать словарь HashMap. Обобщение <Integer, String>.
//Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
//Изменить значения сделав пол большой буквой.
//Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
//*Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.
// package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> Hashmap = new HashMap<>();
        Hashmap.put(1, "Иванов Иван Иванович 28 м");
        Hashmap.put(2, "Петрова Ирина Петровна 31 ж");
        Hashmap.put(3, "Васечкин Петр Васильев 34 м");
        Hashmap.put(4, "Семенова Светлана Сергеевна 25 ж");
        Hashmap.put(5, "Гришин Павел Алексеевич 37 м");


         for (String value: Hashmap.values()) {
            System.out.println(value.substring(value.length()-1).toUpperCase());
         }
        for (String value: Hashmap.values()) {
            System.out.printf( value.replaceAll("([А-Яа-я]+) ([А-Я])[а-я]+ ([А-Я])[а-я]+" , "$1 $2. $3."));
            System.out.println();
        }
    }
}
