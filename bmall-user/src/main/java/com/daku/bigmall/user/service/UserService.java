package com.daku.bigmall.user.service;

import com.daku.bigmall.user.bean.UmsMember;
import com.daku.bigmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
