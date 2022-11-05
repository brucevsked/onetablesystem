package com.jat.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface TableRecordRepository extends JpaRepository<TableRecordPO,Long> {

    List<TableRecordPO> findByt(String tag);
    List<TableRecordPO> findByTAndC(String tag,String column);
    List<TableRecordPO> findByTAndR(String tag,long row);

    @Query(value = "select r,GROUP_CONCAT(case when c=2 then v end SEPARATOR ''),GROUP_CONCAT(case when c=3 then v end SEPARATOR ''),GROUP_CONCAT(case when c=4 then v end SEPARATOR '') from `systemdata1` where t='b1user' group by r",nativeQuery = true)
    List<Object[]> findB1UserAll();

    @Query(value = "select r,GROUP_CONCAT(case when c=2 then v end SEPARATOR ''),GROUP_CONCAT(case when c=3 then v end SEPARATOR ''),GROUP_CONCAT(case when c=4 then v end SEPARATOR '') from `systemdata1` where t='b1user' group by r ",nativeQuery = true)
    List<Object[]> findB1UserAll(Pageable pageable);

    @Query(value = "select r,GROUP_CONCAT(case when c=:c1 then v end SEPARATOR ''),GROUP_CONCAT(case when c=:c2 then v end SEPARATOR ''),GROUP_CONCAT(case when c=:c3 then v end SEPARATOR '') from `systemdata1` where t=:tag group by r",nativeQuery = true)
    List<Object[]> findB3AndTag(@Param("c1") long c1,@Param("c2") long c2,@Param("c3") long c3,@Param("tag") String tag);

    @Query(value = "select r,GROUP_CONCAT(case when c=:c1 then v end SEPARATOR ''),GROUP_CONCAT(case when c=:c2 then v end SEPARATOR ''),GROUP_CONCAT(case when c=:c3 then v end SEPARATOR '') from `systemdata1` where t=:tag group by r",nativeQuery = true)
    List<Object[]> findB3AndTag(@Param("c1") long c1,@Param("c2") long c2,@Param("c3") long c3,@Param("tag") String tag,Pageable pageable);

}
