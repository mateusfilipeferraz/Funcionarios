/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;

/**
 *
 * @author Mateus Ferraz
 */
public class Funcionarios {
    
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionarios() {
    }

    public Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void incrementosalario(double porcentagem){
        salario+=salario*porcentagem/100;
        
        
    }

    @Override
	public String toString() {
		return id + ", " + nome+ ", " + String.format("%.2f", salario);
	}
}
