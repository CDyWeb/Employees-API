package com.cdyweb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    @JsonProperty
    String uuid;

    public Employee(String uuid) {
        this.uuid = uuid;
    }
}
