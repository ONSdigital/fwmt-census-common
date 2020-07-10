package uk.gov.ons.census.fwmt.common.data.ce;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.fwmt.common.data.shared.CommonOutcome;
import uk.gov.ons.census.fwmt.common.data.shared.CeDetails;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class CENewStandaloneAddress extends CommonOutcome {

  @ApiModelProperty(notes = "Flag to indicate whether Dummy Information has been collected")
  private Boolean dummyInfoCollected;

  @ApiModelProperty(notes = "Populated with the CE SPG details")
  private CeDetails ceDetails;

}

