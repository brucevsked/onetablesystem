package com.jat.service.system;

import com.jat.business.B1User;
import com.jat.system.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    SystemService systemService;

    public List<Database> findAll(){
        List<Object[]> pos=systemService.findDb();
        List<Database> bos=posToBos(pos);
        pos=null;
        return bos;
    }

    public Database poToBo(Object[] po){
        if(po==null) return null;
        return new Database(Long.valueOf(po[0]+""),po[1]+"");
    }

    public List<Database> posToBos(List<Object[]> pos){
        List<Database> bos=new LinkedList<>();
        for(Object[] po:pos){
            if(po!=null)bos.add(poToBo(po));
        }
        return bos;
    }
}
