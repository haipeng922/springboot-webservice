package com.carrie.demo.service;

import javax.jws.WebService;

/**
 * @日期: 2021/4/25
 * @作者: dd
 * @描述:
 */
@WebService(name = "DemoService", // 暴露服务名称
        targetNamespace = "http://service.demo.carrie.com"// 命名空间,一般是接口的包名倒序
)
public interface DemoService {

    public String sayHello(String user);


}
