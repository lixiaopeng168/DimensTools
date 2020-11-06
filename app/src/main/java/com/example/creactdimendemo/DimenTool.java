package com.example.creactdimendemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * Created by cdy on 2016/2/3.
 * 快速生成适配工具类
 */
public class DimenTool {
    public final static int defaultDp = 360;

    public static void gen() {
        //以此文件夹下的dimens.xml文件内容为初始值参照
        File file = new File("./app/src/main/res/values/dimens.xml");

        BufferedReader reader = null;
        StringBuilder w240 = new StringBuilder();
        StringBuilder w320 = new StringBuilder();
        StringBuilder w360 = new StringBuilder();
        StringBuilder w384 = new StringBuilder();
        StringBuilder w392 = new StringBuilder();
        StringBuilder w400 = new StringBuilder();
        StringBuilder w410 = new StringBuilder();
        StringBuilder w411 = new StringBuilder();
        StringBuilder w432 = new StringBuilder();
        StringBuilder w480 = new StringBuilder();
        StringBuilder w533 = new StringBuilder();
        StringBuilder w540 = new StringBuilder();
        StringBuilder w592 = new StringBuilder();
        StringBuilder w600 = new StringBuilder();
        StringBuilder w640 = new StringBuilder();
        StringBuilder w662 = new StringBuilder();
        StringBuilder w720 = new StringBuilder();
        StringBuilder w768 = new StringBuilder();
        StringBuilder w800 = new StringBuilder();
        StringBuilder w811 = new StringBuilder();
        StringBuilder w820 = new StringBuilder();
        StringBuilder w960 = new StringBuilder();
        StringBuilder w961 = new StringBuilder();
        StringBuilder w1024 = new StringBuilder();
        StringBuilder w1280 = new StringBuilder();
        StringBuilder w1365 = new StringBuilder();

        try {
            System.out.println("生成不同分辨率：");
            reader = new BufferedReader(new FileReader(file));
            String tempString;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                if (tempString.contains("</dimen>")) {
                    //tempString = tempString.replaceAll(" ", "");

                    String start = tempString.substring(0, tempString.indexOf(">") + 1);

                    String end = tempString.substring(tempString.lastIndexOf("<") - 2);
                    //截取<dimen></dimen>标签内的内容，从>右括号开始，到左括号减2，取得配置的数字
                    Double num = Double.parseDouble
                            (tempString.substring(tempString.indexOf(">") + 1,
                                    tempString.indexOf("</dimen>") - 2));
                    //defaultDp  320 计算
                    //根据不同的尺寸，计算新的值，拼接新的字符串，并且结尾处换行。
//                    w240.append(start).append(num * 0.75).append(end).append("\r\n");
//                    w480.append(start).append(num * 1.5).append(end).append("\r\n");
//                    w600.append(start).append(num * 1.87).append(end).append("\r\n");
//                    w720.append(start).append(num * 2.25).append(end).append("\r\n");
//                    w800.append(start).append(num * 2.5).append(end).append("\r\n");
//                    w820.append(start).append(num * 2.56).append(end).append("\r\n");
//                    System.out.println("num:"+num);

                    w240.append(start).append(countNum(num, 240)).append(end).append("\r\n");
                    w320.append(start).append(countNum(num, 320)).append(end).append("\r\n");
                    w360.append(start).append(countNum(num, 360)).append(end).append("\r\n");
                    w384.append(start).append(countNum(num, 384)).append(end).append("\r\n");
                    w392.append(start).append(countNum(num, 392)).append(end).append("\r\n");
                    w400.append(start).append(countNum(num, 400)).append(end).append("\r\n");
                    w410.append(start).append(countNum(num, 410)).append(end).append("\r\n");
                    w411.append(start).append(countNum(num, 411)).append(end).append("\r\n");
                    w432.append(start).append(countNum(num, 432)).append(end).append("\r\n");
                    w480.append(start).append(countNum(num, 480)).append(end).append("\r\n");
                    w533.append(start).append(countNum(num, 533)).append(end).append("\r\n");
                    w540.append(start).append(countNum(num, 540)).append(end).append("\r\n");
                    w592.append(start).append(countNum(num, 592)).append(end).append("\r\n");
                    w600.append(start).append(countNum(num, 600)).append(end).append("\r\n");
                    w640.append(start).append(countNum(num, 640)).append(end).append("\r\n");
                    w662.append(start).append(countNum(num, 662)).append(end).append("\r\n");
                    w720.append(start).append(countNum(num, 720)).append(end).append("\r\n");
                    w768.append(start).append(countNum(num, 768)).append(end).append("\r\n");
                    w800.append(start).append(countNum(num, 800)).append(end).append("\r\n");
                    w811.append(start).append(countNum(num, 811)).append(end).append("\r\n");
                    w820.append(start).append(countNum(num, 820)).append(end).append("\r\n");
                    w960.append(start).append(countNum(num, 960)).append(end).append("\r\n");
                    w961.append(start).append(countNum(num, 961)).append(end).append("\r\n");
                    w1024.append(start).append(countNum(num, 1024)).append(end).append("\r\n");
                    w1280.append(start).append(countNum(num, 1280)).append(end).append("\r\n");
                    w1365.append(start).append(countNum(num, 1365)).append(end).append("\r\n");
                } else {
                    w240.append(tempString).append("");
                    w320.append(tempString).append("");
                    w360.append(tempString).append("");
                    w384.append(tempString).append("");
                    w392.append(tempString).append("");
                    w400.append(tempString).append("");
                    w410.append(tempString).append("");
                    w411.append(tempString).append("");
                    w432.append(tempString).append("");
                    w480.append(tempString).append("");
                    w533.append(tempString).append("");
                    w540.append(tempString).append("");
                    w592.append(tempString).append("");
                    w600.append(tempString).append("");
                    w640.append(tempString).append("");
                    w662.append(tempString).append("");
                    w720.append(tempString).append("");
                    w768.append(tempString).append("");
                    w800.append(tempString).append("");
                    w811.append(tempString).append("");
                    w820.append(tempString).append("");
                    w960.append(tempString).append("");
                    w961.append(tempString).append("");
                    w1024.append(tempString).append("");
                    w1280.append(tempString).append("");
                    w1365.append(tempString).append("");
                }
                line++;
            }
            reader.close();
            System.out.println("完成:");
//            System.out.println("<!--  w240 -->");
//            System.out.println(w240);
//
//            System.out.println("<!--  w480 -->");
//            System.out.println(w480);
//            System.out.println("<!--  w600 -->");
//            System.out.println(w600);
//            System.out.println("<!--  w720 -->");
//            System.out.println(w720);
//            System.out.println("<!--  w800 -->");
//            System.out.println(w800);


            String sw240file = "./app/src/main/res/values-w240dp/dimens.xml";
            String sw320file = "./app/src/main/res/values-w320dp/dimens.xml";
            String sw360file = "./app/src/main/res/values-w360dp/dimens.xml";
            String sw384file = "./app/src/main/res/values-w384dp/dimens.xml";
            String sw392file = "./app/src/main/res/values-w392dp/dimens.xml";
            String sw400file = "./app/src/main/res/values-w400dp/dimens.xml";
            String sw410file = "./app/src/main/res/values-w410dp/dimens.xml";
            String sw411file = "./app/src/main/res/values-w411dp/dimens.xml";
            String sw432file = "./app/src/main/res/values-w432dp/dimens.xml";
            String sw480file = "./app/src/main/res/values-w480dp/dimens.xml";
            String sw533file = "./app/src/main/res/values-w533dp/dimens.xml";
            String sw540file = "./app/src/main/res/values-w540dp/dimens.xml";
            String sw592file = "./app/src/main/res/values-w592dp/dimens.xml";
            String sw600file = "./app/src/main/res/values-w600dp/dimens.xml";
            String sw640file = "./app/src/main/res/values-w640dp/dimens.xml";
            String sw662file = "./app/src/main/res/values-w662dp/dimens.xml";
            String sw720file = "./app/src/main/res/values-w720dp/dimens.xml";
            String sw768file = "./app/src/main/res/values-w768dp/dimens.xml";
            String sw800file = "./app/src/main/res/values-w800dp/dimens.xml";
            String sw811file = "./app/src/main/res/values-w811dp/dimens.xml";
            String w820file = "./app/src/main/res/values-w820dp/dimens.xml";
            String w960file = "./app/src/main/res/values-w960dp/dimens.xml";
            String w961file = "./app/src/main/res/values-w961dp/dimens.xml";
            String w1024file = "./app/src/main/res/values-w1024dp/dimens.xml";
            String w1280file = "./app/src/main/res/values-w1280dp/dimens.xml";
            String w1365file = "./app/src/main/res/values-w1365dp/dimens.xml";
            //将新的内容，写入到指定的文件中去
            writeFile(sw240file, w240.toString());
            writeFile(sw320file, w320.toString());
            writeFile(sw360file, w360.toString());
            writeFile(sw384file, w384.toString());
            writeFile(sw392file, w392.toString());
            writeFile(sw400file, w400.toString());
            writeFile(sw410file, w410.toString());
            writeFile(sw411file, w411.toString());
            writeFile(sw432file, w432.toString());
            writeFile(sw480file, w480.toString());
            writeFile(sw533file, w533.toString());
            writeFile(sw540file, w540.toString());
            writeFile(sw592file, w592.toString());
            writeFile(sw600file, w600.toString());
            writeFile(sw640file, w640.toString());
            writeFile(sw662file, w662.toString());
            writeFile(sw720file, w720.toString());
            writeFile(sw768file, w768.toString());
            writeFile(sw800file, w800.toString());
            writeFile(sw811file, w811.toString());
            writeFile(w820file, w820.toString());
            writeFile(w960file, w960.toString());
            writeFile(w961file, w961.toString());
            writeFile(w1024file, w1024.toString());
            writeFile(w1280file, w1280.toString());
            writeFile(w1365file, w1365.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static String countNum(double num1, int num2) {
        return keepDecimal(num1 * num2 / defaultDp);
    }

    /**
     * 四舍五入
     */
    public static String keepDecimal(double r) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(4);
// 如果不需要四舍五入，可以使用RoundingMode.DOWN
        nf.setRoundingMode(RoundingMode.UP);
        return nf.format(r);
    }

    /**
     * 写入方法
     */

    public static void writeFile(String file, String text) {
        PrintWriter out = null;
        try {
            String substring = file.substring(0, file.lastIndexOf("/"));
            File f1 = new File(substring);
            if (!f1.exists()) {
                f1.mkdirs();
            }

            out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();
    }

    public static void main(String[] args) {
        gen();
    }


//    public static void main(String[] args) {
//        StringBuilder sw400 = new StringBuilder();
//        //添加xml开始的标签
//        String xmlStart = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
//                "<resources>\n";
//        sw400.append(xmlStart);
//        //添加内容
//        for (int i = 0; i <= 1920; i++) {
////                        此处name后的标签名可以自定义"margin_"随意更改
//            String start = "<dimen name=\"dimen_" + i + "\">";
//            String end = "dp</dimen>";
//            sw400.append(start).append(i).append(end).append("\n");
//        }
//        //添加xml的尾标签
//        sw400.append("</resources>");
//        String sw400file = "./app/src/main/res/values/dimens.xml";
//        writeFile(sw400file, sw400.toString());
//    }

}