///*
// * Copyright (c) 2010 CCX(China) Co.,Ltd. All Rights Reserved.
// *
// * This software is the confidential and proprietary information of
// * CCX(China) Co.,Ltd. ("Confidential Information").
// * It may not be copied or reproduced in any manner without the express
// * written permission of CCX(China) Co.,Ltd.
// *
// * @author zhongweisheng
// * Date: 2012-1-5 上午11:35:19
// */
//
//import com.google.common.base.CaseFormat;
//
//import java.io.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * @author zhongweisheng
// */
//public class SaveSqlUtil {
//    private static boolean isSave = true;
//    private static String defaultRoot = getDefaultRoot();
//
//    /**
//     * 得到默认保存的根目录
//     *
//     * @returnRprint
//     */
//    private static String getDefaultRoot() {
//        return File.listRoots()[0].getPath();
//    }
//
//    /**
//     * 保存dao的sql到指定文件
//     *
//     * @param fileName
//     * @param content
//     */
//    public static void saveSql(String fileName, String content) {
//        // 如果 isSave 为 true 则保存 ，为false 则不保存。
//        if (isSave) {
//            try {
//                if (fileName == null) {
//                    return;
//                }
//                // 如果以"/"开头的则默认保存在默认的根目录下
//                if (fileName.startsWith("/")) {
//                    fileName = defaultRoot + fileName.substring(1);
//                }
//                FileOperate.saveFile(fileName, content);
//            } catch (Exception e) {
//                System.err.print(fileName + " 保存sql出错 ！！");
//            }
//        }
//    }
//
//
//    /**
//     * 打印 StringBuffer 的拼接字符串
//     *
//     * @param filePath
//     */
//    public static void buildSql(String filePath) {
//        File f = new File(filePath);
//        FileReader fr;
//        try {
//            fr = new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//            String line = new String();
//            line = br.readLine();
//            StringBuffer sb = new StringBuffer();
//            sb.append("StringBuilder query = new StringBuilder(100);\r\n");
//            // boolean is = true;
//            while (line != null) {
//                if (line.contains("'")) {
//                    String targetParam = "";
//                    Pattern pattern = Pattern.compile("'(.+)'");
//                    Matcher matcher = pattern.matcher(line);
//                    if (matcher.find()) {
//                        System.out.println(matcher.group(1));
//                        targetParam = matcher.group(1);
//                    }
//                    String targetParamCamel = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, targetParam);
//                    line = line.replaceAll("'(.+)'", ":" + targetParamCamel);
//                    line = line.replace("values", "VALUES");
//                }
//                sb.append("query.append(\"").append(line).append(" \");\r\n");
//                line = br.readLine();
//            }
//            System.out.println("空格 ：" + sb.toString().replaceAll("  ", " "));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void buildsqlInsert(String filePath) {
//        File f = new File(filePath);
//        FileReader fr;
//        try {
//            fr = new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//            String line = new String();
//            line = br.readLine();
//            line = br.readLine();
//            StringBuffer query = new StringBuffer();
//
//            int initId = 1;
//            while (line != null) {
//                String line1 = br.readLine();
//                // line= line.replaceAll("MMM", "");
//                String[] fields = line.split("\t");
//
//                if (fields.length < 8) {
//                    System.out.println(line);
//                    System.out.println(" what ??? ");
//                }
//                if (fields.length == 8) {
////                ISO二字代码	ISO三字代码	ISO数字代码	国家/地区	首都/省会	面积/km²	人口	洲
//                    String code2 = fields[0];
//                    String code3 = fields[1];
//                    String codeN = fields[2];
//                    String countryEn = fields[3];
//                    String province = fields[4];
//                    String area = fields[5];
//                    String populat = fields[6];
//
//                    String zhouCode = fields[7];
//
//                    String countryCN = line1.split("\t")[3];
//
//                    query.append("INSERT INTO `rep_test`.`country_test` ( ");
//                    query.append(" `code_2`, ");
//                    query.append(" `code_3`, ");
//                    query.append(" `code_n`, ");
//                    query.append(" `country`, ");
//                    query.append(" `country_en`, ");
//                    query.append(" `privince`, ");
//                    query.append(" `area`, ");
//                    query.append(" `population`, ");
//                    query.append(" `zhou` ");
//                    query.append(") ");
//                    query.append("VALUES ");
//                    query.append(" ( ");
//                    query.append("  '" + code2 + "', ");
//                    query.append("  '" + code3 + "', ");
//                    query.append("  '" + codeN + "', ");
//                    query.append("  '" + countryCN + "', ");
//                    query.append("  '" + countryEn + "', ");
//                    query.append("  '" + province + "', ");
//                    query.append("  '" + area + "', ");
//                    query.append("  '" + populat + "', ");
//                    query.append("  '" + zhouCode + "' ");
//                    query.append(" ); ");
//                }
//                line = br.readLine();
//            }
//            System.out.println(query.toString());
//            saveSql("f:/0000testInsertSql.sql", query.toString());
//            // System.out.println(" total + "+initId);
//        } catch (
//                FileNotFoundException e) {
//            System.err.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//            e.printStackTrace();
//        } catch (
//                IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        StringBuilder queryInnerTable = new StringBuilder(100);
//        queryInnerTable.append("AND t.`zh_cn` IN ");
//        queryInnerTable.append(" (SELECT DISTINCT ");
//        queryInnerTable.append("  ( ");
//        queryInnerTable.append("   SUBSTRING_INDEX( ");
//        queryInnerTable.append("    SUBSTRING_INDEX(a.spare2, :?, b.help_topic_id + 1), ");
//        queryInnerTable.append("    :?, ");
//        queryInnerTable.append("    - 1 ");
//        queryInnerTable.append("   ) ");
//        queryInnerTable.append("  ) txt ");
//        queryInnerTable.append(" FROM ");
//        queryInnerTable.append("  privilege.f_column a ");
//        queryInnerTable.append("  JOIN mysql.help_topic b ");
//        queryInnerTable.append("   ON b.help_topic_id < ( ");
//        queryInnerTable.append("    LENGTH(a.spare2) - LENGTH(REPLACE (a.spare2, :?', ')) + 1 ");
//        queryInnerTable.append("   ) ");
//        queryInnerTable.append("   AND a.parent_id IN ( ");
//        queryInnerTable.append("    :3f4c0389924b403d84c065b6ef87cc92 ");
//        queryInnerTable.append("   ) ");
//        queryInnerTable.append("   AND a.is_show = 1 ");
//        queryInnerTable.append("   AND a.`spare2` != '' ");
//        queryInnerTable.append(" UNION ");
//        queryInnerTable.append(" SELECT ");
//        queryInnerTable.append("  cname txt ");
//        queryInnerTable.append(" FROM ");
//        queryInnerTable.append("  privilege.f_column ");
//        queryInnerTable.append(" WHERE parent_id IN ( ");
//        queryInnerTable.append("   :3f4c0389924b403d84c065b6ef87cc92 ");
//        queryInnerTable.append("  ) ");
//        queryInnerTable.append("  AND is_show = 1 ");
//        queryInnerTable.append(" UNION ");
//        queryInnerTable.append(" SELECT ");
//        queryInnerTable.append("  col_default_value txt ");
//        queryInnerTable.append(" FROM ");
//        queryInnerTable.append("  privilege.f_column ");
//        queryInnerTable.append(" WHERE parent_id IN ( ");
//        queryInnerTable.append("   :3f4c0389924b403d84c065b6ef87cc92 ");
//        queryInnerTable.append("  ) ");
//        queryInnerTable.append("  AND is_show = 1 ");
//        queryInnerTable.append(" UNION ");
//        queryInnerTable.append(" SELECT ");
//        queryInnerTable.append("  TEXT txt ");
//        queryInnerTable.append(" FROM ");
//        queryInnerTable.append("  kf_config_constant_text) ");
//
//
//
//        buildSql(System.getProperty("user.dir") + "/src/test/java/com/print/print.txt");
//        buildsqlInsert(System.getProperty("user.dir") + "/src/test/java/com/print/country.txt");
//
//
//    }
//}
