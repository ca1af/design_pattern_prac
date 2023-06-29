# 개요

__Head First Design Patterns__ 

책과 함께 떠나는 디자인 패턴 여행!

직접 구현하고, 정리했습니다.
 
<br>

---

<br>

# 1. 전략 패턴 (Strategy Pattern)
[소스 코드](https://github.com/ca1af/design_pattern_prac/tree/f8b6d18a87025be64b725f4cad591e5c34ea8a3a/src/main/java/com/example/design_pattern/strategy_pattern)

### 한줄평 : "바뀌는 부분은 바뀌지 않는 부분과 분리해서 관리하라!
<br>


<img src="https://velog.velcdn.com/images/calaf/post/3d259fef-9522-4f7a-ac13-e3ad6ab7c934/image.jpg" width="450px" height="300px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img>

### 오리와 함께 실습한 : [전략 패턴 정리](https://velog.io/@calaf/1.-%EC%A0%84%EB%9E%B5-%ED%8C%A8%ED%84%B4-Strategy-Pattern)

> ## ***전략 패턴?***
>  알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해줍니다. 
> 
> 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경 할 수 있습니다.
<br>

---

<br>

# 2. 옵저버 패턴 (Observer Pattern)

### 한줄 평 : "객체의 다형성을 위해 상속이 아닌 구상을 사용하고, 느슨한 결합을 목표하자"
<br>

[소스 코드](https://github.com/ca1af/design_pattern_prac/tree/f8b6d18a87025be64b725f4cad591e5c34ea8a3a/src/main/java/com/example/design_pattern/observer_pattern)

<img src="https://velog.velcdn.com/images/calaf/post/79e9222b-525a-4c45-89ce-2e0cd1d60b61/image.png" width="450px" height="300px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img>

### 느슨한 결합을 위해! : [옵저버 패턴 정리](https://velog.io/@calaf/2.-%EC%98%B5%EC%A0%80%EB%B2%84-%ED%8C%A8%ED%84%B4Observer-Pattern)

> ## ***옵저버 패턴?***
>  객체의 상태 변화를 관찰하는 관찰자들,
> 
> 즉 옵저버들의 목록을 객체에 "구성"하여
> 
> 상태 변화가 있을 때마다
> 
> 메서드 등을 통해 객체가 직접
> 
> 목록의 각 옵저버에게 통지하도록 하는 디자인 패턴 ( 혹은 목록의 각 옵저버 스스로 업데이트 할 수 있음! )

---

<br>

# 3. 데코레이터 패턴 (Decorator Pattern)

### 한줄평 : "객체의 유연한 확장을 위해 데코레이터 패턴을 고려 할 수 있다"
<br>

[소스 코드](https://github.com/ca1af/design_pattern_prac/tree/f8b6d18a87025be64b725f4cad591e5c34ea8a3a/src/main/java/com/example/design_pattern/decorator_pattern)

<img src="https://velog.velcdn.com/images/calaf/post/af512aef-4dd4-417c-829a-3968cb5a7de0/image.png" width="450px" height="300px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img>

### 야돈이 야도란이 됐다? : [데코레이터 패턴 정리](https://velog.io/@calaf/3.-%EB%8D%B0%EC%BD%94%EB%A0%88%EC%9D%B4%ED%84%B0-%ED%8C%A8%ED%84%B4-Decorator-Pattern)

---

<br>

# 4. 팩토리 매서드 패턴 (Factory Method Pattern)

### 한줄평 : "인스턴스의 복잡한 생성 로직을 분리한다!"
<br>

[소스 코드](https://github.com/ca1af/design_pattern_prac/tree/c23a1aa6f9cca31f254741668e8b3b55fb0e8c97/src/main/java/com/example/design_pattern/factory_pattern)

<img src="https://velog.velcdn.com/images/calaf/post/fe6cf21a-77cb-4dc0-99cd-df10dc7eac22/image.jpeg" width="450px" height="300px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img>

### 인스턴스 생성 간다잇~! : [팩토리 매서드 패턴 정리](https://velog.io/@calaf/4.-%ED%8C%A9%ED%86%A0%EB%A6%AC-%EB%A7%A4%EC%86%8C%EB%93%9C-%ED%8C%A8%ED%84%B4-Factory-Method-Pattern)

> ## ***팩토리 매서드 패턴?***
>  객체를 생성할 때 필요한 "인터페이스"(방법) 을 만듭니다.
>
> 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정합니다.
>
> 팩토리 매서드 패턴을 사용하면, 클래스 인스턴스 만드는 일을 서브클래스에 위임하게 됩니다.
<br>
