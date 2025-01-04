//package com.alibou.example.practice;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//
//public class Order {
//    @JsonProperty("c-name")
//    private String customerName;
//
//    @JsonProperty("p-name")
//    private String productName;
//
//    @JsonProperty("")
//    private int quantity;
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Order [customerName=" + customerName + ", productName=" + productName + ", quantity="+quantity+"]";
//    }
//}
//
//
////This is the code for controller class if we use this order class
////@PostMapping("/post-order")
////public String post(
////        @RequestBody Order order
////) {
////    return "Request Accepted and order is : " + order.toString();
////}
////
////@PostMapping("/post-order-record")
////public String postRecord(
////        @RequestBody OrderRecord order
////) {
////    return "Request Accepted and order is : " + order.toString();
////}
////
//////    //localhost:8080/hello/anshum
//////    @GetMapping("/hello/{user-name}")//Or we can directly give it the same name as that of the variable with which we want to map it
//////    public String pathVar(
//////            @PathVariable("user-name") String userName
//////    ) {
//////        return "my Value = " + userName;
//////    }
////
////
//////localhost:8080/hello?param_name=paramValue&param_name_2=value_2
////@GetMapping("/hello")//Or we can directly give it the same name as that of the variable with which we want to map it
////public String paramVar(
////        @RequestParam("user-name") String userName,
////        @RequestParam("user-last-name") String userLastName
////) {
////    return "my Value = " + userName + " " + userLastName;
//}