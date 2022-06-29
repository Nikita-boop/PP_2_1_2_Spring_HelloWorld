import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.print("Compare two items of Hello World: ");
        System.out.println(bean == bean2);

        Cat firstCat = (Cat) applicationContext.getBean("cat");
        Cat secondCat = (Cat) applicationContext.getBean("cat");

        System.out.println(firstCat.getMessage());
        System.out.print("Compare two items of Cat: ");
        System.out.println(firstCat == secondCat);
    }
}