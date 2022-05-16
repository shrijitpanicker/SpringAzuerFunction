package com.example;

import com.example.business.Customer;
import com.example.common.Helper;
import com.example.common.HttpService;
import com.example.model.CustomerPlan;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {

    @Mock
    Helper helper;

    @InjectMocks
    HttpService httpService;

    @InjectMocks
    Customer customer;

    @Test
    public void test() {
        CustomerPlan customerPlan = customer.apply("2347067419241");
        assertThat(customerPlan.getStatusCode().compareToIgnoreCase("OK"));
    }




}