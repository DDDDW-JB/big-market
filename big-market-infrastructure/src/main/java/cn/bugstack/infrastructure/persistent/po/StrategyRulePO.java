package cn.bugstack.infrastructure.persistent.po;

import lombok.Data;

/**
 * ClassName: StrategyRulePO
 * Description:
 *
 * @Create 2024/7/28 23:05
 */
@Data
public class StrategyRulePO {
    /**自增ID
     *
     */
    private String id;
    /**抽奖策略ID
     *
     */
    private String strategyId;
    /**抽奖奖品ID【规则类型为策略，则不需要奖品ID】
     *
     */
    private String awardId;
    /**抽象规则类型；1-策略规则、2-奖品规则
     *
     */
    private String ruleType;
    /**抽奖规则类型【rule_random - 随机值计算、rule_lock - 抽奖几次后解锁、rule_luck_award - 幸运奖(兜底奖品)】
     *
     */
    private String ruleModel;
    /**抽奖规则比值
     *
     */
    private String ruleValue;
    /**抽奖规则描述
     *
     */
    private String ruleDesc;
    /**创建时间
     *
     */
    private String createTime;
    /**更新时间
     *
     */
    private String updateTime;
}
