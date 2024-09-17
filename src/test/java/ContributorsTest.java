import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {

    @Test

    public void SearchAndreySolncev () {
        Configuration.browserSize = "1920x1200";
//Открыть репозиторию Selenide
        open("https://github.com/selenide/selenide");
//Навести мышь на первого Contributors и сверить текст
        $(".Layout-sidebar").$(byText("Contributors"))
                .ancestor(".BorderGrid-cell").$$("ul li").first()
                .hover();
//Проверить, что там находится Андрей Солнцев, искать только видимый объект и сверить текст
        $$(".Popover").find(visible).shouldHave(text("Andrei Solntsev"));
    }
}
