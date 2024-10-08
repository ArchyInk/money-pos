package com.money.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.money.mb.base.BaseEntity;
import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author money
 * @since 2023-02-27
 */
@Getter
@Setter
@TableName("ums_member")
@Schema(description = "会员表")
public class UmsMember extends BaseEntity {

    @Schema(description="卡号")
    private String code;

    @Schema(description="会员名称")
    private String name;

    @Schema(description="会员类型")
    private String type;

    @Schema(description="手机号")
    private String phone;

    @Schema(description="省份")
    private String province;

    @Schema(description="城市")
    private String city;

    @Schema(description="地区")
    private String district;

    @Schema(description="详细地址")
    private String address;

    @Schema(description="抵用券")
    private BigDecimal coupon;

    @Schema(description="余额")
    private BigDecimal balance;

    @Schema(description="赠送金额")
    private BigDecimal giftAmount;

    @Schema(description="总消费金额")
    private BigDecimal consumeAmount;

    @Schema(description="消费抵用券")
    private BigDecimal consumeCoupon;

    @Schema(description="消费次数")
    private Integer consumeTimes;

    @Schema(description="取消次数")
    private Integer cancelTimes;

    @Schema(description="备注")
    private String remark;

    @Schema(description="逻辑删除")
    private Boolean deleted;

    @Schema(description="租户id")
    private Long tenantId;

}
