package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Car
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-06T09:02:27.806Z")

public class Car   {
  @JsonProperty("carNumber")
  private Long carNumber = null;

  @JsonProperty("category")
  private Category category = null;

  /**
   * Car status in the Show Room
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    SOLD("sold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public Car carNumber(Long carNumber) {
    this.carNumber = carNumber;
    return this;
  }

  /**
   * Get carNumber
   * @return carNumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getCarNumber() {
    return carNumber;
  }

  public void setCarNumber(Long carNumber) {
    this.carNumber = carNumber;
  }

  public Car category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Car status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Car status in the Show Room
   * @return status
  **/
  @ApiModelProperty(value = "Car status in the Show Room")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(this.carNumber, car.carNumber) &&
        Objects.equals(this.category, car.category) &&
        Objects.equals(this.status, car.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carNumber, category, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Car {\n");
    
    sb.append("    carNumber: ").append(toIndentedString(carNumber)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

