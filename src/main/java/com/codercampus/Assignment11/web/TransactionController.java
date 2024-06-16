package com.codercampus.Assignment11.web;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController() {
        transactionService = new TransactionService();
    }

    @GetMapping("/transactions")
    public String getTransactions(Model model) {
        List<Transaction> transactionList = transactionService.findAll();
        model.addAttribute("transactionList", transactionList);

        return "transactions";
    }

    @GetMapping("/transactions/{transactionId}")
    public String getTransaction(@PathVariable Long transactionId, Model model) {
        Transaction transaction = transactionService.findById(transactionId);
        model.addAttribute("transaction", transaction);
        return "transactions";
    }
}
