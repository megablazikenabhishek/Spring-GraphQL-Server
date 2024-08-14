package com.javagraphql.starter.models;

import lombok.Builder;
import lombok.Value;

@Builder
public class Status {
    Boolean success;
    String message;
    String errDetails;
}
