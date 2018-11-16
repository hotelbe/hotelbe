

import java.util.ArrayList;
import java.util.List;

/**
 * @project: helloworld
 * @auther: shiwei
 * @date: 2018/11/13 15:46
 * @description: TODO
 */
public class MainTest {
    public  List<Double> list = new ArrayList<>();

    public void populationList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
        System.out.println("Debug Point 2");
    }

    public static void main(String[] args) {
        System.out.println("Debug point 1");
        new MainTest().populationList();
        System.out.println("Debug Ponit 3");
    }
}
