package com.codercampus.Assignment11.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransactionController {
    @GetMapping("/transactions")
    public String getTransactions(Model model) {
        return "transactions";
    }

    @GetMapping("/transactions/{transactionId}")
    public String getTransaction(Model model) {
        return "transactions";
    }
}
