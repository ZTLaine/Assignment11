package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class TransactionService {
    private final RepositoryService repositoryService;
    private List<Transaction> transactions;

    TransactionService(){
        repositoryService = new RepositoryService();
        transactions = repositoryService.findAll();
    }

    public List<Transaction> findAll() {
        return transactions;
    }

    public void sortTransactions() {
        transactions.sort(Comparator.comparing(Transaction::getDate));
    }
}
