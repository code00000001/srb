package com.it.srb.core.service.impl;

import com.it.srb.core.pojo.entity.UserAccount;
import com.it.srb.core.mapper.UserAccountMapper;
import com.it.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author kebiv
 * @since 2023-08-12
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
