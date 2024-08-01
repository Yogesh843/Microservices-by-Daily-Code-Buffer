package com.dailycodebuffer.user.vo;

import com.dailycodebuffer.user.entity.User;
import lombok.Data;

@Data
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
