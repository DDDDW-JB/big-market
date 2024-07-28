package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.AwardPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: IAwardDAO
 * Description:
 *
 * @Create 2024/7/28 23:09
 */
@Mapper
public interface IAwardDAO {

    public List<AwardPO> queryAwardList();
}
