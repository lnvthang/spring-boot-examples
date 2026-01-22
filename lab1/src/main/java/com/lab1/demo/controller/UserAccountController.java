package com.lab1.demo.controller;

import com.lab1.demo.service.IUserAccount;
import com.lab1.demo.util.ConstantDefault;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.lab1.demo.util.ConstantDefault.CROSS_ORIGIN_VALUE;
import static com.lab1.demo.util.ConstantDefault.USER_ACCOUNT;
import static com.lab1.demo.util.ConstantDefault.V1_API_URL;

@Validated
@CrossOrigin(value = CROSS_ORIGIN_VALUE)
@RequestMapping(value = V1_API_URL + USER_ACCOUNT)
@RestController
@RequiredArgsConstructor
public class UserAccountController {

    private final IUserAccount iUserAccount;

    @GetMapping
    public String list(@RequestParam(defaultValue = ConstantDefault.EMPTY, required = false) Boolean status,
                       @RequestParam(defaultValue = ConstantDefault.LIMIT_DEFAULT, required = false) Integer limit,
                       @RequestParam(defaultValue = ConstantDefault.OFFSET_DEFAULT, required = false) Integer offset,
                       @RequestParam(defaultValue = ConstantDefault.DIRECTION_DEFAULT, required = false) String orderDirection,
                       @RequestParam(defaultValue = ConstantDefault.ORDER_BY_DEFAULT, required = false) String orderBy) {
        return "List of user accounts";
    }

    @GetMapping
    public String getUserAccountById(@RequestParam Long id) {
        return "Get user accounts: " + String.valueOf(id);
    }

    @PostMapping
    public String create() {
        return "Create user account";
    }

    @PutMapping
    public String update() {
        return "Update user account";
    }
}
