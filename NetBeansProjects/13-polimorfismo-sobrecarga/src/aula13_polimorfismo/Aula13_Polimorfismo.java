/*
 * Parte 2 da aula sobre Polimorfismo.
 * Assunto: Polimorfismo de Sobrecarga.
 */
package aula13_polimorfismo;
public class Aula13_Polimorfismo {
    public static void main(String[] args) {
        // Programa Principal
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
        
        c.reagir("Olá"); //Frase amigável
        c.reagir("Vai Apanhar"); //Frase não amigável
        c.reagir(11, 45); // manhã
        c.reagir(21, 00); // noite
        c.reagir(true); // dono
        c.reagir(false); // .nao. dono
        c.reagir(2, 12.5f); // novo e pesado
        c.reagir(17, 4.5f); // velho e leve
        l.emitirSom();
    }
    
}
