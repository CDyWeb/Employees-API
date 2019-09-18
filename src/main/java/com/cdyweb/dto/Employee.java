package com.cdyweb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    public Employee(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty
    String uuid;

}
