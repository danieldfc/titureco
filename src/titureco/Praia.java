/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titureco;

/**
 *
 * @author danielfelizardo
 */
public class Praia extends AtrativoTuristico {
  
  private boolean propriaParaBanho;
  private boolean perigoTubarao;
  private String tipoOrla;
  
  public static final String TIPO_PISCINA_NATURAL = "Piscinas naturais";
  public static final String TIPO_ONDAS_FORTES = "Ondas fortes";
  public static final String TIPO_ONDAS_MEDIAS = "Ondas médias";
  
  public Praia() {
    this("", 0.0, 0.0, "", "", "", true, false, "");
  }
  
  public Praia(
    String nome,
    double latitude,
    double longitude,
    String comoChegar,
    String cidade,
    String estado,
    boolean propriaParaBanho,
    boolean perigoTubarao,
    String tipoOrla
  ) {
    this.setNome(nome);
    this.setLatitude(latitude);
    this.setLongitude(longitude);
    this.setComoChegar(comoChegar);
    this.setCidade(cidade);
    this.setEstado(estado);
    this.propriaParaBanho = propriaParaBanho;
    this.perigoTubarao = perigoTubarao;
    this.tipoOrla = tipoOrla;
  }

  /**
   * @return the propriaParaBanho
   */
  public boolean ehPropriaParaBanho() {
    return propriaParaBanho;
  }

  /**
   * @param propriaParaBanho the propriaParaBanho to set
   */
  public void setPropriaParaBanho(boolean propriaParaBanho) {
    this.propriaParaBanho = propriaParaBanho;
  }

  /**
   * @return the perigoTubarao
   */
  public boolean temPerigoTubarao() {
    return perigoTubarao;
  }

  /**
   * @param perigoTubarao the perigoTubarao to set
   */
  public void setPerigoTubarao(boolean perigoTubarao) {
    this.perigoTubarao = perigoTubarao;
  }

  /**
   * @return the tipoOrla
   */
  public String getTipoOrla() {
    return tipoOrla;
  }

  /**
   * @param tipoOrla the tipoOrla to set
   */
  public void setTipoOrla(String tipoOrla) {
    this.tipoOrla = tipoOrla;
  }
}
