
package atividade4;

import java.util.ArrayList;
import java.util.List;


class Pagamentos {
    private String nomeEmpresa;
    private List<Imposto> impostos;

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public double calcularTotalImpostos() {
        double totalImpostos = 0;
        for (Imposto imposto : impostos) {
            totalImpostos += imposto.calcularImposto();
        }
        return totalImpostos;
    }

    String getNomeEmpresa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Iterable<Imposto> getImpostos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 }   
    