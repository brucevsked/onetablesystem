package com.jat.service.system;

import com.jat.system.Database;
import com.jat.test.BaseTestWithTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

public class DatabaseServiceTest extends BaseTestWithTransactional {

    private static final Logger log = LoggerFactory.getLogger(DatabaseServiceTest.class);

    @Autowired
    DatabaseService databaseService;

    @Test
    public void findAll(){
        List<Database> bos=databaseService.findAll();
        log.debug("{}",bos);
        log.debug("{}",bos.size());
    }
}
