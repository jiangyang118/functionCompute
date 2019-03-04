/**
 * Copyright (c) 2019,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:hello
 * Package Name:com.sunego.commerce.hello
 * File Name:HelloFC.java
 * Date:2019年3月4日 下午3:49:24
 * 
 */
package com.sunego.commerce.hello;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.StreamRequestHandler;

/**
 * ClassName: HelloFC <br/>
 * Description: TODO <br/>
 * Date: 2019年3月4日 下午3:49:24 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class HelloFC implements StreamRequestHandler {

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        outputStream.write(("hello world").getBytes());
    }

}
