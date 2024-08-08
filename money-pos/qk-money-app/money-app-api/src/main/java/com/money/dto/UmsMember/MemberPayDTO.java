package com.money.dto.UmsMember;

import com.money.common.dto.ValidGroup;
import com.money.dto.OmsOrderDetail.OmsOrderDetailDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "会员充值dto")
public class MemberPayDTO {
    private Long id;

    @Schema(description="手机号")
    @NotBlank(groups = {ValidGroup.Save.class, ValidGroup.Update.class})
    private String phone;

    @NotEmpty
    private BigDecimal amount;
}
