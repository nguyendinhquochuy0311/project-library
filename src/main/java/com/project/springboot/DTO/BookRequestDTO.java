package com.project.springboot.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;

@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name="book")
public class BookRequestDTO {
    private String name;

    public boolean inValid(){
        return name == null;
    }
}
