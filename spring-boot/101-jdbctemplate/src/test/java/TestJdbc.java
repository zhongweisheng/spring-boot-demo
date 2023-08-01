import com.git.hui.boot.jdbc.Application;
import com.git.hui.boot.jdbc.insert.InsertService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @PROJECT_NAME: boot-demo
 * @DESCRIPTION:
 * @USER: zhongweisheng
 * @DATE: 2023/8/1 10:52
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestJdbc {


    @Resource
    private InsertService insertService;

    @Test
    public void testGet() {

        insertService.basicInsert();
    }
}
