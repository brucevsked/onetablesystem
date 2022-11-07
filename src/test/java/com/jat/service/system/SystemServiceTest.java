package com.jat.service.system;

import com.jat.system.TableRecord;
import com.jat.test.BaseTestWithTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.testng.annotations.Test;

import java.util.List;

public class SystemServiceTest extends BaseTestWithTransactional {

    private static final Logger log = LoggerFactory.getLogger(SystemServiceTest.class);

    @Autowired
    SystemService service;

    @Test
    public void findAll(){
        List<TableRecord> bos=service.findAll();
        log.debug("{}",bos);
    }

    @Test
    public void findTag(){
        String tag="s1dataType";
        List<TableRecord> bos=service.findByTag(tag);
        log.debug("{}",bos);
    }

    @Test
    public void findByTagAndColumn(){
        String tag="s5tableColumn";
        String column="tableId";
        List<TableRecord> bos=service.findByTagAndColumn(tag,column);
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }

    @Test
    public void findByTagAndRow(){
        String tag="b1user";
        long row=1L;
        List<TableRecord> bos=service.findByTagAndRow(tag,row);
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }

    @Test
    public void findMaxIdByTag(){
        String tag="b2newType";
        Long maxId=service.findMaxIdByTag(tag);
        log.debug("{}",maxId);
    }

    @Test
    public void findDb(){
        Object[] dbList=service.findDb();
        log.debug("{}",dbList);
    }

    @Test
    public void findB1UserAll(){
        List bos=service.findB1UserAll();
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }

    @Test
    public void findB1UserAllPageable(){
        int page=0;
        int size=3;
        Pageable pageable= PageRequest.of(page,size);
        List bos=service.findB1UserAll(pageable);
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }

    @Test
    public void findB3AndTag(){
        long c1=2;
        long c2=3;
        long c3=4;
        String tag="b1user";
        List bos=service.findB3AndTag(c1,c2,c3,tag);
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }

    @Test
    public void findB3AndTagPageable(){
        long c1=2;
        long c2=3;
        long c3=4;
        String tag="b1user";
        int page=0;
        int size=2;
        Pageable pageable= PageRequest.of(page,size);
        List bos=service.findB3AndTag(c1,c2,c3,tag,pageable);
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }

}
