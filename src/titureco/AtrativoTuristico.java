/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titureco;

import java.util.Objects;

/**
 *
 * @author danielfelizardo
 */
public class AtrativoTuristico {
  
   private String nome;
   private double latitude;
   private double longitude;
   private String comoChegar;
   private String cidade;
   private String estado;
   
   public AtrativoTuristico() {
     this("", 0.0, 0.0, "", "", "");
   }

   public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado) {
     this.nome = nome;
     this.latitude = latitude;
     this.longitude = longitude;
     this.comoChegar = comoChegar;
     this.cidade = cidade;
     this.estado = estado;
   }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the latitude
   */
  public double getLatitude() {
    return latitude;
  }

  /**
   * @param latitude the latitude to set
   */
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  /**
   * @return the longitude
   */
  public double getLongitude() {
    return longitude;
  }

  /**
   * @param longitude the longitude to set
   */
  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  /**
   * @return the comoChegar
   */
  public String getComoChegar() {
    return comoChegar;
  }

  /**
   * @param comoChegar the comoChegar to set
   */
  public void setComoChegar(String comoChegar) {
    this.comoChegar = comoChegar;
  }

  /**
   * @return the cidade
   */
  public String getCidade() {
    return cidade;
  }

  /**
   * @param cidade the cidade to set
   */
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  /**
   * @return the estado
   */
  public String getEstado() {
    return estado;
  }

  /**
   * @param estado the estado to set
   */
  public void setEstado(String estado) {
    this.estado = estado;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + Objects.hashCode(this.nome);
    hash = 59 * hash + Objects.hashCode(this.cidade);
    hash = 59 * hash + Objects.hashCode(this.estado);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final AtrativoTuristico other = (AtrativoTuristico) obj;
    if (!Objects.equals(this.nome, other.nome)) {
      return false;
    }
    if (!Objects.equals(this.cidade, other.cidade)) {
      return false;
    }
    if (!Objects.equals(this.estado, other.estado)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "O atrativo turístico '"+ this.nome +
      "' do estado da(o) "+this.estado +
      ", na cidade de(a) "+ this.cidade +
      ", você poderá chegar: "+ this.comoChegar + ".";
  }
}
