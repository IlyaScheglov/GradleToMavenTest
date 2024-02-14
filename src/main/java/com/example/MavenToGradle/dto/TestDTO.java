package com.example.MavenToGradle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO implements Serializable {

    private long number;

    private String name;

    private boolean trueOrFalse;
}
