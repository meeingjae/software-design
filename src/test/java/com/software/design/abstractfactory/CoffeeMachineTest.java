package com.software.design.abstractfactory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("커미 머신 추상 팩토리 테스트")
class CoffeeMachineTest {

    @DisplayName("생성 성공")
    @Test
    void create_machine_success() {
        final CoffeeMachine aCoffeeMachine = new ACoffeeMachine();
        final CoffeeMachine bCoffeeMachine = new BCoffeeMachine();
        final CoffeeMachine cCoffeeMachine = new CCoffeeMachine();
        final CoffeeMachine dCoffeeMachine = new DCoffeeMachine(); // getLatte 메서드 호출 불가
        final LatteCoffeeMachine dLatteMachine = new DCoffeeMachine(); // getLatte 메서드 호출 가능

        assertThat(aCoffeeMachine.getAmericano()).isInstanceOf(AAmericano.class);
        assertThat(bCoffeeMachine.getAmericano()).isInstanceOf(BAmericano.class);
        assertThat(cCoffeeMachine.getAmericano()).isInstanceOf(CAmericano.class);
        assertThat(dCoffeeMachine.getAmericano()).isInstanceOf(DAmericano.class);
        assertThat(dLatteMachine.getLatte()).isInstanceOf(DLatte.class);
    }
}
