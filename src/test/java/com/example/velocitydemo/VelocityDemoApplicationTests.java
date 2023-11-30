package com.example.velocitydemo;


import com.example.velocitydemo.entity.User;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

@SpringBootTest
class VelocityDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test() throws IOException {
        //1. 设置velocity的资源加载器
        Properties props = new Properties();
        props.put("file.resource.leader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        //2. 初始化velocity引擎
        Velocity.init(props);
        //3. 创建velocity容器
        VelocityContext context = new VelocityContext();
        context.put("name","Ken");
        //4. 加载velocity模板文件
        Template template = Velocity.getTemplate("src/main/resources/vms/quickstart.vm","utf-8");
        //5. 合并数据到模板
        FileWriter fw = new FileWriter("D:\\WorkSpace\\VelocityDemo\\src\\main\\resources\\html\\quickstart.html");
        template.merge(context,fw);
        //6. 释放资源
        fw.close();
    }

    @Test
    public void test2() throws IOException {
        //1. 设置velocity的资源加载器
        Properties props = new Properties();
        props.put("file.resource.leader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        //2. 初始化velocity引擎
        Velocity.init(props);
        //3. 创建velocity容器
        VelocityContext context = new VelocityContext();
        context.put("name","Ken");
        //4. 加载velocity模板文件
        Template template = Velocity.getTemplate("src/main/resources/vms/cite-variable.vm","utf-8");
        //5. 合并数据到模板
        FileWriter fw = new FileWriter("D:\\WorkSpace\\VelocityDemo\\src\\main\\resources\\html\\variable.html");
        template.merge(context,fw);
        //6. 释放资源
        fw.close();
    }

    @Test
    public void test3() throws IOException {
        //1. 设置velocity的资源加载器
        Properties props = new Properties();
        props.put("file.resource.leader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        //2. 初始化velocity引擎
        Velocity.init(props);
        //3. 创建velocity容器
        VelocityContext context = new VelocityContext();
        User user = new User();
        user.setUsername("Ken");
        user.setPassword("password");
        user.setEmail("123456@qq.com");
        context.put("user",user);
        //4. 加载velocity模板文件
        Template template = Velocity.getTemplate("src/main/resources/vms/cite-field.vm","utf-8");
        //5. 合并数据到模板
        FileWriter fw = new FileWriter("D:\\WorkSpace\\VelocityDemo\\src\\main\\resources\\html\\field.html");
        template.merge(context,fw);
        //6. 释放资源
        fw.close();
    }
    @Test
    public void test4() throws IOException {
        //1. 设置velocity的资源加载器
        Properties props = new Properties();
        props.put("file.resource.leader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        //2. 初始化velocity引擎
        Velocity.init(props);
        //3. 创建velocity容器
        VelocityContext context = new VelocityContext();
        context.put("str","hello word velocity!");
        context.put("now", new Date());
        //4. 加载velocity模板文件
        Template template = Velocity.getTemplate("src/main/resources/vms/method.vm","utf-8");
        //5. 合并数据到模板
        FileWriter fw = new FileWriter("D:\\WorkSpace\\VelocityDemo\\src\\main\\resources\\html\\method.html");
        template.merge(context,fw);
        //6. 释放资源
        fw.close();
    }

    @Test
    public void test6() throws IOException {
        //1. 设置velocity的资源加载器
        Properties props = new Properties();
        props.put("file.resource.leader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        //2. 初始化velocity引擎
        Velocity.init(props);
        //3. 创建velocity容器
        VelocityContext context = new VelocityContext();
        context.put("str","hello word velocity!");
        context.put("now", new Date());
        //4. 加载velocity模板文件
        Template template = Velocity.getTemplate("src/main/resources/vms/instruction-if.vm","utf-8");
        //5. 合并数据到模板
        FileWriter fw = new FileWriter("D:\\WorkSpace\\VelocityDemo\\src\\main\\resources\\html\\if.html");
        template.merge(context,fw);
        //6. 释放资源
        fw.close();
    }

    @Test
    public void test7() throws IOException {
        //1. 设置velocity的资源加载器
        Properties props = new Properties();
        props.put("file.resource.leader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        //2. 初始化velocity引擎
        Velocity.init(props);
        //3. 创建velocity容器
        VelocityContext context = new VelocityContext();
        String [] hobbies = new String[]{"eat","drink","play"};
        context.put("hobbies",hobbies);
        List<User> userList = new ArrayList<>();
        userList.add(new User("Pasky","Haha","LOPPY"));
        userList.add(new User("Bob","Tim","Like"));
        context.put("userList",userList);

        Map<String,Object> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        context.put("map",map);

        //4. 加载velocity模板文件
        Template template = Velocity.getTemplate("src/main/resources/vms/instructions-foreach.vm","utf-8");
        //5. 合并数据到模板
        FileWriter fw = new FileWriter("D:\\WorkSpace\\VelocityDemo\\src\\main\\resources\\html\\foreach.html");
        template.merge(context,fw);
        //6. 释放资源
        fw.close();
    }

}
