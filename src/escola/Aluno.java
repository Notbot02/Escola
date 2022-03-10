/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author 040069
 */
public class Aluno 
{
    private String nome;
    private int faltas;
    private double nota1, nota2;

    public Aluno(String nome) 
    {
        this.nome = nome;
        faltas= 0;
        nota1= 0;
        nota2= 0;
    }

    // Getters
    public String getNome() 
    {
        return nome;
    }

    public int getFaltas() 
    {
        return faltas;
    }

    public double getNota1() 
    {
        return nota1;
    }

    public double getNota2() 
    {
        return nota2;
    }
    
    // Setters

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    // Métodos
    public void faltou()
    {
        faltas++;
    }
    
    public void prova1(double nota1)
    {
        if(nota1 >=0 && nota1 <= 10)
            this.nota1= nota1;
    }
    
    public void prova2(double nota2)
    {
        if(nota2 >= 0 && nota2 <= 10)
            this.nota2= nota2;
    }
    
    public double media()
    {
        return (nota1 + nota2) / 2;
    }
    
    public boolean aprovado()
    {
        return (media() >= 6) && (faltas <= 20);
    }
    
    public void resultado()
    {
        System.out.println(
           "Nome: " + nome + "\n" +
           "Faltas: " + faltas + "\n" +
           "Nota 1: " + nota1 + "\n" +
           "Nota 2: " + nota2 + "\n" +
           "Média : " + media() + "\n" +
           "Aprovado: " + (aprovado()?"Sim":"Não") 
        );
    }
    
}
