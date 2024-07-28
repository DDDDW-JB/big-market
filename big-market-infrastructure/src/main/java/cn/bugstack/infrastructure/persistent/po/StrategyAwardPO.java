package cn.bugstack.infrastructure.persistent.po;

import lombok.Data;

/**
 * ClassName: StrategyAwardPO
 * Description:
 *
 * @Create 2024/7/28 23:02
 */
@Data
public class StrategyAwardPO {
    /**
     * 自增ID
     */
    private String id;
    /**
     *抽奖策略ID
     */
    private String strategyId;
    /**
     * 抽奖奖品ID - 内部流转使用
     */
    private String awardId;
    /**
     * 抽奖奖品标题
     */
    private String awardTitle;
    /**
     * 抽奖奖品副标题
     */
    private String awardSubtitle;
    /**
     * 奖品库存总量
     */
    private String awardCount;
    /**
     * 奖品库存剩余
     */
    private String awardCountSurplus;
    /**
     * 奖品中奖概率
     */
    private String awardRate;
    /**
     * 规则模型，rule配置的模型同步到此表，便于使用
     */
    private String ruleModels;
    /**
     * 排序
     */
    private String sort;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;
}
