package com.kouichi;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<student> studentList = List.of
                (new student("カイト", 6, "大分県"),
                        (new student("タク", 7, "福岡県")),
                        (new student("ナナ", 5, "熊本県")),
                        (new student("ワタル", 5, "熊本県")),
                        (new student("ハルカ", 6, "大分県")),
                        (new student("クミ", 7, "福岡県")),
                        (new student("タロウ", 5, "大分県")),
                        (new student("イッセイ", 6, "熊本県")),
                        (new student("リク", 7, "大分県"))
                );
        System.out.println("福岡県出身");
        for (student student : studentList) {
            if (student.getBirthplace().equals("福岡県")) {
                System.out.println(student.getName());
            }
        }
        System.out.println("");
        System.out.println("大分県出身");
        for (student student : studentList) {
            if (student.getBirthplace().equals("大分県")) {
                System.out.println(student.getName());
            }
        }
        System.out.println("");
        System.out.println("熊本県出身");
        for (student student : studentList) {
            if (student.getBirthplace().equals("熊本県")) {
                System.out.println(student.getName());
            }
        }
        System.out.println("");
        System.out.println("以下の子は５歳以下なので、このアトラクションは使えません。");
        for (student student : studentList) {
            if (student.getAge() <= 5) {
                System.out.println(student.getName());
            }

        }
        System.out.println("");
        teacher teacher1 = new teacher("中田先生");
        System.out.println(teacher1.getName());

        System.out.println("先生の名前を訂正します。");
        teacher teacher = new teacher("田中先生");
        System.out.println(teacher.getName());

    }
}