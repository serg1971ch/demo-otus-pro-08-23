package bridge.problem;

public interface Shape {

    /*
     Метод абстракции не знает с какой конкретно имплементаций он работает.
     Он узнает этот только в рантайме, поэтому работает только с другими
     абстракциями
     */
    void draw();
}