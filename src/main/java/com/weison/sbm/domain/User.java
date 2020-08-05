package com.weison.sbm.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User extends BaseEntity {
    /**
     * 业务方帐号ID
     */
    private int accId;
    /**
     * 业务方帐号名称
     */
    private String accName;
    /**
     * 业务线订单号
     */
    private String orderId;
    /**
     * 业务线订单详情
     */
    private String orderDesc;
    /**
     * 三方支付流水号
     */
    private String uniqueOrderNo;
    /**
     * 商户订单号
     */
    private String tradeOrderId;
    /**
     * 易宝专有:银行订单号
     */
    private String bankOrderNo;
    /**
     * 易宝专有:银行流水号
     */
    private String bankTrxId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 公众号ID
     */
    private String appId;
    /**
     * 用户OpenId
     */
    private String openId;
    /**
     * 用户银行账户
     */
    private String bankAccountNo;
    /**
     * 用户开户行名称
     */
    private String bankName;
    /**
     * 用户银行行号
     */
    private String bankNo;
    /**
     * 请求出款金额
     */
    private int reqOrderAmount;
    /**
     * 实际出款金额
     */
    private int orderAmount;
    /**
     * 请求出款产品
     */
    private String reqGoodsParamExt;
    /**
     * 出款日期
     */
    private String payOutSuccessDate;
    /**
     * 出款状态 PayStatusEnum
     */
    private String payStatus;
    /**
     * 出款金额
     */
    private int payAmount;
    /**
     * 支付产品编码
     */
    private String payProductCode;
    /**
     * 付款银行编码
     */
    private String bankId;
    /**
     * 付款卡号
     */
    private String pyerAcctId;
    /**
     * 付款人卡类型
     */
    private String cardType;
    /**
     * 资金处理类型
     */
    private String fundProcessType;
    /**
     * 币种:人民币
     */
    private String currency;
    /**
     * 平台分类
     */
    private String platformType;
    /**
     * 业务类型
     */
    private String bizType;
    /**
     * 支付服务商类型
     */
    private String providerType;
    /**
     * 手续费用，单位分
     */
    private int tradeFee;
    /**
     * 手续费率
     */
    private String tradeFeeRate;
    /**
     * 同步出款状态次数
     */
    private int syncPayCount;
}
