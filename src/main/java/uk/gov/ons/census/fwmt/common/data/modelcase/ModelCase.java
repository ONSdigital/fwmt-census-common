package uk.gov.ons.census.fwmt.common.data.modelcase;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Case
 */
@Data
@NoArgsConstructor
public class ModelCase {
  private UUID id = null;
  private String reference = null;
  private TypeEnum type = null;
  private String surveyType = null;
  private String category = null;
  private String estabType = null;
  private String coordCode = null;
  private Contact contact = null;
  private Address address = null;
  private Location location = null;
  private String description = null;
  private String specialInstructions = null;
  private Boolean uaa = false;
  private Boolean sai = false;
  private CeCaseExtension ce = null;
  private CcsCaseExtension ccs = null;
  private CasePause pause = null;
  private List<Link> _links = null;

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCase _case = (ModelCase) o;
    return Objects.equals(this.id, _case.id) &&
        Objects.equals(this.reference, _case.reference) &&
        Objects.equals(this.type, _case.type) &&
        Objects.equals(this.surveyType, _case.surveyType) &&
        Objects.equals(this.category, _case.category) &&
        Objects.equals(this.estabType, _case.estabType) &&
        Objects.equals(this.coordCode, _case.coordCode) &&
        Objects.equals(this.contact, _case.contact) &&
        Objects.equals(this.address, _case.address) &&
        Objects.equals(this.location, _case.location) &&
        Objects.equals(this.description, _case.description) &&
        Objects.equals(this.specialInstructions, _case.specialInstructions) &&
        Objects.equals(this.uaa, _case.uaa) &&
        Objects.equals(this.sai, _case.sai) &&
        Objects.equals(this.ce, _case.ce) &&
        Objects.equals(this.ccs, _case.ccs) &&
        Objects.equals(this.pause, _case.pause) &&
        Objects.equals(this._links, _case._links);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, reference, type, surveyType, category, estabType, coordCode, contact, address, location, description,
            specialInstructions, uaa, sai, ce, ccs, pause, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCase {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    surveyType: ").append(toIndentedString(surveyType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    estabType: ").append(toIndentedString(estabType)).append("\n");
    sb.append("    coordCode: ").append(toIndentedString(coordCode)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
    sb.append("    uaa: ").append(toIndentedString(uaa)).append("\n");
    sb.append("    sai: ").append(toIndentedString(sai)).append("\n");
    sb.append("    ce: ").append(toIndentedString(ce)).append("\n");
    sb.append("    ccs: ").append(toIndentedString(ccs)).append("\n");
    sb.append("    pause: ").append(toIndentedString(pause)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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

  /**
   * Case Type.
   */
  public enum TypeEnum {
    HH("HH"),

    CE("CE"),

    CCS("CCS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
}