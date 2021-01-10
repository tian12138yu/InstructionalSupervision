package com.tjy.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Author tjy
 * @Date 2020/12/29 21:59
 */

@TableName("course")
public class Course {
    /**
     * 主键ID
     */
    @TableId
    Integer id;

    /**
     *课程名
     */
    String cname;
    /**
     *课程号
     */
    Integer cid;
    /**
     *上课时间1
     */
    String time1;

    String time2;

    String time3;

    String time4;

    String time5;
    /**
     *开始周
     */
    Integer start;
    /**
     *结束周
     */
    Integer end;
    /**
     *学院名
     */
    String departmentname;
    /**
     *专业名
     */
    String majorname;
    /**
     *上课地点
     */
    String address;



}
