package com.itlg.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: test <br/>
 * Description: <br/>
 * date: 2022/10/16 17:22<br/>
 *
 * @author Administrator<br />
 */
@RestController
@RequestMapping(value = "/mybatisPlus")
public class test {

    @GetMapping(value = "/testCon")
    public String testGrowth() {
        return "321";
    }

}
