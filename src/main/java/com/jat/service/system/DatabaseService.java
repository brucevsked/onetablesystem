package com.jat.service.system;

import com.jat.system.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    SystemService systemService;

    //TODO find database list

    public Database poToBo(Object[] po){
        if(po==null) return null;
        return new Database(Long.valueOf(po[0]+""),po[1]+"");
    }
}
