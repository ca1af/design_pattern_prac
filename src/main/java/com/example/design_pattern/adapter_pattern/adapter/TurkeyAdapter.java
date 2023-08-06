package com.example.design_pattern.adapter_pattern.adapter;

import com.example.design_pattern.adapter_pattern.duck.Duck;
import com.example.design_pattern.adapter_pattern.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    // Duck 으로 변형시켜주는 어댑터입니다. 따라서 "원하는" 타입을 상속받아줍니다.
    // 이 어댑터를 사용하면 Turkey 는 Duck 의 타입을 상속하게 되는것이죠.
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) { // 생성자에서 기존 Turkey 객체의 레퍼런스를 가져옵니다.
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 공통 인터페이스 부분입니다. 칠면조와 오리가 공유하지만 다른 인터페이스(행동)입니다.
     * 터키의 fly 는 짧으므로 좀 더 많이 호출해서 오리와 비슷한 거리를 날 수 있도록 조정했습니다.
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
