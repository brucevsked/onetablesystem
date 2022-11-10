package com.jat.service.business;

import com.jat.business.B1User;
import com.jat.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

@Service
public class B1UserService {

    @Autowired
    SystemService systemService;

    public B1User findByUserName(String userName){
        Object[] po= systemService.findB1UserByUserName(userName);
        B1User bo=poToBo1(po);
        po=null;
        return bo;
    }

    public List<B1User> findAll(){
        long c1=2;
        long c2=3;
        long c3=4;
        String tag="b1user";
        List<Object[]> pos=systemService.findB3AndTag(c1,c2,c3,tag);
        List<B1User> bos=posToBos(pos);
        pos=null;
        return bos;
    }

    public List<B1User> findAll(Pageable pageable){
        long c1=2;
        long c2=3;
        long c3=4;
        String tag="b1user";
        List<Object[]> pos=systemService.findB3AndTag(c1,c2,c3,tag,pageable);
        List<B1User> bos=posToBos(pos);
        pos=null;
        return bos;
    }

    public B1User poToBo1(Object[] po){
        if(po==null || po.length==0) return null;
        Object[] user= (Object[]) po[0];
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return new B1User(Long.valueOf(user[0]+""),user[1]+"",user[2]+"", LocalDate.parse(user[3]+"",dtf));
    }

    public B1User poToBo(Object[] po){
        if(po==null) return null;
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return new B1User(Long.valueOf(po[0]+""),po[1]+"",po[2]+"", LocalDate.parse(po[3]+"",dtf));
    }

    public List<B1User> posToBos(List<Object[]> pos){
        List<B1User> bos=new LinkedList<>();
        for(Object[] po:pos){
            if(po!=null)bos.add(poToBo(po));
        }
        return bos;
    }


}
