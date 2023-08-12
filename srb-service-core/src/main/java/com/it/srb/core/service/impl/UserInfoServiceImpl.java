package com.it.srb.core.service.impl;

import com.it.srb.core.pojo.entity.UserInfo;
import com.it.srb.core.mapper.UserInfoMapper;
import com.it.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author kebiv
 * @since 2023-08-12
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
