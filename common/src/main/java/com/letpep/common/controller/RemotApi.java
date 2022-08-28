package com.letpep.common.controller;

import feign.RequestLine;

public interface RemotApi {
    @RequestLine("GET /hello")
    String getHello();
}
