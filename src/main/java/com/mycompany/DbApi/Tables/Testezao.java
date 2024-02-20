package com.mycompany.DbApi.Tables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data

public class Testezao {

    @Getter
    private int idade;

    public boolean IsMaiorIdade(){

        return idade > 18;

    }

}
