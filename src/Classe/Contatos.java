/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author WaLLySoN
 */
public class Contatos {

    int Id;
    String Nomes;
    String Apelidos;
    String Numero;

    public Contatos(int Id, String Nomes, String Apelidos, String Numero) {
        this.Id = Id;
        this.Nomes = Nomes;
        this.Apelidos = Apelidos;
        this.Numero = Numero;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomes() {
        return Nomes;
    }

    public void setNomes(String Nomes) {
        this.Nomes = Nomes;
    }

    public String getApelidos() {
        return Apelidos;
    }

    public void setApelidos(String Apelidos) {
        this.Apelidos = Apelidos;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

}
