package com.wise.controller;

import org.springframework.core.convert.converter.Converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @描述  自定义日期转换器,将字符串转换成日期类型
 * @包名 com.wise.DateConverter
 * @类名 DateConverter.java
 * @作者  MaWenZhe
 * @创建日期 2017年9月12日
 */
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if (source.contains("-")) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if (source.contains("/")) {
            try {
                return new SimpleDateFormat("yyyy/MM/dd").parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}