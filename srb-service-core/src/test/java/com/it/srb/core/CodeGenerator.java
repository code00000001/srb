package com.it.srb.core;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class CodeGenerator {

    @Test
    public void genCode(){
        //1、创建代码生成器
        AutoGenerator generator = new AutoGenerator();

        //2、全局配置
        GlobalConfig config = new GlobalConfig();
        String propertyPath = System.getProperty("user.dir");
        config.setOutputDir(propertyPath + "/src/main/java");
        config.setAuthor("kebiv");
        config.setOpen(false);
        config.setServiceName("%sService"); // 去掉service的首字母I
        config.setIdType(IdType.AUTO); // 设置主键策略
        config.setSwagger2(true); //开启swagger2模式
        generator.setGlobalConfig(config);

        //3、数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/srb_core?serverTimezone=GMT%2B8&characterEncoding=utf-8");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        dataSourceConfig.setDbType(DbType.MYSQL);
        generator.setDataSource(dataSourceConfig);

        //4、包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.it.srb.core");
        packageConfig.setEntity("pojo.entity");
        generator.setPackageInfo(packageConfig);

        //5、策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel); //数据库表映射到实体的命名策略
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel); //数据库表字段映射到实体的命名策略
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setLogicDeleteFieldName("is_deleted"); //设置逻辑删除字段名
        strategyConfig.setEntityBooleanColumnRemoveIsPrefix(true);
        strategyConfig.setRestControllerStyle(true);
        generator.setStrategy(strategyConfig);

        //6、执行
        generator.execute();

    }
}
