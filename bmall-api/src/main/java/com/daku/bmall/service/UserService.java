package com.daku.bmall.service;

import com.daku.bmall.bean.UmsMember;
import com.daku.bmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
