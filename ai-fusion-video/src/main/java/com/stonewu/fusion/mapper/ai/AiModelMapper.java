package com.stonewu.fusion.mapper.ai;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stonewu.fusion.entity.ai.AiModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AiModelMapper extends BaseMapper<AiModel> {

    int softDeleteById(@Param("id") Long id);

    /**
     * 删除 API 配置时连带删除其下属模型，避免留下无法在设置页管理的孤儿模型。
     */
    int softDeleteByApiConfigId(@Param("apiConfigId") Long apiConfigId);
}
