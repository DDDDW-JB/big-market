package cn.bugstack.infrastructure.persistent.po;

import lombok.Data;

/**
 * ClassName: StrategyPO
 * Description:
 *
 * @Create 2024/7/28 23:01
 */
@Data
public class StrategyPO {
    /**
     * 自增ID
     */
    private String id;
    /**
     * 抽奖策略ID
     */
    private String strategyId;
    /**
     * 抽奖策略描述
     */
    private String strategyDesc;
    /**
     * 规则模型，rule配置的模型同步到此表，便于使用
     */
    private String ruleModels;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
}
