/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titureco;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author danielfelizardo
 */
public class Titureco {

  private List<AtrativoTuristico> atrativos;
  
  public Titureco() {
    this.atrativos = new ArrayList<AtrativoTuristico>();
  }
  
  public boolean cadastrarAtrativo(AtrativoTuristico atrativoTuristico) {
    for (AtrativoTuristico atrativo : this.atrativos) {
      if (atrativo.equals(atrativoTuristico)) {
        return false;
      }
    }
    
    this.atrativos.add(atrativoTuristico);
    return true;
  }
  
  public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
    AtrativoTuristico newAtrativo = new AtrativoTuristico(nomeAtrativo, 0.0, 0.0, "", cidade, estado);
    return this.atrativos.remove(newAtrativo);
  }
  
  public List<AtrativoTuristico> pesquisarAtrativosDaCidade(String cidade, String estado) {
    List<AtrativoTuristico> atrativosEncontrados = new ArrayList<AtrativoTuristico>();
    
    for (AtrativoTuristico atrativo: this.atrativos) {
      if (atrativo.getCidade().equals(cidade) && atrativo.getEstado().equals(estado)) {
        atrativosEncontrados.add(atrativo);
      }
    }
    
    return atrativosEncontrados;
  }
  
  public List<AtrativoTuristico> getAtrativos() {
    return this.atrativos;
  }
}
