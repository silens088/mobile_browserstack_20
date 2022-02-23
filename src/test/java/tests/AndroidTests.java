package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class AndroidTests extends TestBase {

    @Test
    @DisplayName("Проверяем что страница не пустая")
    void searchTest() {
        step("Открыть меню", () ->
                $(MobileBy.AccessibilityId("Search Wikipedia")).click());

        step("Открыть меню", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack"));

        step("Открыть меню", () ->
                $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Проверяем дефолтный язык (EN)")
    void defaultLanguageIsEn() {

        step("Открыть меню", () ->
                $(MobileBy.AccessibilityId("Search Wikipedia")).click());

        step("Проверяем что выбранный язык EN", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/search_lang_button")).shouldHave(Condition.text("EN")));
    }
}

