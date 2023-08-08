import com.alibaba.fastjson.JSON;
import com.git.hui.boot.multi.datasource.Application;
import com.git.hui.boot.multi.datasource.story.entity.ProjectDataInfo;
import com.git.hui.boot.multi.datasource.story.entity.ProjectDataInfoExample;
import com.git.hui.boot.multi.datasource.story.mapper.ProjectDataInfoMapper;
import com.google.common.base.CaseFormat;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PROJECT_NAME: boot-demo
 * @DESCRIPTION:
 * @USER: zhongweisheng
 * @DATE: 2023/8/1 10:52
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMybatis {


    @Resource
    private ProjectDataInfoMapper projectDataInfoMapper;

    @Test
    public void testGet() {
        ProjectDataInfo obj = new ProjectDataInfo();
        setObjFieldValue(obj, "orgId", "888");
        System.out.println(JSON.toJSONString(obj));


        String orgId = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "org_id");
        System.out.println(orgId);

        List<String> list = getColumnNameList();


        String filePath = "G:\\gitCode\\spring-boot-demo\\spring-boot\\109-multi-datasource-mybatis\\src\\test\\java\\print.txt";
        File f = new File(filePath);
        FileReader fr;
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            StringBuffer sb = new StringBuffer();
            sb.append("StringBuilder query = new StringBuilder(100);\r\n");
            // boolean is = true;
            String currentField = "";
            String valueRemark = "";
            while (line != null) {
                line = line.trim();
                boolean isColumnName = list.contains(line);
                if (isColumnName) {
                    String dbColumn = getClumnMap().get(line);
                    if (StringUtils.isNotEmpty(dbColumn)) {
                        String fieldName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, dbColumn);
//                        if(fieldName .equalsIgnoreCase(currentField)) {
//
//                        }
                        currentField = fieldName;
                    }
                } else {
                    if("remark".equalsIgnoreCase(currentField)){
                        while(line!=null && !"2.1询盘云开通申请".equalsIgnoreCase(line)) {
                            line = line.trim();
                            valueRemark +=line;
                            line = br.readLine();
                        }
                        setObjFieldValue(obj, currentField, valueRemark);
                    } else if (StringUtils.isNotEmpty(currentField)) {
                        String value = line.trim();
                        setObjFieldValue(obj, currentField, value);
                    }
                }
                line = br.readLine();
            }

            projectDataInfoMapper.insertSelective(obj);
            System.out.println(JSON.toJSONString(obj));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ProjectDataInfoExample example = new ProjectDataInfoExample();
        example.createCriteria().andOpenNumberEqualTo(obj.getOpenNumber());
        List<ProjectDataInfo> listAfter = projectDataInfoMapper.selectByExample(example);
        System.out.println(" 生成 成功：" + JSON.toJSONString(listAfter));

//        ProjectDataInfo projectDataInfo = new ProjectDataInfo();
//        projectDataInfo.setCompanyName();;
//        projectDataInfoMapper.insertSelective();

    }

    private void setObjFieldValue(ProjectDataInfo obj, String name, String value) {
        Class<?> clazz = ProjectDataInfo.class;

        // 获取字段对象
        Field field = null;
        try {
            field = clazz.getDeclaredField(name);
            // 设置字段的可访问性
            field.setAccessible(true);

            // 创建类的实例
//            ProjectDataInfo obj = new ProjectDataInfo();

            // 设置字段的值
            field.set(obj, value);
            System.out.println(JSON.toJSONString(obj));

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private List<String> getColumnNameList() {
        List<String> list = new ArrayList<>();
        list.add("询盘云开通编号");
        list.add("账号开通类别");
        list.add("项目公司名称");
        list.add("询盘云后台显示名称");
        list.add("询盘云到款项目");
        list.add("项目ID");
        list.add("询盘云企业ID");
        list.add("到款编号");
        list.add("到款日期");
        list.add("合同编号");
        list.add("客户类型");
        list.add("销售方式");
        list.add("询盘云销售类型");
        list.add("询盘云到款合同金额（元）");
        list.add("备注");
        list.add("询盘云开通版本");
        list.add("版本备注");
        list.add("询盘云客户方的负责人");
        list.add("客户方的负责人电话");
        list.add("客户负责人邮箱");
        list.add("账号数量（个）");
        list.add("询盘云开通日期");
        list.add("询盘云截止日期");
        list.add("询盘云购买时间（月）");
        list.add("销售询盘云赠送时间（月）");
        list.add("运营询盘云赠送时间（月）");
        list.add("询盘云使用时间（月）");
        list.add("询盘云使用时间（天）");
        list.add("WA账号多开");
        list.add("【废弃】询盘云运营负责人");
        return list;
    }

    private Map<String, String> getClumnMap() {
        Map<String, String> list = new HashMap<>();
        list.put("询盘云开通编号", "open_number");
        list.put("账号开通类别", "open_type");
        list.put("项目公司名称", "company_name");
        list.put("询盘云后台显示名称", "show_name");
        list.put("询盘云到款项目", "payment_item");
        list.put("项目ID", "item_id");
        list.put("询盘云企业ID", "org_id");
        list.put("到款编号", "payment_number");
        list.put("到款日期", "payment_date");
        list.put("合同编号", "contract_no");
        list.put("客户类型", "customer_type");
        list.put("销售方式", "sale_type");
        list.put("询盘云销售类型", "xpy_sale_type");
        list.put("询盘云到款合同金额（元）", "contract_money");
        list.put("备注", "remark");
        list.put("询盘云开通版本", "xpy_open_version");
        list.put("版本备注", "version_remark");
        list.put("询盘云客户方的负责人", "xpy_customer_manager");
        list.put("客户方的负责人电话", "customer_manager_phone");
        list.put("客户负责人邮箱", "customer_manager_mail");
        list.put("账号数量（个）", "account_count");
        list.put("询盘云开通日期", "xpy_open_date");
        list.put("询盘云截止日期", "xpy_close_date");
        list.put("询盘云购买时间（月）", "xpy_purchase_time_month");
        list.put("销售询盘云赠送时间（月）", "sale_xpy_gift_time_month");
        list.put("运营询盘云赠送时间（月）", "operate_xpy_gift_time_month");
        list.put("询盘云使用时间（月）", "xpy_use_time_month");
        list.put("询盘云使用时间（天）", "xpy_use_time_day");
        list.put("WA账号多开", "whatsapp_open");
        list.put("【废弃】询盘云运营负责人", "xpy_operate_manager");


        return list;
    }


    public static String getStringFromInputStream(InputStream inputStream) {
        String resultData = null;      //需要返回的结果
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int len = 0;
        try {
            while ((len = inputStream.read(data)) != -1) {
                byteArrayOutputStream.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        resultData = new String(byteArrayOutputStream.toByteArray());
        return resultData;
    }
}
