package com.zw.mybatisgenerator.mapper;

import com.zw.mybatisgenerator.domain.AlibabaTradingRecord;
import java.util.List;

public interface AlibabaTradingRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AlibabaTradingRecord record);

    AlibabaTradingRecord selectByPrimaryKey(Integer id);

    List<AlibabaTradingRecord> selectAll();

    int updateByPrimaryKey(AlibabaTradingRecord record);
}