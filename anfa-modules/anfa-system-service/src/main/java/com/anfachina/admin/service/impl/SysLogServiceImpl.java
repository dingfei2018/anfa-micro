package com.anfachina.admin.service.impl;

import com.anfachina.common.constant.CommonConstant;
import com.anfachina.common.entity.SysLog;
import com.anfachina.common.util.Assert;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.anfachina.admin.mapper.SysLogMapper;
import com.anfachina.admin.service.SysLogService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author lengleng
 * @since 2017-11-20
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

    @Override
    public Boolean updateByLogId(Long id) {
        Assert.isNull(id, "日志ID为空");

        SysLog sysLog = new SysLog();
        sysLog.setId(id);
        sysLog.setDelFlag(CommonConstant.STATUS_DEL);
        sysLog.setUpdateTime(new Date());
        return updateById(sysLog);
    }
}
