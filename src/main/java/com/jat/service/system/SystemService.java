package com.jat.service.system;

import com.jat.repository.TableRecordPO;
import com.jat.repository.TableRecordRepository;
import com.jat.system.TableRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.List;


@Service
public class SystemService {

    @Autowired
    TableRecordRepository systemRepository;

    public TableRecord save(TableRecord bo){
        TableRecordPO po=boToPo(bo);
        po=systemRepository.save(po);
        TableRecord boResult=poToBo(po);
        po=null;
        return boResult;
    }

    public List<TableRecord> saveAll(List<TableRecord> bos){
        List<TableRecordPO> pos=bosToPos(bos);
        pos=systemRepository.saveAll(pos);
        List<TableRecord> bosResult=posToBos(pos);
        pos=null;
        return bosResult;
    }

    public List<TableRecord> findAll(){
        List<TableRecordPO> pos=systemRepository.findAll();
        List<TableRecord> bos=posToBos(pos);
        pos=null;
        return bos;
    }

    public List<TableRecord> findByTag(String tag){
        List<TableRecordPO> pos=systemRepository.findByt(tag);
        List<TableRecord> bos=posToBos(pos);
        pos=null;
        return bos;
    }

    public List<TableRecord> findByTagAndColumn(String tag,String column){
        List<TableRecordPO> pos=systemRepository.findByTAndC(tag,column);
        List<TableRecord> bos=posToBos(pos);
        pos=null;
        return bos;
    }

    public List<TableRecord> findByTagAndRow(String tag,long row){
        List<TableRecordPO> pos=systemRepository.findByTAndR(tag,row);
        List<TableRecord> bos=posToBos(pos);
        pos=null;
        return bos;
    }

    public Long findMaxIdByTag(String tag){
        Long id= systemRepository.findMaxIdByTag(tag);
        return id==null?0:id;
    }

    public List<Object[]> findDb(){
        return systemRepository.findDb();
    }

    public TableRecord findBy(long id){
        TableRecordPO po=systemRepository.findById(id).orElse(null);
        TableRecord bo=poToBo(po);
        po=null;
        return bo;
    }

    public TableRecord poToBo(TableRecordPO po){
        if(po==null) return null;
        return new TableRecord(po.getId(),po.getRow(),po.getColumn(),po.getValue(),po.getTag());
    }

    public TableRecordPO boToPo(TableRecord bo){
        if(bo==null) return null;
        return new TableRecordPO(bo.getId(),bo.getRow(),bo.getColumn(),bo.getValue(),bo.getTag());
    }

    public List<TableRecord> posToBos(List<TableRecordPO> pos){
        List<TableRecord> bos=new LinkedList<>();
        for(TableRecordPO po:pos){
            if(po!=null) bos.add(poToBo(po));
        }
        return bos;
    }

    public List<TableRecordPO> bosToPos(List<TableRecord> bos){
        List<TableRecordPO> pos=new LinkedList<>();
        for(TableRecord bo:bos){
            if(bo!=null) pos.add(boToPo(bo));
        }
        return pos;
    }

    public Object[] findB1UserByUserName(String userName){
        return systemRepository.findB1UserByUserName(userName);
    }

    public List<Object[]> findB1UserAll(){
        return systemRepository.findB1UserAll();
    }

    public List<Object[]> findB1UserAll(Pageable pageable){
        return systemRepository.findB1UserAll(pageable);
    }

    public List<Object[]> findB3AndTag(long c1,long c2,long c3,String tag){
        return systemRepository.findB3AndTag(c1,c2,c3,tag);
    }

    public List<Object[]> findB3AndTag(long c1,long c2,long c3,String tag,Pageable pageable){
        return systemRepository.findB3AndTag(c1,c2,c3,tag,pageable);
    }

}
