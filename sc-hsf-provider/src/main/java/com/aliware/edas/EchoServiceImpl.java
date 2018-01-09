package com.aliware.edas;

import com.alibaba.boot.hsf.annotation.HSFProvider;

/**
 * Created by yizhan on 2017/12/11.
 */
@HSFProvider(serviceInterface = EchoService.class, serviceVersion = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String string) {
        return string;
    }
}
