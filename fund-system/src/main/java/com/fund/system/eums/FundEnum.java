package com.fund.system.eums;

public class FundEnum {
    public enum FundTypeEnum {
        REN("1", "认购期"),
        SHEN("2", "申购期"),
        FENG("3", "封闭期"),
        QING("4", "清盘"),
        ;
        private String value;
        private String code;

        FundTypeEnum(String code, String value) {
            this.code = code;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String getCode() {
            return code;
        }
        public static FundTypeEnum codeOf(String code) {
            for (FundTypeEnum fundTypeEnum : values()) {
                if (fundTypeEnum.getCode().equals(code)) {
                    return fundTypeEnum;
                }
            }
            throw new RuntimeException("么有找到对应的枚举");
        }
    }

    public enum FundNoticeTypeEnum {
        REN("1", "基金公告"),
        SHEN("2", "定期报告"),
        FENG("3", "法律文件"),
        ;
        private String value;
        private String code;

        FundNoticeTypeEnum(String code, String value) {
            this.code = code;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String getCode() {
            return code;
        }
        public static FundNoticeTypeEnum codeOf(String code) {
            for (FundNoticeTypeEnum fundNoticeTypeEnum : values()) {
                if (fundNoticeTypeEnum.getCode().equals(code)) {
                    return fundNoticeTypeEnum;
                }
            }
            throw new RuntimeException("么有找到对应的枚举");
        }
    }
}
