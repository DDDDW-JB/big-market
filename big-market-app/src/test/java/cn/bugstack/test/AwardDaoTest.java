package cn.bugstack.test;

import cn.bugstack.infrastructure.persistent.dao.IAwardDAO;
import cn.bugstack.infrastructure.persistent.po.AwardPO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 奖品持久化单元测试
 * @create 2023-12-16 13:36
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDAO awardDAO;

    @Test
    public void test_queryAwardList() {
        List<AwardPO> awards = awardDAO.queryAwardList();
        log.info("测试结果：{}", JSON.toJSONString(awards));
    }

}
