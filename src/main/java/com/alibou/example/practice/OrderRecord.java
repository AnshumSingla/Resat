package com.alibou.example.practice;

public record OrderRecord(
        String customerName,
        String productName,
        int quantity
) {
}
