/**
  * Copyright @ 2015 HoldTime Inner Mongolia Co. Ltd.
  */ 
package com.holdtime.framework;

import org.junit.Test;

import com.holdtime.framework.generator.main.GeneratorCode;

/** 
 * 项目名称： hdCommonV4<br>
 * 功能描述： GeneratorModelTest概述：生成数据库表对应的Model类<br>
 * 创  建 人： guoai<br>
 * 创建日期： 2015年8月14日<br>
 * 修  改 人：  <br>
 * 修改时间：<br>
 * 修改内容：<br>
 * 版      本： 1.0.0
 */
public class GeneratorModelTest {

    @Test
    public void genertorModel(){
        try {
            GeneratorCode.creatModel("tb_user".toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
//    @Test
    /*public void genertorDoc(){
        try {
            GeneratorCode.creatDoc("D:\\hdtmV4.doc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
