package com.aliware.edas.async;

/**
 * Created by yizhan on 2017/12/12.
 */
public interface AsyncEchoService {
    String future(String string);
    String callback(String string);
}
