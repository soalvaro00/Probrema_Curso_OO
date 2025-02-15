package application;

import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Lesson> lessons = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int numberOfLessons = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfLessons; i++) {
            System.out.println("Dados da " + (i + 1) + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            String type = sc.nextLine();

            System.out.print("Título: ");
            String title = sc.nextLine();

            if (type.equalsIgnoreCase("c")) {
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int duration = sc.nextInt();
                sc.nextLine();

                lessons.add(new Video(title, url, duration));
            } else if (type.equalsIgnoreCase("t")) {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questions = sc.nextInt();
                sc.nextLine();

                lessons.add(new Task(title, description, questions));
            }
        }

        int totalDuration = 0;
        for (Lesson lesson : lessons) {
            totalDuration += lesson.duration();
        }

        System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");
    }
}


