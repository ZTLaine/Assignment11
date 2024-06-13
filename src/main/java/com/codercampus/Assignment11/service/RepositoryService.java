package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryService {
    private final TransactionRepository transactionRepository = new TransactionRepository();

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }
}
