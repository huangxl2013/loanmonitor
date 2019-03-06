package com.weidai.loanmonitor.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目启动校验
 *
 * @author xujiangjun
 * @since 2019.03.06
 */
@RestController
public class StatusController {

    @RequestMapping(value = "/status.jsp")
    public String status() {
        return "ok!";
    }
}
