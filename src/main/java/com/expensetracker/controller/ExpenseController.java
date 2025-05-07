package com.expensetracker.controller;

import com.expensetracker.model.Expense;
import com.expensetracker.model.User;
import com.expensetracker.service.ExpenseService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    
    private final ExpenseService expenseService;
    
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }
    
    @GetMapping
    public List<Expense> getUserExpenses(@AuthenticationPrincipal User user) {
        return expenseService.getExpensesByUser(user);
    }
    
    @GetMapping("/filter")
    public List<Expense> getExpensesByDateRange(
            @AuthenticationPrincipal User user,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return expenseService.getExpensesByUserAndDateBetween(user, startDate, endDate);
    }
    
    @PostMapping
    public Expense createExpense(@AuthenticationPrincipal User user, @RequestBody Expense expense) {
        expense.setUser(user);
        Expense createdExpense = expenseService.saveExpense(expense);
        return createdExpense;
    }
    
    @PutMapping("/{id}")
    public Expense updateExpense(@AuthenticationPrincipal User user, @PathVariable Long id, @RequestBody Expense expense) {
        expense.setUser(user);
        return expenseService.updateExpense(id, expense);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExpense(@AuthenticationPrincipal User user, @PathVariable Long id) {
        expenseService.deleteExpense(id);
        return ResponseEntity.ok().build();
    }
}