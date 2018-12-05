package com.zong.demo.io;

import java.io.*;

public class IOUtil {

    public static void main(String[] args) {
        String filePath = "F:\\IDEA\\file\\iotest.txt";
        getFile2String(filePath);
        file2String(filePath);
    }

    /**
     * 功能描述: <br>
     * 〈〉
     *
     * @return:
     * @since: 1.0.0
     * @Author:18222
     * @Date: 2018-12-05 15:55
     */
    public static String getFile2String(String filePath) {
        File f = new File(filePath);
        InputStream in = null;
        try {
            in = new FileInputStream(f);
            byte[] b = new byte[1024];
            in.read(b);
            System.out.println(new String(b));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String file2String(String filePath) {
        File f = new File(filePath);
        InputStream in = null;
        try {
            in = new FileInputStream(f);
            byte[] b = new byte[1024];
            int len = in.read(b);
            System.out.println("文件长度：" + len);
            System.out.println("文件内容：" + new String(b,0,len));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
