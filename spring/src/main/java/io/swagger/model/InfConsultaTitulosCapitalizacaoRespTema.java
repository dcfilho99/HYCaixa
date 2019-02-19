package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tema que sará utilizado para montar o layout do usuário.
 */
@ApiModel(description = "Tema que sará utilizado para montar o layout do usuário.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-19T20:47:48.942Z[GMT]")
public class InfConsultaTitulosCapitalizacaoRespTema   {
  @JsonProperty("estilos")
  private Object estilos = null;

  public InfConsultaTitulosCapitalizacaoRespTema estilos(Object estilos) {
    this.estilos = estilos;
    return this;
  }

  /**
   * Get estilos
   * @return estilos
  **/
  @ApiModelProperty(value = "")

  public Object getEstilos() {
    return estilos;
  }

  public void setEstilos(Object estilos) {
    this.estilos = estilos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaTitulosCapitalizacaoRespTema infConsultaTitulosCapitalizacaoRespTema = (InfConsultaTitulosCapitalizacaoRespTema) o;
    return Objects.equals(this.estilos, infConsultaTitulosCapitalizacaoRespTema.estilos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estilos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTitulosCapitalizacaoRespTema {\n");
    
    sb.append("    estilos: ").append(toIndentedString(estilos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
