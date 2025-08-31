package edu.dosw.lab.Reto3;

import java.util.*;

public class PlanningPoker {
    static List<String> tareas = new ArrayList<>();
    static List<Integer> votos = new ArrayList<>();

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas que componen el grupo: ");
        int numeroPersonas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el numero de tareas por realizar: ");
        int numeroTareas = scanner.nextInt();
        for (int i = 0; i < numeroTareas; i++) {
            System.out.println("Tarea " + (i + 1) + ": ");
            String entrada = scanner.nextLine();
            tareas.add(entrada);
        }
        menu();
        while (true) {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println("Votacion Tarea " + (i + 1));
                for (int j = 0; i < numeroPersonas; i++) {
                    int votacion = scanner.nextInt();
                    votos.add(votacion);
                }
                ValidateVotes.validateVotesFibonacci(numeroPersonas, votos);
            }
        }

    }

    public static void menu() {
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + "." + tareas.get(i));
        }
    }

    public static void resumen(){
        System.out.println("---Resumen---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println("Tarea " + (i + 1) + ": " + tareas.get(i));
        }

    }

}
