package com.mycompany.DbApi.Tables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestezaoTest {

    private Testezao MenorIdade;
    private Testezao MaiorIdade;

    @BeforeEach
    public void setup(){

        MenorIdade = new Testezao(17);
        MaiorIdade = new Testezao(19);

    }

    @Test
    @DisplayName("Should return false when the person age is lower then 18")
    void isMenorIdade() {

        Assertions.assertFalse(MenorIdade.IsMaiorIdade());

    }

    @Test
    @DisplayName("Should return true when the person age is higher then 18")
    void isMaiorIdade() {

        Assertions.assertTrue(MaiorIdade.IsMaiorIdade());

    }
}