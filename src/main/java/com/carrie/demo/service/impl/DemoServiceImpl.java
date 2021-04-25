package com.carrie.demo.service.impl;

import com.carrie.demo.service.DemoService;

import javax.jws.WebService;
import java.util.Date;

/**
 * @日期: 2021/4/25
 * @作者: dd
 * @描述:
 */
@WebService(serviceName = "DemoService", // 与接口中指定的name一致
        targetNamespace = "http://service.demo.carrie.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.carrie.demo.service.DemoService"// 接口地址
)
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String user) {
        return user+"，现在时间："+"("+new Date()+")";
    }

}
