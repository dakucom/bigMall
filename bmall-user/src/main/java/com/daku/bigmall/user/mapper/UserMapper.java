package com.daku.bigmall.user.mapper;

import com.daku.bigmall.user.bean.UmsMember;
import com.daku.bigmall.user.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
