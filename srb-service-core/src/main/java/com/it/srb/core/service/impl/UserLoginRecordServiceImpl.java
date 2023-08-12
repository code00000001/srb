package com.it.srb.core.service.impl;

import com.it.srb.core.pojo.entity.UserLoginRecord;
import com.it.srb.core.mapper.UserLoginRecordMapper;
import com.it.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author kebiv
 * @since 2023-08-12
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
