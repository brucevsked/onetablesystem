package com.jat.service.business;

import com.jat.business.B1User;
import com.jat.test.BaseTestWithTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.testng.annotations.Test;

import java.util.List;

public class B1UserServiceTest extends BaseTestWithTransactional {

    private static final Logger log = LoggerFactory.getLogger(B1UserServiceTest.class);

    @Autowired
    B1UserService b1UserService;

    @Test
    public void findAll(){
        List<B1User> bos=b1UserService.findAll();
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }

    @Test
    public void findAllPageable(){
        int page=0;
        int size=2;
        Pageable pageable= PageRequest.of(page,size);
        List<B1User> bos=b1UserService.findAll(pageable);
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }
}
