/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mateus Ferraz
 */
public class Aplicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário#" + (i + 1) + ":");

            System.out.print("Id:");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {                
                System.out.println("Id já exist! Tente novamente:");
                 id = sc.nextInt();
            }
            System.out.print("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salario:");
            Double salario = sc.nextDouble();
            System.out.println("");
            Funcionarios funci = new Funcionarios(id, nome, salario);

            list.add(funci);
        }
        System.out.println("");
        System.out.println("Informe o id do funcionário que terá aumento salarial:");
        int idfuncionario = sc.nextInt();
        // Integer pos = posicao(list, idfuncionario);
        Funcionarios funci = list.stream().filter(x -> x.getId() == idfuncionario).findFirst().orElse(null);
        // if (pos == null) {
        if (funci == null) {
            System.out.println("Esse id  não existe ");
        } else {

            System.out.print("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();
            funci.incrementosalario(porcentagem);
            // list.get(pos).incrementosalario(porcentagem);
        }
        System.out.println("");
        System.out.println("Lista funcionarios:");
        for (Funcionarios e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer posicao(List<Funcionarios> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionarios> list, int id) {
        Funcionarios func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;

    }
}
