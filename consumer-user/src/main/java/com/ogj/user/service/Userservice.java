package com.ogj.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ogj.ticket.service.TicketService;

import org.springframework.stereotype.Service;

@Service
public class Userservice {

    @Reference
    private TicketService ticketService;

    public void ticket() {
        String string = ticketService.getTicket();
        System.out.println("买到了票：" + string);
    }
}
